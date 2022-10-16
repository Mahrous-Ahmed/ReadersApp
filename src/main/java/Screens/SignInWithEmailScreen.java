package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInWithEmailScreen extends CorePage {

    @AndroidFindBy(xpath = "//*[@text = 'Email']")
    MobileElement emailField;
    @AndroidFindBy(xpath = "//*[@text = 'Password']")
    MobileElement passwordField;
    @AndroidFindBy(id = "tv_progress")
    MobileElement continueButton;

    public SignInWithEmailScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    public void addEmail(String email){
        enterDataToField(emailField , email);

    }

    public void addPassword(String pass){
        enterDataToField(passwordField , pass);
    }

    public void clickOnContinue(){
        clickOnButton(continueButton);
    }

    public void addUser(String email , String pass){
        addEmail(email);
        addPassword(pass);
        clickOnContinue();
    }





}
