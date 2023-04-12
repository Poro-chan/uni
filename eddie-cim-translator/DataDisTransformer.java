package eddie.energy.transformer;

import schemas.eu.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.UUID;

public class DataDisTransformer extends AbstractVhcdTransformer {

    ConsumosFile consumos;
    final JAXBContext spanishContext = JAXBContext.newInstance(ConsumosFile.class, ConsumosType.class);
    final Unmarshaller spanishContextUnmarshaller = spanishContext.createUnmarshaller();
    final SimpleDateFormat spanishDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    public DataDisTransformer() throws JAXBException {
    }

    @Override
    public void loadFromFile(File file) throws FileNotFoundException, JAXBException {
        consumos = (ConsumosFile) spanishContextUnmarshaller.unmarshal(new FileInputStream(file)); //"./src/test/resources/ES/daily_consumption.xml"));
    }

    @Override
    public void loadReceivedData(String receivedData) throws JAXBException {
        consumos = (ConsumosFile) spanishContextUnmarshaller.unmarshal(new StringReader(receivedData));
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData) throws JAXBException, ParseException {
        loadReceivedData(receivedData);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(File file) throws JAXBException, FileNotFoundException, ParseException {
        loadFromFile(file);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument() throws ParseException {
        MyEnergyDataMarketDocument doc = new MyEnergyDataMarketDocument();

        doc.setMRID(UUID.randomUUID().toString());
        doc.setSenderMarketParticipantMarketRoleType("MDA");
        doc.setSenderMarketParticipantName("?");
        doc.setReceiverMarketParticipantMarketRoleType("EP");
        doc.setReceiverMarketParticipantName("?");

        TimeSeries ts = new TimeSeries();
        ts.setMRID(UUID.randomUUID().toString());
        ts.setMeasurementUnitName("KWh"); // TODO define set of possible values
        ts.setProduct("Electricity"); // TODO define enum

        String cups = null;

        int position = 1;

        for(ConsumosType ct : consumos.getConsumosList()) {
            cups = ct.getCUPS();

            String fecha = ct.getFecha();

            String hour = ct.getHora();

            Date dt = spanishDateFormat.parse(fecha + " " + hour);

            SeriesPeriod period = new SeriesPeriod();

            ESMPDateTimeInterval intv = new ESMPDateTimeInterval();
            intv.setEnd(dateFormatter.format(dt));
            intv.setStart(dateFormatter.format(Date.from(dt.toInstant().minus(Duration.ofHours(1)))));
            period.setTimeInterval(intv);

            Point point = new Point();

            point.setPosition(position++);

            float qty = Float.parseFloat(ct.getConsumoKWh().replace(",","."));

            if(qty < 0) {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty*-1));
                point.setOutQuantityQuality(ct.getMetodoObtencion()); // TODO normalise values
            } else {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty));
                point.setOutQuantityQuality(ct.getMetodoObtencion()); // TODO normalise values
            }

            period.getPoint().add(point);

            ts.getPeriod().add(period);
        }

        MeasurementPointIDString mpid = new MeasurementPointIDString();
        mpid.setCodingScheme("ES_CUPS");
        mpid.setValue(cups);
        MarketEvaluationPoint ep = new MarketEvaluationPoint();
        ep.setMRID(mpid);
        ts.getMarketEvaluationPoint().add(ep);

        doc.getTimeSeries().add(ts);

        return doc;
    }
}
