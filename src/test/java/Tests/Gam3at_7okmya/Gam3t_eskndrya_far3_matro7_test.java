package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_eskndrya_far3_matro7;
import Pages.Gam3at_7okmya.Gam3t_portsaid;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_eskndrya_far3_matro7_test extends TestBase {
    Gam3t_eskndrya_far3_matro7 gam3tEskndryaMatro7Obj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3tEskndryaMatro7Obj = new Gam3t_eskndrya_far3_matro7(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tEskndryaMatro7Obj.ClickOnGam3at7okmya1();
            //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة بورسعيد\").instance(0))").click();
            gam3tEskndryaMatro7Obj.ClickOnGam3EskndryaMatro7();
            gam3tEskndryaMatro7Obj.studentCodeEntry("100100");
            gam3tEskndryaMatro7Obj.studentCodeEntry1("100100");
            gam3tEskndryaMatro7Obj.studentInfo();
            Assert.assertEquals(gam3tEskndryaMatro7Obj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3tEskndryaMatro7Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tEskndryaMatro7Obj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3tEskndryaMatro7Obj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3tEskndryaMatro7Obj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3tEskndryaMatro7Obj.totalValue.getText(), "EGP 305.7");
            gam3tEskndryaMatro7Obj.studentInfo2();
            gam3tEskndryaMatro7Obj.EnterPIN("0000");
            gam3tEskndryaMatro7Obj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

