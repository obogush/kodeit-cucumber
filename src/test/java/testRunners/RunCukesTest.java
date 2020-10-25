package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"stepDefs"},
        // plugin = {"pretty", "html:target/mycuke-reporthtml","json:target/mycucumber.json"}
        plugin = {"pretty", "json:target/cucumber.json"}
)

public class RunCukesTest {
}
