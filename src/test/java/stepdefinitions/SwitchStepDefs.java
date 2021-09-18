package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class SwitchStepDefs {
    TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
    AllPages elements = new AllPages();

    @When("user clicks on Switch")
    public void userClicksOnSwitch() {
        elements.preferencePage().switchPage.click();
    }

    @When("first switch button should be switched on")
    public void first_switch_button_should_be_switched_on() {
      //http://appium.io/docs/en/writing-running-appium/touch-actions/

        if (elements.switchPage().firstSwitchButton.getText().equals("OFF")) {
            touchAction.tap(TapOptions.tapOptions().
                    withElement(ElementOption.element(elements.switchPage().firstSwitchButton))).perform();
        }
    }

    @Then("verify first switch button is switched on")
    public void verify_first_switch_button_is_switched_on() {
        Assert.assertEquals("ON",elements.switchPage().firstSwitchButton.getText());
    }


    @And("second switch button should switched off")
    public void secondSwitchButtonShouldSwitchedOff() {
        if(elements.switchPage().secondSwitchButton.getText().equals("ON")){
            touchAction.tap(TapOptions.tapOptions().
                    withElement(ElementOption.element(elements.switchPage().secondSwitchButton))).perform();
        }
    }

    @Then("verify second switch button is switched off")
    public void verifySecondSwitchButtonIsSwitchedOff() {
        Assert.assertEquals("NO",elements.switchPage().secondSwitchButton.getText());
    }
}
