package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddPasswordScreen extends CorePage{

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Create Password']")
    MobileElement createPassword;

    @AndroidFindBy(id = "et_confirm_password")
    MobileElement confirmPassword;

    @AndroidFindBy(id = "tv_progress")
    MobileElement continueButton;

    public AddPasswordScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void setCreatePassword(String pass){
        enterDataToField(createPassword , pass);
    }

    public void setConfirmPassword(String pass){
        enterDataToField(confirmPassword , pass);
    }

    public HomeScreen clickOnContinue(){
        clickOnButton(continueButton);
        SubscriptionScreen subscriptionScreen = new SubscriptionScreen(driver);
        subscriptionScreen.skipSubscriptionPopup();
        return new HomeScreen(driver);

    }

    public void addPassword(String pass){
        setCreatePassword(pass);
        setConfirmPassword(pass);
    }

}
