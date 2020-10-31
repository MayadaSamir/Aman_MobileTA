package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_kesa2_el_masry;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_kesa2_el_masry_test extends TestBase {

    Bank_el_kesa2_el_masry bankObj;

    @Test
    public void Test() {
        bankObj= new  Bank_el_kesa2_el_masry(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الكساء المصري\").instance(0))").click();
        bankObj.ClickOnbank();
        bankObj.raqmElmob("01090019467");
        bankObj.raqmElmob1("01090019467");
        bankObj.amountEntry("6");
        Assert.assertEquals(bankObj.Amount.getText(), "القيمة");
        Assert.assertEquals(bankObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(bankObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(bankObj.AmountVALUE.getText(), "EGP 6.0");
        Assert.assertEquals(bankObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(bankObj.totalValue.getText(), "EGP 8");
        bankObj.flow();
        bankObj.EnterPIN("0000");
        bankObj.print();
    }
}

