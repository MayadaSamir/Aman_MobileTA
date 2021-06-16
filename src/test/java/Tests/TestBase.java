package Tests;
import Helpers.Helper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static AndroidDriver<MobileElement> driver;

    @Test
    //@BeforeSuite
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Base")
    public void StartDriver() throws MalformedURLException {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion","8.1.0");
            cap.setCapability("deviceName", "Alcatel 1");
            cap.setCapability("noReset", true);
            cap.setCapability("udid" , "ZP6SDAFMGAVGJJMF");
            cap.setCapability("AUTOMATION_NAME", "ANDROID_UIAUTOMATOR2");
            cap.setCapability("skipServerInstallation", true);
            cap.setCapability("appPackage","com.raya.aman");
            cap.setCapability("appWaitActivity","*.transactionslistactivity.TransactionsListActivity");
            cap.setCapability("app", "D:\\Test_Automation\\APK\\mobile-MobileAppDevelopmentDebug-1.44-2021-04-26.apk");

            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    //take screenshot when test case fails and add it in the Screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result) throws MalformedURLException {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(driver, result.getName());
            StartDriver();
        }
    }
}
