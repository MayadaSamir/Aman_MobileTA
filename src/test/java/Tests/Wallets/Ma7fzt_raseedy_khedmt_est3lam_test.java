package Tests.Wallets;

import Pages.Wallets.Ma7fzt_raseedy_khedmt_est3lam;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ma7fzt_raseedy_khedmt_est3lam_test extends TestBase {
    Ma7fzt_raseedy_khedmt_est3lam est3lamRasedyObj;

    @Test
    public void eda3orange() throws Exception
    {
        try
        {
            est3lamRasedyObj = new Ma7fzt_raseedy_khedmt_est3lam(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
            Thread.sleep(5000);
            est3lamRasedyObj.ClickOnma7fztRasedy();
            est3lamRasedyObj.ClickOnEst3lam();
            est3lamRasedyObj.customerteleEntry("123");
            est3lamRasedyObj.customerteleEntry1("123");
            est3lamRasedyObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

