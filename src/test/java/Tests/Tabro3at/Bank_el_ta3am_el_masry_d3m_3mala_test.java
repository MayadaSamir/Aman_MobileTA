package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_d3m_3mala;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_d3m_3mala_test extends TestBase {
    Bank_el_ta3am_el_masry_d3m_3mala d3mObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            d3mObj= new  Bank_el_ta3am_el_masry_d3m_3mala(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"دعم العمالة اليومية\").instance(0))").click();
            d3mObj.raqmElmob("01090019467");
            d3mObj.raqmElmob1("01090019467");
            d3mObj.numberEntry("6");
            Assert.assertEquals(d3mObj.Amount.getText(), "القيمة");
            Assert.assertEquals(d3mObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(d3mObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(d3mObj.AmountVALUE.getText(), "EGP 960.0");
            Assert.assertEquals(d3mObj.CAFvalue.getText(), "EGP 2.00");
            Assert.assertEquals(d3mObj.totalValue.getText(), "EGP 962");
            d3mObj.flow();
            d3mObj.EnterPIN("0000");
            d3mObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

