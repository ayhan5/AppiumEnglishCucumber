package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.android.APIDemosPage;
import pages.android.MainPage;
import pages.android.PreferenceDependenciesPage;
import pages.android.PreferencePage;
import utilities.Driver;

public class FirstFeatureFileStepDefs {

    MainPage mainPage = new MainPage();
    PreferencePage preferencePage = new PreferencePage();
    PreferenceDependenciesPage preferenceDependenciesPage = new PreferenceDependenciesPage();
    APIDemosPage apiDemosPage = new APIDemosPage();




    @Given("install the app on device")
    public void install_the_app_on_device() {
        Driver.getAppiumDriver();
    }

    @When("user clicks on API Demos")
    public void user_clicks_on_api_demos() {
       mainPage.apiDemos.click();
    }

    @When("user clicks on Preference")
    public void user_clicks_on_preference() {
      apiDemosPage.preference.click();
    }

    @When("user clicks on Preference Dependencies")
    public void user_clicks_on_preference_dependencies() {
       preferencePage.preferenceDependencies.click();
    }

    @When("user check the check box")
    public void user_check_the_check_box() {
        preferenceDependenciesPage.checkBox.click();
    }

    @When("user clicks on WiFi settings")
    public void user_clicks_on_wi_fi_settings() {
        preferenceDependenciesPage.wifiSettings.click();
    }

    @When("user provide a test to text box {string}")
    public void user_provide_a_test_to_text_box(String text) {
       preferenceDependenciesPage.textBox.sendKeys(text);
    }

    @Then("user clicks Ok button")
    public void user_clicks_ok_button() {
      preferenceDependenciesPage.okButton.click();
    }

}
