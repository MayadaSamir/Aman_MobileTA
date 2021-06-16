package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_zagazeg;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_zagazeg_test extends TestBase {

    Gam3t_zagazeg gam3tZagazegObj ;

    @Test
    public  void  StudentRegister() throws Exception
    {
        try {
            gam3tZagazegObj = new Gam3t_zagazeg(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tZagazegObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة الزقازيق\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3telZagazeg();
            gam3tZagazegObj.studentCodeEntry("100100");
            gam3tZagazegObj.studentCodeEntry1("100100");
            gam3tZagazegObj.studentInfo();
            Assert.assertEquals(gam3tZagazegObj.Amount.getText() , "القيمة");
            Assert.assertEquals(gam3tZagazegObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tZagazegObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(gam3tZagazegObj.AmountVALUE.getText() , "EGP 300.0");
            Assert.assertEquals(gam3tZagazegObj.CAFvalue.getText() , "EGP 5.70");
            Assert.assertEquals(gam3tZagazegObj.totalValue.getText() , "EGP 305.7");
            gam3tZagazegObj.studentInfo2();
            gam3tZagazegObj.EnterPIN("0000");
            gam3tZagazegObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

