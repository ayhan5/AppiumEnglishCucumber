package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class AlertViewsStepDefs {
    AllPages elements = new AllPages();
    @Given("install the ios app on device")
    public void install_the_ios_app_on_device() {
        Driver.getAppiumDriver();
    }

    @When("user clicks on Alert Views button")
    public void user_clicks_on_alert_views_button() {
       elements.homePage().alertViewsButton.click();
    }


    @Then("user clicks OK button on IOS")
    public void user_clicks_ok_button_on_IOS() {
        elements.alertViewsPage().okButton.click();
    }

    @When("user clicks on Secure Text Entery")
    public void userClicksOnSecureTextEntery() {
        elements.alertViewsPage().secureTextEnteryButton.click();
    }

    @When("user clicks on Simple button")
    public void userClicksOnSimpleButton() {
        elements.alertViewsPage().simpleButton.click();
    }

    @And("user verify popup is displayed")
    public void userVerifyPopupIsDisplayed() {
        Assert.assertTrue(elements.alertViewsPage().alertText.isDisplayed());
    }

    @Then("quit app")
    public void quitApp() {
        Driver.quitAppiumDriver();
    }

    @When("user clicks on Okey Cancel button")
    public void userClicksOnOkeyCancelButton() {
        elements.alertViewsPage().okayCancelButton.click();
    }

    @Then("user clicks Cancel button on IOS'")
    public void userClicksCancelButtonOnIOS() {
        elements.alertViewsPage().cancelButton.click();
    }
}
