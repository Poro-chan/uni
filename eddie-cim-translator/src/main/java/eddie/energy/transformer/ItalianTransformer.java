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

        for(DettaglioMisuraRFOv2Type wert : consumptionRecord.getDatiPod().getMisura()) {
            SeriesPeriod period = new SeriesPeriod();

            ESMPDateTimeInterval intv = new ESMPDateTimeInterval();
            wert.getEa().get(0);
            period.setTimeInterval(intv);

            Point point = new Point();

            point.setPosition(position++);

            float qty = Float.parseFloat(wert.getEa().get(0).getE1()); //TODO

            period.getPoint().add(point);

            ts.getPeriod().add(period);
        }
        return doc;
    }
}
