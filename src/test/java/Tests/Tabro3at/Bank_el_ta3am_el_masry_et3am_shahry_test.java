package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_et3am_shahry;
import Pages.Tabro3at.Bank_el_ta3am_el_masry_tabro3_3am;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_et3am_shahry_test extends TestBase {
    Bank_el_ta3am_el_masry_et3am_shahry et3amObj;

    @Test
    public void Test() {
        et3amObj= new  Bank_el_ta3am_el_masry_et3am_shahry(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
        et3amObj.ClickOnEt3am();
        et3amObj.raqmElmob("01090019467");
        et3amObj.raqmElmob1("01090019467");
        et3amObj. numberEntry("6");
        Assert.assertEquals(et3amObj.Amount.getText(), "القيمة");
        Assert.assertEquals(et3amObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(et3amObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(et3amObj.AmountVALUE.getText(), "EGP 720.0");
        Assert.assertEquals(et3amObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(et3amObj.totalValue.getText(), "EGP 722");
        et3amObj.flow();
        et3amObj.EnterPIN("0000");
        et3amObj.print();
    }
}

