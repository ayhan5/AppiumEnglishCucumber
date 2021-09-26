package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SpinnerPage {
    public SpinnerPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner1")
    public MobileElement colorDropdown;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner2")
    public MobileElement planetDropdown;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='green']")
    public MobileElement green;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Jupiter']")
    public MobileElement jupiter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='green']")
    public MobileElement selectedGreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jupiter']")
    public MobileElement selectedJupiter;



}
