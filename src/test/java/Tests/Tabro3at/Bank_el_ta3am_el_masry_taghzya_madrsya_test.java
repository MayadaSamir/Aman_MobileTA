package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_taghzya_madrsya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_taghzya_madrsya_test extends TestBase {

    Bank_el_ta3am_el_masry_taghzya_madrsya taghzyaObj;

    @Test
    public void Test() {
        taghzyaObj= new  Bank_el_ta3am_el_masry_taghzya_madrsya(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
        taghzyaObj.ClickOnTaghzya();
        taghzyaObj.raqmElmob("01090019467");
        taghzyaObj.raqmElmob1("01090019467");
        taghzyaObj.numberEntry("6");
        Assert.assertEquals(taghzyaObj.Amount.getText(), "القيمة");
        Assert.assertEquals(taghzyaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(taghzyaObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(taghzyaObj.AmountVALUE.getText(), "EGP 930.0");
        Assert.assertEquals(taghzyaObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(taghzyaObj.totalValue.getText(), "EGP 932");
        taghzyaObj.flow();
        taghzyaObj.EnterPIN("0000");
        taghzyaObj.print();
    }
}

