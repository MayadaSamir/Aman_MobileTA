package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3at_domyat;
import Pages.Gam3at_7okmya.Gam3t_portsaid;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3at_domyat_test extends TestBase {
    Gam3at_domyat gam3tDomyatObj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3tDomyatObj = new Gam3at_domyat(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tDomyatObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة دمياط\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3tPortSaid();
            gam3tDomyatObj.studentCodeEntry("100100");
            gam3tDomyatObj.studentCodeEntry1("100100");
            gam3tDomyatObj.studentInfo();
            Assert.assertEquals(gam3tDomyatObj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3tDomyatObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tDomyatObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3tDomyatObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3tDomyatObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3tDomyatObj.totalValue.getText(), "EGP 305.7");
            gam3tDomyatObj.studentInfo2();
            gam3tDomyatObj.EnterPIN("0000");
            gam3tDomyatObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

