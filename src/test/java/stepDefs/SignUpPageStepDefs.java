package stepDefs;

import managers.Driver2;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpPageStepDefs {

    // driver object is already setup when we call it from Driver2 class
    static WebDriver driver = Driver2.driver("chrome");


    @BeforeSuite()
    public void setup()
    {
        // give driver (find elements functions) some time to search for elements in html dom area
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // make the windows full screen
        driver.manage().window().maximize();

        // open the web page
        driver.get("https://letskodeit.teachable.com");
    }

    @AfterSuite()
    public void tearDown()
    {
        // close all tabs and if there is a missing reference don't close it
        if (driver != null) driver.quit();
    }


//    @Test
//    public void connectiontest()
//    {
//        driver.get("https://letskodeit.teachable.com");
//    }

    @Test
    public void titleTest() {
        String expected = driver.getTitle();
        System.out.println("Expected title: " + expected); // just for checking out the title
        String actual = "Home | Let's Kode It";

        // compare two objects if they both have the same value.
        Assert.assertEquals(actual, expected);
    }
}

// Test github branch
