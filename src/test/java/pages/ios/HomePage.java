package pages.ios;

import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @iOSXCUITFindBy(accessibility = "Alert Views")
    public MobileElement alertViewsButton;

    @iOSXCUITFindBy(accessibility = "Toolbars")
    public MobileElement toolBarsButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Switches']")
    public MobileElement switchesButton;

    @iOSXCUITFindBy(accessibility = "Picker View")
    public MobileElement pickerViewButton;



}
