package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.Driver2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
public class OzlemStepDefinitions {
    OzlemStepDefinitions homePage;
    static WebDriver driver = Driver2.driver("chrome");
    public OzlemStepDefinitions(){}
    public OzlemStepDefinitions(WebDriver driver) {
        OzlemStepDefinitions.driver = driver;
    }
    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        driver = OzlemStepDefinitions.driver;
        // give driver (find elements functions) some time to search for elements in html dom area
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // make the windows full screen
        driver.manage().window().maximize();
        // open the web page
        driver.get("https://letskodeit.teachable.com");
    }
    @Then("^I test the website title$")
    public void i_test_the_website_title() throws Throwable {
        String expected = driver.getTitle();
        String actual = "Home | Let's Kode It";
        System.out.println("Expected : " + expected); // just for checking out the title
        System.out.println("Actual : " + actual);
    }
    @Then("^I validate title is correct$")
    public void i_validate_title_is_correct() throws Throwable {
        String expected = driver.getTitle();
        String actual = "Home | Let's Kode It";
        // compare two objects if they both have the same value.
        Assert.assertEquals(actual, expected);
    }
    @Then("^I close the browser windows$")
    public void i_close_the_browser_windows() throws Throwable {
        driver.quit();
    }
}
