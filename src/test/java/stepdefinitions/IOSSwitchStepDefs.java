package stepdefinitions;

import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
import pages.AllPages;
import utilities.Driver;
import java.util.HashMap;

public class IOSSwitchStepDefs {
    AllPages elements = new AllPages();

    @When("user clicks on Switches in simulator")
    public void user_clicks_on_switches_in_simulator() {
        IOSDriver driver = (IOSDriver) Driver.getAppiumDriver();
        HashMap<String ,Object> scrollObject = new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("value","Switches");
        driver.executeScript("mobile:scroll",scrollObject);

        elements.homePage().switchesButton.click();
    }

    @When("user switched on first switch button")
    public void user_switched_on_first_switch_button() {
     if (elements.switchesPage().firstSwitchButton.getText().equals("0")){
         elements.switchesPage().firstSwitchButton.click();
     }
    }

    @Then("verify it is switched on")
    public void verify_it_is_switched_on() {
        assertEquals("1",elements.switchesPage().firstSwitchButton.getText());
    }

    @Then("user switched off second switch button")
    public void user_switched_off_second_switch_button() {
       if (elements.switchesPage().secondSwitchButton.getText().equals("1")){
           elements.switchesPage().secondSwitchButton.click();
       }
    }

    @Then("verify it is switched off")
    public void verify_it_is_switched_off() {
        assertEquals("0",elements.switchesPage().secondSwitchButton.getText());
    }

}
