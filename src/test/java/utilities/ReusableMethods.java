package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

<<<<<<< HEAD
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
=======
import java.util.HashMap;
import java.util.List;

public class ReusableMethods {

     public static void clickOnPage(String pageName){
         List<MobileElement> pages = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
         for (MobileElement page : pages) {
             if (page.getText().equals(pageName)){
                 page.click();
                 break;
             }else{
                 scrollWithUiScrollableAndClick(pageName);
                 break;
             }
         }
     }

     public static void scrollWithUiScrollableAndClick(String elementText){
         AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
         driver.findElementByXPath("//*[@text='"+elementText+"']").click();
     }

     public static void clickOnPageIOSDevice(String pageName){
         List<MobileElement> pages = Driver.getAppiumDriver().findElementsByXPath("//XCUIElementTypeStaticText[@name='"+pageName+"']");
         if (pages.get(0).isDisplayed()){
             pages.get(0).click();
         }else{
             scrollAndClickOnElementIOS(pageName);
         }
     }

     public static void scrollAndClickOnElementIOS(String elementText){
         HashMap<String, Object> scrollObject = new HashMap<>();
         scrollObject.put("direction","down");
         scrollObject.put("value", elementText);
         Driver.getAppiumDriver().executeScript("mobile:scroll", scrollObject);
         Driver.getAppiumDriver().findElementByXPath("//XCUIElementTypeStaticText[@name='"+elementText+"']").click();
     }


>>>>>>> 4bdf60b844954d959933ac1051973737d2ab0a27
}
