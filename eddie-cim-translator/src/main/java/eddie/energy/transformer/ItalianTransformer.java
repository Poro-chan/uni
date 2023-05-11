package eddie.energy.transformer;

import org.json.simple.parser.ParseException;
import schemas.eu.*;
import schemas.region.it.DettaglioMisuraRFOv2Type;
import schemas.region.it.EnergiaType;
import schemas.region.it.FlussoMisureType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class ItalianTransformer extends AbstractVhcdTransformer{

    FlussoMisureType consumptionRecord;
    final JAXBContext italianContext = JAXBContext.newInstance(FlussoMisureType.class);
    final Unmarshaller italianContextUnmarshaller = italianContext.createUnmarshaller();
    final SimpleDateFormat italianDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    public ItalianTransformer() throws JAXBException {
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
    public MyEnergyDataMarketDocument getMappedMarketDocument(File file) throws JAXBException, IOException, java.text.ParseException, ParseException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        loadFromFile(file);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData) throws JAXBException, java.text.ParseException, ParseException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        loadReceivedData(receivedData);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument() throws java.text.ParseException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
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
        int help = 1;

        for(EnergiaType wert : consumptionRecord.getDatiPod().getMisura().getEa()) {
            while(help < 97) {
                SeriesPeriod period = new SeriesPeriod();

                ESMPDateTimeInterval intv = new ESMPDateTimeInterval();

                //Get end and start times as string
                String starttime = "";
                String endtime = "";
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
                    endtime = endtime + endhour + ':' + end;
                }

                //Set end and start times
                intv.setStart(starttime);
                intv.setEnd(endtime);
                period.setTimeInterval(intv);

                //Get new end and start times for the data
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
                String value = wert.getClass().getMethod(name).invoke(wert);
                value = value.replace(',', '.');

                float qty = Float.parseFloat(value);

                point.setOutQuantityQuantity(BigDecimal.valueOf(qty));

                period.getPoint().add(point);

                ts.getPeriod().add(period);
                help++;
            }
        }

        MeasurementPointIDString mpid = new MeasurementPointIDString();
        mpid.setCodingScheme("ITCode");
        mpid.setValue(consumptionRecord.getDatiPod().getPod()); //TODO fertig??
        MarketEvaluationPoint ep = new MarketEvaluationPoint();
        ep.setMRID(mpid); //TODO
        ts.getMarketEvaluationPoint().add(ep);

        doc.getTimeSeries().add(ts);
        return doc;
    }
}
