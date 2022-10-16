package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SubscriptionScreen extends CorePage {
    @AndroidFindBy(id = "tv_skip")
    MobileElement skipButton;

    public SubscriptionScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void skipSubscriptionPopup(){
        clickOnButton(skipButton);
    }
}
