package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_portsaid;
import Pages.Gam3at_7okmya.Gam3t_zagazeg;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_portsaid_test extends TestBase {
    Gam3t_portsaid gam3tPortsaidObj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3tPortsaidObj = new Gam3t_portsaid(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tPortsaidObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة بورسعيد\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3tPortSaid();
            gam3tPortsaidObj.studentCodeEntry("100100");
            gam3tPortsaidObj.studentCodeEntry1("100100");
            gam3tPortsaidObj.studentInfo();
            Assert.assertEquals(gam3tPortsaidObj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3tPortsaidObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tPortsaidObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3tPortsaidObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3tPortsaidObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3tPortsaidObj.totalValue.getText(), "EGP 305.7");
            gam3tPortsaidObj.studentInfo2();
            gam3tPortsaidObj.EnterPIN("0000");
            gam3tPortsaidObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}