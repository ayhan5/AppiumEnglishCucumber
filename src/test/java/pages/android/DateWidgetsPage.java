package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.rmi.MarshalledObject;
import java.time.Duration;
import java.util.List;

public class DateWidgetsPage {
    public DateWidgetsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2. Inline']")
    public MobileElement inlineButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1. Dialog']")
    public MobileElement changeButton;

    @AndroidFindBy(accessibility = "9")
    public MobileElement num9;

    @AndroidFindBy(accessibility = "15")
    public MobileElement num15;

    @AndroidFindBy(accessibility = "45")
    public MobileElement num45;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/pickDate")
    public MobileElement changeDateButton;
    //burdan sonrasi ayri page yapilabilir
    @AndroidFindBy(id = "android:id/date_picker_header_year")
    public MobileElement YearButton;

    @AndroidFindBy(className = "android.widget.TextView")
    public List<MobileElement> yearList;

    @AndroidFindBy(id = "android:id/prev")
    public MobileElement previousMount;

    @AndroidFindBy(id = "android:id/next")
    public MobileElement nextMount;

    @AndroidFindBy(className = "android.view.View")
    public List<MobileElement> dayList;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='22 September 2021']")
    public MobileElement mountNow;




}
