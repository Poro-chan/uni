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
import java.io.IOException;
import java.io.StringReader;
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

        doc.setMRID("Dummy Value");
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

        int starthour = 00;
        int endhour = 00;
        int start = 00;
        int end = 15;

        for(DettaglioMisuraRFOv2Type wert : consumptionRecord.getDatiPod().getMisura()) {
            SeriesPeriod period = new SeriesPeriod();

            ESMPDateTimeInterval intv = new ESMPDateTimeInterval();
            wert.getEa().get(0);

            //Get end and start times as string
            String starttime = ''
            String endtime = ''
            if(starthour < 10) {
                starttime = '0' + starthour.toString() + ':' + start.toString();
            }
            else {
                starttime = starthour.toString() + ':' + start.toString();
            }
            if(endhour < 10) {
                endtime = '0' + endhour.toString() + ':' + start.toString();
            }
            else {
                endtime = endhour.toString() + ':' + start.toString();
            }

            //Set end and start times
            intv.setStart(starttime);
            intv.setEnd(endtime);
            period.setTimeInterval(intv);

            //Get new end and start times
            start += 15;
            end += 15;
            if(start == 60) {
                start = 00;
                starthour +=1;
            }
            if(end == 60) {
                end = 00;
                endhour += 1;
            }

            Point point = new Point();
            point.setPosition(position++);

            String function name = "getE" + wert;
            Method method = Main.class.getDeclaredMethod(name);

            float qty = Float.parseFloat(wert.getEa().get(0).method.invoke(); //TODO fertig??

            period.getPoint().add(point);

            ts.getPeriod().add(period);
        }

        MeasurementPointIDString mpid = new MeasurementPointIDString();
        mpid.setCodingScheme("ITCode");
        mpid.setValue(consumptionRecord.getDatiPod().getPod(); //TODO fertig??
        MarketEvaluationPoint ep = new MarketEvaluationPoint();
        ep.setMRID(mpid); //TODO
        ts.getMarketEvaluationPoint().add(ep);

        doc.getTimeSeries().add(ts);
        return doc;
    }
}
