package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import sun.java2d.cmm.Profile;

public class HomeScreen extends CorePage{
    @AndroidFindBy(id = "imgUser")
    MobileElement profileButton;

    @AndroidFindBy(id = "imgLanguage")
    MobileElement LanguageButton;

    @AndroidFindBy(id = "iv_search")
    MobileElement iv_search;

    @AndroidFindBy(id = "title")
    MobileElement title;

    @AndroidFindBy(id = "imgBanner")
    MobileElement imageCard;

    @AndroidFindBy(id = "tvTitle")
    MobileElement titleCard;

    @AndroidFindBy(id = "tvMessage")
    MobileElement messageCard;

    @AndroidFindBy(id = "tvSubscribe")
    MobileElement subscribeButtonCard;

    @AndroidFindBy(id = "imgClose")
    MobileElement closeCard;


    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    public String getTitle(){
        return getText(title);
    }

    public String getTitleCard(){
        return getText(titleCard);
    }

    public String getMessageCard(){
        return getText(messageCard);
    }

    public String getSubscribeNowText(){
      return   getText(subscribeButtonCard);
    }



    public void clickOnProfileButton(){
        clickOnButton(profileButton);
    }




}
