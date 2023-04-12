package energy.eddie.cimtranslator;

import eddie.energy.transformer.AbstractVhcdTransformer;
import eddie.energy.transformer.DataDisTransformer;
import org.junit.jupiter.api.Test;
import schemas.eu.MyEnergyDataMarketDocument;

import java.io.File;

public class TestSpanishTranslation {

    @Test
    public void testDailyValues() throws Exception {
        DataDisTransformer dataDisTransformer = new DataDisTransformer();

        MyEnergyDataMarketDocument doc = dataDisTransformer.getMappedMarketDocument(new File("./src/test/resources/ES/daily_consumption.xml"));

        System.out.println(AbstractVhcdTransformer.getDocAsString(doc));
    }
}
