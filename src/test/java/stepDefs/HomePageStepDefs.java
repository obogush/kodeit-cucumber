package stepDefs;

import PageFactory.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefs {
    HomePage homePage;
    WebDriver driver;

    public HomePageStepDefs(WebDriver driver) {
        this.driver = driver;
    }

    @Then("^I am on home page$")
    public void home_page(){
        homePage = new HomePage(driver);
    }


    @When("^I click on Practice$")
    public void i_click_on_Practice() {
        homePage.clickPractice();
    }

    @Then("^I validate enrollNow is displayed$")
    public void i_validate_enroll(){
        homePage.isEnrollNowDisplayed();
    }


    @And("^I valide homepage source is \"([^\"]*)\"$")
    public void i_validate(String expSrc){
        homePage.validateHomeScr(expSrc);
    }
}
