package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class ExpandableListStepDefs {
    AllPages elements = new AllPages();
    @When("user clicks on Expandable List")
    public void user_clicks_on_expandable_list() {
        elements.viewsPage().expandableButton.click();
    }

    @When("user clicks on Custom adapter")
    public void user_clicks_on_custom_adapter() {
        elements.expandableListPage().customAdabterButton.click();
    }

    @When("user long clicks on Arnold")
    public void user_long_clicks_on_arnold() {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.longPress(ElementOption.element(elements.expandableListPage().arnoldButton)).perform();
    }

    @Then("verify menu is displayed")
    public void verify_menu_is_displayed() {
        Assert.assertTrue(elements.expandableListPage().sampleMenu.isDisplayed());
    }


    @When("user clicks on People names")
    public void userClicksOnPeopleNames() {
        elements.expandableListPage().peopleNamesButton.click();
    }
}
