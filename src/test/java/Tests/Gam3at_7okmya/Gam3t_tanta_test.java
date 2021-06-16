package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_sohag;
import Pages.Gam3at_7okmya.Gam3t_tanta;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_tanta_test extends TestBase {
    Gam3t_tanta gam3tTantaObj ;

    @Test
    public  void  StudentRegister() throws Exception
    {
        try {
            gam3tTantaObj = new Gam3t_tanta(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tTantaObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة طنطا\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3telSadat();
            gam3tTantaObj.studentCodeEntry("100100");
            gam3tTantaObj.studentCodeEntry1("100100");
            gam3tTantaObj.studentInfo();
            Assert.assertEquals(gam3tTantaObj.Amount.getText() , "القيمة");
            Assert.assertEquals(gam3tTantaObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tTantaObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(gam3tTantaObj.AmountVALUE.getText() , "EGP 300.0");
            Assert.assertEquals(gam3tTantaObj.CAFvalue.getText() , "EGP 5.70");
            Assert.assertEquals(gam3tTantaObj.totalValue.getText() , "EGP 305.7");
            gam3tTantaObj.studentInfo2();
            gam3tTantaObj.EnterPIN("0000");
            gam3tTantaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

