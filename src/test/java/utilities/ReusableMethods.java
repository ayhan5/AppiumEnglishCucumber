package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;

public class ReusableMethods {
    public static void clickOnPageIOS(String pageName){
      List<MobileElement> pages = Driver.getAppiumDriver().findElementsByXPath("/XCUIElementTypeStaticText[@name='"+pageName+"']");
        for (MobileElement page :pages) {
            if (page.getText().equals(pageName)){
                page.click();
                break;
            }
        }
    }

    public static void clickOnPageAndroid(String pageName){
        List<MobileElement> list = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='"+pageName+"']");
        if (list.size()>0){
            list.get(0).click();
        }else{
            scrollWithUiSelector(pageName);
        }
    }

    public static void scrollWithUiSelector(String text){
        AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))");
        driver.findElementByXPath("//android.widget.TextView[@text='"+text+"']").click();
    }
}
