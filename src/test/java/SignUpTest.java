import Screens.*;
import Service.DataBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class SignUpTest extends BaseTest {

    EntranceScreen entranceScreen;
    SignUpScreen signUpScreen;

    @BeforeClass
    public void initialization(){
        entranceScreen = new EntranceScreen(driver);
        signUpScreen = entranceScreen.navigateToSignUp();
    }

    

    @Test
    public void addUserWithValidData() throws SQLException, InterruptedException {
        String email = "mahrous3@nagwa.com";
        VerificationCodeScreen verificationCodeScreen = signUpScreen.addUser("7ours", "A" , email);
        String Code = DataBase.getConfirmationCodeFromDB("'"+email+"'");
        verificationCodeScreen.addDigits(Code);
       AddPasswordScreen addPasswordScreen = verificationCodeScreen.clickOnContinue();
       addPasswordScreen.addPassword("nagwa2023");
       HomeScreen homeScreen = addPasswordScreen.clickOnContinue();
       System.out.println(homeScreen.getTitle());


    }

}
