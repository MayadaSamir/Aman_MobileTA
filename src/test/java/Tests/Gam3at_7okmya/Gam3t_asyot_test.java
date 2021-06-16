package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_asyot;
import Pages.Gam3at_7okmya.Gam3t_portsaid;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_asyot_test extends TestBase {

    Gam3t_asyot gam3tAsyotObj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3tAsyotObj = new Gam3t_asyot(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tAsyotObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة أسيوط\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3tPortSaid();
            gam3tAsyotObj.studentCodeEntry("100100");
            gam3tAsyotObj.studentCodeEntry1("100100");
            gam3tAsyotObj.studentInfo();
            Assert.assertEquals(gam3tAsyotObj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3tAsyotObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tAsyotObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3tAsyotObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3tAsyotObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3tAsyotObj.totalValue.getText(), "EGP 305.7");
            gam3tAsyotObj.studentInfo2();
            gam3tAsyotObj.EnterPIN("0000");
            gam3tAsyotObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
