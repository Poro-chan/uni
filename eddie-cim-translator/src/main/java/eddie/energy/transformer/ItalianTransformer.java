package eddie.energy.transformer;

import org.json.simple.parser.ParseException;
import schemas.eu.MyEnergyDataMarketDocument;
import schemas.region.it.FlussoMisureType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;

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

        return doc;
    }
}
