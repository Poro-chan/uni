package eddie.energy.transformer;

import org.json.simple.parser.ParseException;
import schemas.eu.*;
import schemas.region.it.DettaglioMisuraRFOv2Type;
import schemas.region.it.FlussoMisureType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.lang.reflect.Method;

public class ItalianTransformer extends AbstractVhcdTransformer{

    FlussoMisureType consumptionRecord;
    final JAXBContext italianContext = JAXBContext.newInstance(FlussoMisureType.class);
    final Unmarshaller italianContextUnmarshaller = italianContext.createUnmarshaller();
    final SimpleDateFormat italianDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    protected ItalianTransformer() throws JAXBException {
    }

    @Override
    public void loadFromFile(File file) throws IOException, JAXBException, ParseException {
        consumptionRecord = (FlussoMisureType) italianContextUnmarshaller.unmarshal(new FileInputStream(file));
    }

    @Override
    public void loadReceivedData(String receivedData) throws JAXBException, ParseException {
        consumptionRecord = (FlussoMisureType) italianContextUnmarshaller.unmarshal(new StringReader(receivedData));
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(File file) throws JAXBException, IOException, java.text.ParseException, ParseException {
        loadFromFile(file);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData) throws JAXBException, java.text.ParseException, ParseException {
        loadReceivedData(receivedData);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument() throws java.text.ParseException {
        MyEnergyDataMarketDocument doc = new MyEnergyDataMarketDocument();

        doc.setMRID("MRID");
        doc.setSenderMarketParticipantMarketRoleType(Integer.toString(consumptionRecord.getIdentificativiFlusso().getPIvaDistributore()));
        doc.setSenderMarketParticipantName("MDA");
        doc.setReceiverMarketParticipantMarketRoleType("EP");
        doc.setReceiverMarketParticipantName(Integer.toString(consumptionRecord.getIdentificativiFlusso().getPIvaUtente()));

        TimeSeries ts = new TimeSeries();
        ts.setMRID(UUID.randomUUID().toString());
        ts.setMeasurementUnitName("KWh");
        ts.setProduct("Electricity");

        String cups = null;

        int position = 1;

        Integer starthour = 0;
        Integer endhour = 0;
        Integer start = 0;
        Integer end = 15;
        int help = 0;

        for(DettaglioMisuraRFOv2Type wert : consumptionRecord.getDatiPod().getMisura()) {
            if(help == 0) {
                help += 1;
                continue;
            }

            SeriesPeriod period = new SeriesPeriod();

            ESMPDateTimeInterval intv = new ESMPDateTimeInterval();

            //Get end and start times as string
            String starttime;
            String endtime;
            if(starthour < 10) {
                starttime = "0";
            }
            if(start == 0) {
                starttime = starttime + starthour.toString() + ":0" + start.toString();
            }
            else {
                starttime = starttime + starthour.toString() + ':' + start.toString();
            }
            if(endhour < 10) {
                endtime = "0";
            }
            if(end == 0) {
                endtime = endtime + endhour.toString() + ":0" + end.toString();
            }
            else {
                endtime = endtime + endhour.toString() + ':' + end.toString();
            }

            //Set end and start times
            intv.setStart(starttime);
            intv.setEnd(endtime);
            period.setTimeInterval(intv);

            //Get new end and start times
            start += 15;
            end += 15;
            if(start == 60) {
                start = 0;
                starthour +=1;
            }
            if(end == 60) {
                end = 0;
                endhour += 1;
            }

            Point point = new Point();
            point.setPosition(position++);

            String name = "getE" + help;
            Method method = EnergiaType.class.getDeclaredMethod(name, null);

            float qty = Float.parseFloat(method.invoke(null, ""); //TODO fertig??

            if(qty < 0) {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty*-1));
                point.setOutQuantityQuality();
            } else {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty));
                point.setOutQuantityQuality();
            }

            period.getPoint().add(point);

            ts.getPeriod().add(period);
            help += 1;
        }

        MeasurementPointIDString mpid = new MeasurementPointIDString();
        mpid.setCodingScheme("ITCode");
        mpid.setValue(consumptionRecord.getDatiPod().getPod());
        MarketEvaluationPoint ep = new MarketEvaluationPoint();
        ep.setMRID(mpid);
        ts.getMarketEvaluationPoint().add(ep);

        doc.getTimeSeries().add(ts);
        return doc;
    }
}
