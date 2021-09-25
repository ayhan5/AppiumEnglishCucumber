package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class ToastStepDefs {
    AllPages elements = new AllPages();
    @When("user clicks on Popup Menu")
    public void user_clicks_on_popup_menu() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"))");

        elements.viewsPage().popupButton.click();
    }

    @When("user clicks on make popup button")
    public void user_clicks_on_make_popup_button() {
        elements.viewsPage().popupButton2.click();
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
       elements.viewsPage().addButton.click();
    }

    @Then("verify toast message")
    public void verify_toast_message() {
       String toastMessage = Driver.getAppiumDriver().findElementByXPath("//android.widget.Toast").getAttribute("name");
        Assert.assertTrue(toastMessage.contains("Add"));
        System.out.println("Actual toast message: "+toastMessage);

    }

}
