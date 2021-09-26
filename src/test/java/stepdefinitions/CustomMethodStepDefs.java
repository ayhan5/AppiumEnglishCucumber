package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ReusableMethods;

public class CustomMethodStepDefs {
    @When("user click on {string}")
    public void user_click_on(String pageName) {
<<<<<<< HEAD
       // ReusableMethods.scrollIntoViewWithUiScrollable(pageName);
=======
        ReusableMethods.clickOnPage(pageName);
>>>>>>> 4bdf60b844954d959933ac1051973737d2ab0a27
    }


}
