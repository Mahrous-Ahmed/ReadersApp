package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class VerificationCodeScreen extends CorePage {

    @AndroidFindBy(id = "tv_progress")
    MobileElement continueButton;
    @AndroidFindBy (className = "android.widget.EditText")
    List<MobileElement> digitsCode;


    public VerificationCodeScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void addDigits(String digits) throws InterruptedException {

        Thread.sleep(3000);
        System.out.println(digitsCode.size());
        for(int i = 0 ; i < digits.length() ; i++){
            waitForElement(digitsCode.get(i));
            enterDataToField(digitsCode.get(i) , ""+digits.charAt(i));
        }
    }

    public AddPasswordScreen clickOnContinue(){
        clickOnButton(continueButton);
        return new AddPasswordScreen(driver);

    }


}
