package parentTest;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.LoggerWrapper;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        monochrome = true,
        plugin = { "html:target/cucumber-html-report" }

)
public class ParentRunnerTest {

    public static Logger LOG = LoggerWrapper.loggerForThisClass();
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void beforeClassInRunner(){
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Run Cucumber Feature", dataProvider = "features")
    public void feature(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper){
        LOG.info("Feature: " + pickleWrapper.getPickle().getName() + " is going to execute");
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideScenarios();
    }

}
