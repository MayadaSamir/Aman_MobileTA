package Tests.Tabro3at;

import Pages.Tabro3at.Baheya_ensh2at;
import Pages.Tabro3at.Baheya_kashf_mobkr;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Baheya_ensh2at_test extends TestBase {

    Baheya_ensh2at ensh2atfObj;

    @Test
    public void Test() {
        ensh2atfObj= new  Baheya_ensh2at(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بهية\").instance(0))").click();
        ensh2atfObj.ClickOnEnsh2at();
        ensh2atfObj.raqmElmob("01090019467");
        ensh2atfObj.raqmElmob1("01090019467");
        ensh2atfObj.amountEntry("6");
        Assert.assertEquals(ensh2atfObj.Amount.getText(), "القيمة");
        Assert.assertEquals(ensh2atfObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(ensh2atfObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(ensh2atfObj.AmountVALUE.getText(), "EGP 6.0");
        Assert.assertEquals(ensh2atfObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(ensh2atfObj.totalValue.getText(), "EGP 8");
        ensh2atfObj.flow();
        ensh2atfObj.EnterPIN("0000");
        ensh2atfObj.print();
    }
}

