package Tests.Gam3at_7okmya;


import Pages.Gam3at_7okmya.Gam3t_el_Qahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Gam3t_el_Qahera_test extends TestBase{

    Gam3t_el_Qahera gam3tQaheraObj ;

    @Test
    public  void  StudentRegister() {
        gam3tQaheraObj = new Gam3t_el_Qahera(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
        //Thread.sleep(5000);
        gam3tQaheraObj.ClickOnGam3at7okmya1();
        gam3tQaheraObj.ClickOnGam3tQahera();
        gam3tQaheraObj.studentCodeEntry("100100");
        gam3tQaheraObj.studentCodeEntry1("100100");
        gam3tQaheraObj.studentInfo();
        Assert.assertEquals(gam3tQaheraObj.Amount.getText() , "القيمة");
        Assert.assertEquals(gam3tQaheraObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(gam3tQaheraObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(gam3tQaheraObj.AmountVALUE.getText() , "EGP 300.0");
        Assert.assertEquals(gam3tQaheraObj.CAFvalue.getText() , "EGP 5.70");
        Assert.assertEquals(gam3tQaheraObj.totalValue.getText() , "EGP 305.7");
        gam3tQaheraObj.studentInfo2();
        gam3tQaheraObj.EnterPIN("0000");
        gam3tQaheraObj.print();
    }
}

