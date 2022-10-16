import Screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class HomeTest extends BaseTest{
    HomeScreen homeScreen;
    @BeforeClass
    public void Initialization(){
        Helper.LoginWithEmail();
        homeScreen = new HomeScreen(driver);

    }


    public void Validate_UI(){
        Assert.assertEquals(homeScreen.getTitle() ,"Home");
        Assert.assertEquals(homeScreen.getTitleCard() , "Fall in Love with Reading");
        Assert.assertEquals(homeScreen.getMessageCard() , "Enjoy 5 free books before subscribing.");
        Assert.assertEquals(homeScreen.getSubscribeNowText() , "SUBSCRIBE NOW");
    }

}
