package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_l7om;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_l7om_test extends TestBase {

    Bank_el_ta3am_el_masry_l7om l7omObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            l7omObj= new  Bank_el_ta3am_el_masry_l7om(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"لحوم صدقات فئة 200ج\").instance(0))").click();
            l7omObj.raqmElmob("01090019467");
            l7omObj.raqmElmob1("01090019467");
            l7omObj.numberEntry("6");
            Assert.assertEquals(l7omObj.Amount.getText(), "القيمة");
            Assert.assertEquals(l7omObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(l7omObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(l7omObj.AmountVALUE.getText(), "EGP 1200.0");
            Assert.assertEquals(l7omObj.CAFvalue.getText(), "EGP 2.00");
            Assert.assertEquals(l7omObj.totalValue.getText(), "EGP 1202");
            l7omObj.flow();
            l7omObj.EnterPIN("0000");
            l7omObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

