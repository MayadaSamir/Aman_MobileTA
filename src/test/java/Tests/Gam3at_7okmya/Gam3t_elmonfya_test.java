package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_elmonfya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_elmonfya_test extends TestBase {
    Gam3t_elmonfya gam3tElMonfyaObj;

    @Test
    public void StudentRegister() throws Exception
    {
        try {
            gam3tElMonfyaObj = new Gam3t_elmonfya(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t3enShamsObj.ClickOnGam3at7okmya();
            gam3tElMonfyaObj.ClickOnGam3at7okmya1();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة المنوفيه\").instance(0))").click();
            //gam3telSadatObj.ClickOnGam3tPortSaid();
            gam3tElMonfyaObj.studentCodeEntry("100100");
            gam3tElMonfyaObj.studentCodeEntry1("100100");
            gam3tElMonfyaObj.studentInfo();
            Assert.assertEquals(gam3tElMonfyaObj.Amount.getText(), "القيمة");
            Assert.assertEquals(gam3tElMonfyaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3tElMonfyaObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(gam3tElMonfyaObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(gam3tElMonfyaObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(gam3tElMonfyaObj.totalValue.getText(), "EGP 305.7");
            gam3tElMonfyaObj.studentInfo2();
            gam3tElMonfyaObj.EnterPIN("0000");
            gam3tElMonfyaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

