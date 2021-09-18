package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class DragDropStepDefs {
   AllPages elements =  new AllPages();
    @When("user clicks on Views")
    public void user_clicks_on_views() {
       elements.apiDemosPage().views.click();
    }

    @When("user clicks on Drag and Drop")
    public void user_clicks_on_drag_and_drop() {
        elements.viewsPage().dragDropButton.click();
    }

    @When("user drag first button and drop on third button")
    public void user_drag_first_button_and_drop_on_third_button() {
        TouchAction touchAction =new TouchAction(Driver.getAppiumDriver());

        touchAction.longPress(ElementOption.element(elements.dragDropPage().firstButton)).
                moveTo(ElementOption.element(elements.dragDropPage().thirdButton)).release().perform();
    }

    @Then("verify the text is displayed")
    public void verify_the_text_is_displayed() throws InterruptedException {
       Thread.sleep(5000);
       Assert.assertTrue(elements.dragDropPage().text.isDisplayed());
    }
}
