package eddie.energy.transformer;

import schemas.eu.MyEnergyDataMarketDocument;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public interface IVhcdTransformer {

    public void loadFromFile(File file) throws IOException, JAXBException, org.json.simple.parser.ParseException;

    public void loadReceivedData(String receivedData) throws JAXBException, org.json.simple.parser.ParseException;

    public MyEnergyDataMarketDocument getMappedMarketDocument(File file) throws JAXBException, IOException, ParseException, org.json.simple.parser.ParseException;

    public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData) throws JAXBException, ParseException, org.json.simple.parser.ParseException;

    public MyEnergyDataMarketDocument getMappedMarketDocument() throws ParseException;

}
