package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ViewsPage {
    public ViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public MobileElement dragDropButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
    public MobileElement dateWidgetsButton;
    //put insode list
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public List<MobileElement> switchesButton;
    //single element
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public MobileElement switchesButton1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
    public MobileElement expandableButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Popup Menu']")
    public MobileElement popupButton;

    //=========== below elements is belongs to Popup menu page
    @AndroidFindBy(className = "android.widget.Button")
    public MobileElement popupButton2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add']")
    public MobileElement addButton;

}
