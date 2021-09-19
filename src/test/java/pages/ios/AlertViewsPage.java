package pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AlertViewsPage {

    public AlertViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Text Entry']")
    public MobileElement textEnteryButton;

    @iOSXCUITFindBy(className = "XCUIElementTypeOther")
    public MobileElement textBox;

    @iOSXCUITFindBy(accessibility = "OK")
    public MobileElement okButton;

   @iOSXCUITFindBy(accessibility = "Secure Text Entry")
    public MobileElement secureTextEnteryButton;
   @iOSXCUITFindBy(accessibility = "Simple")
    public MobileElement simpleButton;

   @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='A Short Title Is Best']")
    public MobileElement alertText;

   @iOSXCUITFindBy(accessibility = "Okay / Cancel")
    public MobileElement okayCancelButton;

   @iOSXCUITFindBy(accessibility = "Cancel")
    public MobileElement cancelButton;


}
