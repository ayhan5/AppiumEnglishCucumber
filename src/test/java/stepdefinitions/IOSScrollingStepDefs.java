package stepdefinitions;

import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.HashMap;

public class IOSScrollingStepDefs {
     AllPages elements = new AllPages();
    @Then("scroll on ios")
    public void scroll_on_ios() {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("value", "");
        Driver.getAppiumDriver().executeScript("mobile:scroll", scrollObject);
    }

    @When("user scroll and clicks on Toolbars")
    public void userScrollAndClicksOnToolbars() {
        IOSDriver driver = (IOSDriver) Driver.getAppiumDriver();
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("value", "");
        driver.executeScript("mobile:scroll", scrollObject);
        elements.homePage().toolBarsButton.click();
    }

    @When("user click on {string} page on IOS")
    public void userClickOnPageOnIOS(String pageName) {
        ReusableMethods.clickOnPageIOSDevice(pageName);
    }
}
