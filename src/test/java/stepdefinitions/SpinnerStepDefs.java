package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.ReusableMethods;

public class SpinnerStepDefs {
    AllPages elements = new AllPages();
    @When("user clicks on {string} page")
    public void userClicksOnPage(String pageName) {
        ReusableMethods.clickOnPageAndroid(pageName);
    }

    @And("user clicks on color dropdown and select green")
    public void userClicksOnColorDropdownAndSelectGreen() {
        elements.spinnerPage().colorDropdown.click();
        elements.spinnerPage().green.click();
    }

    @Then("verify green selected")
    public void verifyGreenSelected() {
        Assert.assertEquals("green",elements.spinnerPage().selectedGreen.getText());

    }

    @And("user clicks on planet dropdown and select Jupiter")
    public void userClicksOnPlanetDropdownAndSelectJupiter() {
        elements.spinnerPage().planetDropdown.click();
        elements.spinnerPage().jupiter.click();
    }

    @Then("verify Jupiter selected")
    public void verifyJupiterSelected() {
        Assert.assertEquals("Jupiter",elements.spinnerPage().selectedJupiter.getText());
    }
}
