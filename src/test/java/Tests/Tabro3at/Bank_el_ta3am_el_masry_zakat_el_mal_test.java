package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_zakat_el_mal;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_zakat_el_mal_test extends TestBase {

    Bank_el_ta3am_el_masry_zakat_el_mal zakatMalObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            zakatMalObj = new  Bank_el_ta3am_el_masry_zakat_el_mal(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
            zakatMalObj.ClickOnZakatMal();
            zakatMalObj.raqmElmob("01090019467");
            zakatMalObj.raqmElmob1("01090019467");
            zakatMalObj.amountEntry("6");
            Assert.assertEquals(zakatMalObj.Amount.getText(), "القيمة");
            Assert.assertEquals(zakatMalObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(zakatMalObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(zakatMalObj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(zakatMalObj.CAFvalue.getText(), "EGP 2.00");
            Assert.assertEquals(zakatMalObj.totalValue.getText(), "EGP 8");
            zakatMalObj.flow();
            zakatMalObj.EnterPIN("0000");
            zakatMalObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

