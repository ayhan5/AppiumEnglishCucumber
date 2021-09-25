package pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class PickerViewsPage {
    public PickerViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @iOSXCUITFindBy(accessibility = "Red color component value")
    public MobileElement firstColumn;

    @iOSXCUITFindBy(accessibility = "Green color component value")
    public MobileElement secondColumn;

    @iOSXCUITFindBy(accessibility = "Blue color component value")
    public MobileElement thirdColumn;


}
