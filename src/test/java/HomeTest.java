import Screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class HomeTest extends BaseTest{
    HomeScreen homeScreen;
    String userIdentifier;
    @BeforeClass
    public void Initialization() throws SQLException {
        Helper.LoginWithEmail();
        homeScreen = new HomeScreen(driver);

    }


    @Test
    public void Validate_UI(){
        Assert.assertEquals(homeScreen.getTitle() ,"Home");
        Assert.assertEquals(homeScreen.getTitleCard() , "Fall in Love with Reading");
        Assert.assertEquals(homeScreen.getMessageCard() , "Enjoy 5 free books before subscribing.");
        Assert.assertEquals(homeScreen.getSubscribeNowText() , "SUBSCRIBE NOW");
    }

}
