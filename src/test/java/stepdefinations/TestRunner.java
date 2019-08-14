package stepdefinations;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src\\main\\java\\featurefiles",
        glue="src\\test\\java\\stepdefinations"
)
public class TestRunner {
}
