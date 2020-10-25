package testRunners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/ozlem.feature",
        glue = {"stepDefs"},
       //  plugin = {"pretty", "html:target/reporthtml","json:target/mycucumber.json"}
        plugin = {"pretty", "json:target/cucumber.json"}
)

public class RunCukesTest {
}
