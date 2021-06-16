package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.gam3t_banha;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gam3t_banha_test extends TestBase {
    gam3t_banha gam3tBanhaObj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3tBanhaObj = new gam3t_banha(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tBanhaObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة بنها\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3tPortSaid();
            gam3tBanhaObj.studentCodeEntry("100100");
            gam3tBanhaObj.studentCodeEntry1("100100");
            gam3tBanhaObj.studentInfo();
            Assert.assertEquals(gam3tBanhaObj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3tBanhaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tBanhaObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3tBanhaObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3tBanhaObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3tBanhaObj.totalValue.getText(), "EGP 305.7");
            gam3tBanhaObj.studentInfo2();
            gam3tBanhaObj.EnterPIN("0000");
            gam3tBanhaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

