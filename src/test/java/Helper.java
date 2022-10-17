import Screens.EntranceScreen;
import Screens.SignInWithEmailScreen;
import Screens.SubscriptionScreen;
import Service.DataBase;

import java.sql.SQLException;
import java.util.Hashtable;

public class Helper extends  BaseTest {

    public static Hashtable<String, String> LoginWithEmail() throws SQLException {
        EntranceScreen l = new EntranceScreen(driver);
        SignInWithEmailScreen signInWithEmailScreen = l.navigateToSignInWithEmail();
        signInWithEmailScreen.addUser("mahrous1@nagwa.com", "nagwa2023");
        SubscriptionScreen subscriptionScreen = new SubscriptionScreen(driver);
        subscriptionScreen.skipSubscriptionPopup();
        return DataBase.getUserIdentifier("mahrous1@nagwa.com");

    }
}
