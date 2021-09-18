package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.When;
import pages.AllPages;
import utilities.Driver;

public class SwipeStepDefs {
    AllPages elements = new AllPages();

    @When("user clicks on Date Widgets")
    public void user_clicks_on_date_widgets() {
       elements.viewsPage().dateWidgetsButton.click();
    }

    @When("user clicks on Inline")
    public void user_clicks_on_inline() {
        elements.dateWidgetsPage().inlineButton.click();
    }

    @When("user clicks on {int}")
    public void user_clicks_on(Integer int1) {
        elements.dateWidgetsPage().num9.click();
    }

    @When("swipe {int} to {int}")
    public void swipe_to(Integer int1, Integer int2) {
        TouchAction touchAction =new TouchAction(Driver.getAppiumDriver());

        touchAction.longPress(LongPressOptions.longPressOptions().
                withElement(ElementOption.element(elements.dateWidgetsPage().num15))).
                moveTo(ElementOption.element(elements.dateWidgetsPage().num45)).release().perform();

    }

}
