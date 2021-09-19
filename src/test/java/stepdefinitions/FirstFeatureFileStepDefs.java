package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllPages;
import pages.android.APIDemosPage;
import pages.android.MainPage;
import pages.android.PreferenceDependenciesPage;
import pages.android.PreferencePage;
import utilities.Driver;

public class FirstFeatureFileStepDefs {

    AllPages elelemnts = new AllPages();

    @Given("install the app on device")
    public void install_the_app_on_device() {
        Driver.getAppiumDriver();
    }

    @When("user clicks on API Demos")
    public void user_clicks_on_api_demos() {
       elelemnts.mainPage().apiDemos.click();
    }

    @When("user clicks on Preference")
    public void user_clicks_on_preference() {
      elelemnts.apiDemosPage().preference.click();
    }

    @When("user clicks on Preference Dependencies")
    public void user_clicks_on_preference_dependencies() {
       elelemnts.preferencePage().preferenceDependencies.click();
    }

    @When("user check the check box")
    public void user_check_the_check_box() {
        elelemnts.preferenceDependenciesPage().checkBox.click();
    }

    @When("user clicks on WiFi settings")
    public void user_clicks_on_wi_fi_settings() {
        elelemnts.preferenceDependenciesPage().wifiSettings.click();
    }

    @When("user provide a test to text box {string}")
    public void user_provide_a_test_to_text_box(String text) throws InterruptedException {
        Driver.getAppiumDriver().getKeyboard();
        Thread.sleep(2000);
        elelemnts.preferenceDependenciesPage().textBox.sendKeys(text);
    }

    @Then("user clicks Ok button")
    public void user_clicks_ok_button() {
      elelemnts.preferenceDependenciesPage().okButton.click();
    }

}
