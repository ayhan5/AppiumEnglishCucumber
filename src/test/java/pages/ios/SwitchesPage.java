package pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SwitchesPage {

    public SwitchesPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[1]")
    public MobileElement firstSwitchButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[2]")
    public MobileElement secondSwitchButton;



}
