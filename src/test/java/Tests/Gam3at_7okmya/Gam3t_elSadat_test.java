package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_3en_shams;
import Pages.Gam3at_7okmya.Gam3t_elsadat;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_elSadat_test extends TestBase {
    Gam3t_elsadat gam3telSadatObj ;

    @Test
    public  void  StudentRegister() throws Exception
    {
        try {
            gam3telSadatObj = new Gam3t_elsadat(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3telSadatObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة السادات\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3telSadat();
            gam3telSadatObj.studentCodeEntry("100100");
            gam3telSadatObj.studentCodeEntry1("100100");
            gam3telSadatObj.studentInfo();
            Assert.assertEquals(gam3telSadatObj.Amount.getText() , "القيمة");
            Assert.assertEquals(gam3telSadatObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3telSadatObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(gam3telSadatObj.AmountVALUE.getText() , "EGP 300.0");
            Assert.assertEquals(gam3telSadatObj.CAFvalue.getText() , "EGP 5.70");
            Assert.assertEquals(gam3telSadatObj.totalValue.getText() , "EGP 305.7");
            gam3telSadatObj.studentInfo2();
            gam3telSadatObj.EnterPIN("0000");
            gam3telSadatObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

