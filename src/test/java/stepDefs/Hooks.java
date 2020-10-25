package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;


    @Before
    public void setup() {


    }




    @After
    public void tearDown() {
        driver.quit();
    }
}
