package eddie.energy.transformer;


import schemas.eu.MyEnergyDataMarketDocument;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException, ParseException, org.json.simple.parser.ParseException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        ItalianTransformer edaCcmTransformer = new ItalianTransformer();

        MyEnergyDataMarketDocument doc = edaCcmTransformer.getMappedMarketDocument(new File("./src/test/resources/IT/01234567890_12345678901_201705_RNO2G_20181115060501_1DP0001_R.xml"));

        FileWriter fileWriter = new FileWriter("italian_test_data.xml");
        String newFile = AbstractVhcdTransformer.getDocAsString(doc);
        fileWriter.write(newFile);
        fileWriter.close();
    }
}