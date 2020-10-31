package Tests.Gam3at_7okmya;


import Pages.Gam3at_7okmya.Gam3t_sohag;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_sohag_test extends TestBase {
    Gam3t_sohag gam3tSohagObj ;

    @Test
    public  void  StudentRegister() {
        gam3tSohagObj = new Gam3t_sohag(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
        //Thread.sleep(5000);
        //gam3t3enShamsObj.ClickOnGam3at7okmya();
        gam3tSohagObj.ClickOnGam3at7okmya1();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة سوهاج\").instance(0))").click();
        //gam3telSadatObj.ClickOnGam3telSadat();
        gam3tSohagObj.studentCodeEntry("100100");
        gam3tSohagObj.studentCodeEntry1("100100");
        gam3tSohagObj.studentInfo();
        Assert.assertEquals(gam3tSohagObj.Amount.getText() , "القيمة");
        Assert.assertEquals(gam3tSohagObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(gam3tSohagObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(gam3tSohagObj.AmountVALUE.getText() , "EGP 300.0");
        Assert.assertEquals(gam3tSohagObj.CAFvalue.getText() , "EGP 5.70");
        Assert.assertEquals(gam3tSohagObj.totalValue.getText() , "EGP 305.7");
        gam3tSohagObj.studentInfo2();
        gam3tSohagObj.EnterPIN("0000");
        gam3tSohagObj.print();
    }
}
