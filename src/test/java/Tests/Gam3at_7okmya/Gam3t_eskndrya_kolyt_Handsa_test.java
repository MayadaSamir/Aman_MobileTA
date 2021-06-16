package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_eskndrya_kolyt_Handsa;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_eskndrya_kolyt_Handsa_test extends TestBase {
    Gam3t_eskndrya_kolyt_Handsa gam3tEskndryaHandsaObj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3tEskndryaHandsaObj = new Gam3t_eskndrya_kolyt_Handsa(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tEskndryaHandsaObj.ClickOnGam3at7okmya1();
            //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة بورسعيد\").instance(0))").click();
            gam3tEskndryaHandsaObj.ClickOnGam3tEskndryaHandsa();
            gam3tEskndryaHandsaObj.studentCodeEntry("100100");
            gam3tEskndryaHandsaObj.studentCodeEntry1("100100");
            gam3tEskndryaHandsaObj.studentInfo();
            Assert.assertEquals(gam3tEskndryaHandsaObj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3tEskndryaHandsaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tEskndryaHandsaObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3tEskndryaHandsaObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3tEskndryaHandsaObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3tEskndryaHandsaObj.totalValue.getText(), "EGP 305.7");
            gam3tEskndryaHandsaObj.studentInfo2();
            gam3tEskndryaHandsaObj.EnterPIN("0000");
            gam3tEskndryaHandsaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

