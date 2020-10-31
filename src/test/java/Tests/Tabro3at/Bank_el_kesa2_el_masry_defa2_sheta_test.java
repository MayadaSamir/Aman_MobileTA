package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_kesa2_el_masry_defa2_sheta;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_kesa2_el_masry_defa2_sheta_test extends TestBase {

    Bank_el_kesa2_el_masry_defa2_sheta defa2Obj;

    @Test
    public void Test() {
        defa2Obj= new  Bank_el_kesa2_el_masry_defa2_sheta(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الكساء المصري\").instance(0))").click();
        defa2Obj.ClickOndefa2();
        defa2Obj.raqmElmob("01090019467");
        defa2Obj.raqmElmob1("01090019467");
        defa2Obj.getamountEntry();
        Assert.assertEquals(defa2Obj.Amount.getText(), "القيمة");
        Assert.assertEquals(defa2Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(defa2Obj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(defa2Obj.AmountVALUE.getText(), "EGP 700.0");
        Assert.assertEquals(defa2Obj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(defa2Obj.totalValue.getText(), "EGP 702");
        defa2Obj.flow();
        defa2Obj.EnterPIN("0000");
        defa2Obj.print();
    }
}
