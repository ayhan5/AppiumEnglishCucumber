package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ReusableMethods;

public class CustomMethodStepDefs {
    @When("user click on {string}")
    public void user_click_on(String pageName) {
        ReusableMethods.clickOnPage(pageName);
    }

}
