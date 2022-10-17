import Screens.EntranceScreen;
import Screens.SignInWithEmailScreen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
    EntranceScreen entranceScreen;
    @BeforeClass
    public void initialization (){
        entranceScreen = new EntranceScreen(driver);
    }


}
