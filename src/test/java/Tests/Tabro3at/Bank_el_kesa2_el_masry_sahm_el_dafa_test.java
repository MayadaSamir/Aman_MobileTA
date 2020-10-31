package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_kesa2_el_masry_sahm_el_dafa;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_kesa2_el_masry_sahm_el_dafa_test extends TestBase {
    Bank_el_kesa2_el_masry_sahm_el_dafa sahmObj;

    @Test
    public void Test() {
        sahmObj= new  Bank_el_kesa2_el_masry_sahm_el_dafa(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الكساء المصري\").instance(0))").click();
        sahmObj.ClickOnSahm();
        sahmObj.raqmElmob("01090019467");
        sahmObj.raqmElmob1("01090019467");
        sahmObj.getamountEntry();
        Assert.assertEquals(sahmObj.Amount.getText(), "القيمة");
        Assert.assertEquals(sahmObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(sahmObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(sahmObj.AmountVALUE.getText(), "EGP 200.0");
        Assert.assertEquals(sahmObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(sahmObj.totalValue.getText(), "EGP 202");
        sahmObj.flow();
        sahmObj.EnterPIN("0000");
        sahmObj.print();
    }
}

