package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ExpandableListPage {
    public ExpandableListPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1. Custom Adapter']")
    public MobileElement customAdabterButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
    public MobileElement peopleNamesButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Arnold']")
    public MobileElement arnoldButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample menu']")
    public MobileElement sampleMenu;






}


