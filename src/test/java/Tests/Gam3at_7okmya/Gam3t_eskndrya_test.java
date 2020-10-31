package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_eskndrya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_eskndrya_test extends TestBase {
    Gam3t_eskndrya gam3tEskndryaObj;

    @Test
    public void StudentRegister() {
        gam3tEskndryaObj = new Gam3t_eskndrya(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
        //Thread.sleep(5000);
        //gam3t3enShamsObj.ClickOnGam3at7okmya();
        gam3tEskndryaObj.ClickOnGam3at7okmya1();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة بورسعيد\").instance(0))").click();
        gam3tEskndryaObj.ClickOnGam3teskndrya();
        gam3tEskndryaObj.studentCodeEntry("100100");
        gam3tEskndryaObj.studentCodeEntry1("100100");
        gam3tEskndryaObj.studentInfo();
        Assert.assertEquals(gam3tEskndryaObj.Amount.getText(), "القيمة");
        Assert.assertEquals(gam3tEskndryaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(gam3tEskndryaObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(gam3tEskndryaObj.AmountVALUE.getText(), "EGP 300.0");
        Assert.assertEquals(gam3tEskndryaObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(gam3tEskndryaObj.totalValue.getText(), "EGP 305.7");
        gam3tEskndryaObj.studentInfo2();
        gam3tEskndryaObj.EnterPIN("0000");
        gam3tEskndryaObj.print();
    }
}
