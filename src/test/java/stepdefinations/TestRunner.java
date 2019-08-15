package stepdefinations;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features="src\\main\\java\\featurefiles",
        features={"src/test/resources/featurefiles/COCO.feature"},
        glue={"stepdefinations"},
        plugin = {"pretty"}
)
public class TestRunner {
}
