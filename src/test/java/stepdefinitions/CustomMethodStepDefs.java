package stepdefinitions;

import io.cucumber.java.en.When;

public class CustomMethodStepDefs {
    @When("user click on {string}")
    public void user_click_on(String pageName) {
       // ReusableMethods.scrollIntoViewWithUiScrollable(pageName);
    }


}
