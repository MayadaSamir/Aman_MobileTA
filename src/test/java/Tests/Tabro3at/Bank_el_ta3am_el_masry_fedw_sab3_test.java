package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_fedw_sab3;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_fedw_sab3_test extends TestBase {
    Bank_el_ta3am_el_masry_fedw_sab3 fedwObj;

    @Test
    public void Test() {
        fedwObj= new  Bank_el_ta3am_el_masry_fedw_sab3(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
        fedwObj.ClickOnfedw();
        fedwObj.raqmElmob("01090019467");
        fedwObj.raqmElmob1("01090019467");
        fedwObj.getamountEntry();
        Assert.assertEquals(fedwObj.Amount.getText(), "القيمة");
        Assert.assertEquals(fedwObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(fedwObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(fedwObj.AmountVALUE.getText(), "EGP 3500.0");
        Assert.assertEquals(fedwObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(fedwObj.totalValue.getText(), "EGP 3502");
        fedwObj.flow();
        fedwObj.EnterPIN("0000");
        fedwObj.print();
    }
}

