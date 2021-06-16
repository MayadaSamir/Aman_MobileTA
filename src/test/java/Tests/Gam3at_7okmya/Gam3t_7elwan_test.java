package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_7elwan;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_7elwan_test extends TestBase {
    Gam3t_7elwan gam3t7elwanObj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3t7elwanObj = new Gam3t_7elwan(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3t7elwanObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة حلوان\").instance(0))").click();
            gam3t7elwanObj.ClickOngam3t7elwan();
            gam3t7elwanObj.studentCodeEntry("100100");
            gam3t7elwanObj.studentCodeEntry1("100100");
            gam3t7elwanObj.studentInfo();
            Assert.assertEquals(gam3t7elwanObj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3t7elwanObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3t7elwanObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3t7elwanObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3t7elwanObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3t7elwanObj.totalValue.getText(), "EGP 305.7");
            gam3t7elwanObj.studentInfo2();
            gam3t7elwanObj.EnterPIN("0000");
            gam3t7elwanObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

