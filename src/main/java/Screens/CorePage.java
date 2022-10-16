package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CorePage {
    AppiumDriver<MobileElement> driver;
    public CorePage(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver ;
    }

    protected void waitForElement(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver , 10);
        wait.until(ExpectedConditions.visibilityOf(element));

    }



    protected void enterDataToField(MobileElement element , String text){
        clear(element);
        element.sendKeys(text);
    }


    protected void clear(MobileElement element ){
        waitForElement(element);
        element.clear();
    }

    protected String  getText(MobileElement element ){
        waitForElement(element);
        return element.getText();
    }


    protected String  getAttribute(MobileElement element ,String attribute ){
        waitForElement(element);
        return element.getAttribute(attribute);
    }


    protected void  clickOnButton(MobileElement element){
        waitForElement(element);
        element.click();
    }





}
