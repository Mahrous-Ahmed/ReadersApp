package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EntranceScreen extends CorePage{

    @AndroidFindBy(id = "tvEmailSignIn")
    MobileElement signInWithEmail;

    @AndroidFindBy(id = "et_email")
    MobileElement emailField;

    @AndroidFindBy(xpath = "//*[@text='Password']")
    MobileElement passwordField;

    @AndroidFindBy(xpath = "//*[@text='SIGN IN']")
    MobileElement SignInButton;


    @AndroidFindBy (id = "tvSignUp")
    MobileElement signUpButton;




    public EntranceScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }





    public SignUpScreen navigateToSignUp(){
        clickOnButton(signUpButton);
        return new SignUpScreen(driver);
    }

    public SignInWithEmailScreen navigateToSignInWithEmail(){
        clickOnButton(signInWithEmail);
        return new SignInWithEmailScreen(driver);
    }





}
