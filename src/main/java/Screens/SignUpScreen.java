package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.HashMap;

public class SignUpScreen extends CorePage {
    @AndroidFindBy(id = "tvTitle")
    MobileElement screenTitle;
    @AndroidFindBy(id = "et_first_name")
    MobileElement firstNameField;
    @AndroidFindBy(id = "et_second_name")
    MobileElement secondNameField;
    @AndroidFindBy(id = "et_email")
    MobileElement emailField;
    @AndroidFindBy(id = "viewLanguage")
    MobileElement languageDropdown;
    @AndroidFindBy(id = "tv_language")
    MobileElement popupTitle;
    @AndroidFindBy(id = "rb_english")
    MobileElement englishRadio;
    @AndroidFindBy(id = "rb_arabic")
    MobileElement arabicRadio;
    @AndroidFindBy(id = "tv_done")
    MobileElement PopupDoneButton;
    @AndroidFindBy(id = "tv_cancel")
    MobileElement PopupCancelButton;
    @AndroidFindBy(id = "tv_progress")
    MobileElement continueButton;
    public SignUpScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public String getTitle(){
        return getText(screenTitle);
    }

    public HashMap<String , MobileElement> popupElements(){
        clickOnButton(languageDropdown);
        HashMap<String , MobileElement> hash = new HashMap<String , MobileElement>();
        hash.put("Title" , popupTitle );
        hash.put("English" , englishRadio );
        hash.put("Arabic" , arabicRadio );
        hash.put("Done" , PopupDoneButton );
        hash.put("Cancel" , PopupCancelButton );
        return hash;
    }

    public void addName(String first , String second){
        enterDataToField(firstNameField , first);
        enterDataToField(secondNameField , second);

    }

    public void addEmail(String email){
        enterDataToField(emailField , email);
    }

    public void clickOnContinue(){
        clickOnButton(continueButton);
    }

    public VerificationCodeScreen addUser(String firstName , String secondName , String email){
        addName(firstName,secondName);
        addEmail(email);
        clickOnContinue();
        return new VerificationCodeScreen(driver);
    }
}
