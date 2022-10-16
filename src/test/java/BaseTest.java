import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    static AppiumDriver<MobileElement> driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME , "Emulator");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION , "9.0");
        cap.setCapability(MobileCapabilityType.APP ,System.getProperty("user.dir")+ "/Apps/Readers.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME , "UiAutomator2");
        driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);

    }


    @AfterSuite
    public void tearDown(){
        if (driver != null)
            driver.quit();
    }
}
