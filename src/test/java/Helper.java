import Screens.EntranceScreen;
import Screens.SignInWithEmailScreen;

public class Helper extends  BaseTest {

    public static void LoginWithEmail(){
        EntranceScreen l = new EntranceScreen(driver);
        SignInWithEmailScreen signInWithEmailScreen = l.navigateToSignInWithEmail();
        signInWithEmailScreen.addUser("mahrous.ahmed@nagwa.com", "nagwa2023");

    }
}
