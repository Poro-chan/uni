package energy.eddie.cimtranslator;

import eddie.energy.transformer.AbstractVhcdTransformer;
import eddie.energy.transformer.EdaCcmTransformer;
import eddie.energy.transformer.ItalianTransformer;
import org.junit.jupiter.api.Test;
import schemas.eu.MyEnergyDataMarketDocument;

import java.io.File;

public class TestItalianTranslation {

    @Test
    public void testDailyValues() throws Exception {
        ItalianTransformer edaCcmTransformer = new ItalianTransformer();

        MyEnergyDataMarketDocument doc = edaCcmTransformer.getMappedMarketDocument(new File("./src/test/resources/IT/01234567890_12345678901_201705_RNO2G_20181115060501_1DP0001_R.xml"));

        System.out.println(AbstractVhcdTransformer.getDocAsString(doc));
    }
}
