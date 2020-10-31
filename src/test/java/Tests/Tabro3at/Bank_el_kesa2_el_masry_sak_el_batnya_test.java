package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_kesa2_el_masry_sak_el_batnya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_kesa2_el_masry_sak_el_batnya_test extends TestBase {
    Bank_el_kesa2_el_masry_sak_el_batnya sakObj;

    @Test
    public void Test() {
        sakObj= new  Bank_el_kesa2_el_masry_sak_el_batnya(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الكساء المصري\").instance(0))").click();
        sakObj.ClickOnSak();
        sakObj.raqmElmob("01090019467");
        sakObj.raqmElmob1("01090019467");
        sakObj.getamountEntry();
        Assert.assertEquals(sakObj.Amount.getText(), "القيمة");
        Assert.assertEquals(sakObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(sakObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(sakObj.AmountVALUE.getText(), "EGP 300.0");
        Assert.assertEquals(sakObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(sakObj.totalValue.getText(), "EGP 302");
        sakObj.flow();
        sakObj.EnterPIN("0000");
        sakObj.print();
    }
}

