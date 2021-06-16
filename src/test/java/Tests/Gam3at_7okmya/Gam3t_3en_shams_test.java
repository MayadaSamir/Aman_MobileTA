package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_3en_shams;
import Pages.Gam3at_7okmya.Gam3t_el_Qahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_3en_shams_test extends TestBase {
    Gam3t_3en_shams gam3t3enShamsObj ;

    @Test
    public  void  StudentRegister() throws Exception
    {
        try {
            gam3t3enShamsObj = new Gam3t_3en_shams(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3t3enShamsObj.ClickOnGam3at7okmya1();
            gam3t3enShamsObj.ClickOnGam3tQahera();
            gam3t3enShamsObj.studentCodeEntry("100100");
            gam3t3enShamsObj.studentCodeEntry1("100100");
            gam3t3enShamsObj.studentInfo();
            Assert.assertEquals(gam3t3enShamsObj.Amount.getText() , "القيمة");
            Assert.assertEquals(gam3t3enShamsObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3t3enShamsObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(gam3t3enShamsObj.AmountVALUE.getText() , "EGP 300.0");
            Assert.assertEquals(gam3t3enShamsObj.CAFvalue.getText() , "EGP 5.70");
            Assert.assertEquals(gam3t3enShamsObj.totalValue.getText() , "EGP 305.7");
            gam3t3enShamsObj.studentInfo2();
            gam3t3enShamsObj.EnterPIN("0000");
            gam3t3enShamsObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

