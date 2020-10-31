package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_Qwafel;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_Qwafel_test extends TestBase {

    Bank_el_ta3am_el_masry_Qwafel qwafelObj;

    @Test
    public void Test() {
        qwafelObj= new  Bank_el_ta3am_el_masry_Qwafel(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"قوافل و إغاثة\").instance(0))").click();
        qwafelObj.raqmElmob("01090019467");
        qwafelObj.raqmElmob1("01090019467");
        qwafelObj.numberEntry("6");
        Assert.assertEquals(qwafelObj.Amount.getText(), "القيمة");
        Assert.assertEquals(qwafelObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(qwafelObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(qwafelObj.AmountVALUE.getText(), "EGP 1500.0");
        Assert.assertEquals(qwafelObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(qwafelObj.totalValue.getText(), "EGP 1502");
        qwafelObj.flow();
        qwafelObj.EnterPIN("0000");
        qwafelObj.print();
    }
}
