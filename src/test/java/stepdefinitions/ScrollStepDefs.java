package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import pages.AllPages;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ScrollStepDefs {
    AllPages elements = new AllPages();
    @When("user clicks on Switches")
    public void user_clicks_on_switches() {
        List<MobileElement> list;
        do {
            //scroll and find element on dome(UI)
            list = elements.viewsPage().switchesButton;
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
            int start_x = (int) (dimension.height * 0.5);
            int start_y = (int) (dimension.width * 0.8);
            int end_x = (int) (dimension.height * 0.5);
            int end_y = (int) (dimension.width * 0.2);

            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
            touchAction.press(PointOption.point(start_x,start_y)).
                    waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                    moveTo(PointOption.point(end_x,end_y)).release().perform();

        }while(list.size()==0);
      //click on element
        list.get(0).click();

    }

    @Then("user clicks on Switches with UiScrollable")
    public void userClicksOnSwitchesWithUiScrollable() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"))");

        elements.viewsPage().switchesButton1.click();

    }
}
