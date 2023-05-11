package energy.eddie.cimtranslator;

import eddie.energy.transformer.AbstractVhcdTransformer;
import eddie.energy.transformer.EdaCcmTransformer;
import org.junit.jupiter.api.Test;
import schemas.eu.MyEnergyDataMarketDocument;

import java.io.File;

public class TestItalianTranslation {

    @Test
    public void testDailyValues() throws Exception {
        ItalianTransformer italianTransformer = new ItalianTransformer();

        MyEnergyDataMarketDocument doc = italianTransformer.getMappedMarketDocument(new File("./src/test/resources/IT/11122233344_44445555666_202012_RFO2G_20210114160110_1DP9999_NR.xml"));

        System.out.println(AbstractVhcdTransformer.getDocAsString(doc));
    }
}
