package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_el_Qahera;
import Pages.Gam3at_7okmya.Gam3t_qanat_elswes;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_qanat_swes_test extends TestBase {
    Gam3t_qanat_elswes gam3tQanatSwesObj ;

    @Test
    public  void  StudentRegister() throws InterruptedException {
        gam3tQanatSwesObj = new Gam3t_qanat_elswes(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
        Thread.sleep(5000);
        gam3tQanatSwesObj.ClickOnGam3at7okmya1();
        gam3tQanatSwesObj.ClickOnGam3tQanatSwes();
        gam3tQanatSwesObj.studentCodeEntry("100100");
        gam3tQanatSwesObj.studentCodeEntry1("100100");
        gam3tQanatSwesObj.studentInfo();
        Assert.assertEquals(gam3tQanatSwesObj.Amount.getText() , "القيمة");
        Assert.assertEquals(gam3tQanatSwesObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(gam3tQanatSwesObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(gam3tQanatSwesObj.AmountVALUE.getText() , "EGP 300.0");
        Assert.assertEquals(gam3tQanatSwesObj.CAFvalue.getText() , "EGP 5.70");
        Assert.assertEquals(gam3tQanatSwesObj.totalValue.getText() , "EGP 305.7");
        gam3tQanatSwesObj.studentInfo2();
        gam3tQanatSwesObj.EnterPIN("0000");
        gam3tQanatSwesObj.print();
    }
}
