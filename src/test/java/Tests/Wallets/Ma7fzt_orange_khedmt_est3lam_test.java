package Tests.Wallets;

import Pages.Wallets.Ma7fzt_orange_khedmt_est3lam;
import Tests.TestBase;
import org.testng.annotations.Test;

public class Ma7fzt_orange_khedmt_est3lam_test extends TestBase {

    Ma7fzt_orange_khedmt_est3lam est3lamOrangeObj;

    @Test
    public void eda3orange() throws InterruptedException {
        est3lamOrangeObj = new Ma7fzt_orange_khedmt_est3lam(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
        Thread.sleep(5000);
        est3lamOrangeObj.ClickOnma7fztOrangeCash();
        est3lamOrangeObj.ClickOneest3lam();
        est3lamOrangeObj.customerteleEntry("123");
        est3lamOrangeObj.customerteleEntry1("123");
        est3lamOrangeObj.print();

    }
}