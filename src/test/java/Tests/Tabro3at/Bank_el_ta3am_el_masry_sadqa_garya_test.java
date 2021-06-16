package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_sadqa_garya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_sadqa_garya_test extends TestBase {

    Bank_el_ta3am_el_masry_sadqa_garya sadqaGaryaObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            sadqaGaryaObj = new  Bank_el_ta3am_el_masry_sadqa_garya(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
            sadqaGaryaObj.ClickOnSadqaGarya();
            sadqaGaryaObj.raqmElmob("01090019467");
            sadqaGaryaObj.raqmElmob1("01090019467");
            sadqaGaryaObj.amountEntry("6");
            Assert.assertEquals(sadqaGaryaObj.Amount.getText(), "القيمة");
            Assert.assertEquals(sadqaGaryaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(sadqaGaryaObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(sadqaGaryaObj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(sadqaGaryaObj.CAFvalue.getText(), "EGP 2.00");
            Assert.assertEquals(sadqaGaryaObj.totalValue.getText(), "EGP 8");
            sadqaGaryaObj.flow();
            sadqaGaryaObj.EnterPIN("0000");
            sadqaGaryaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

