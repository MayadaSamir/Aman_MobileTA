package Tests.Tabro3at;

import Pages.Tabro3at.Baheya_kashf_mobkr;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Baheya_kashf_mobkr_test extends TestBase {
    Baheya_kashf_mobkr kashfObj;

    @Test
    public void Test() {
        kashfObj= new  Baheya_kashf_mobkr(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بهية\").instance(0))").click();
        kashfObj.ClickOnKashfMobkr();
        kashfObj.raqmElmob("01090019467");
        kashfObj.raqmElmob1("01090019467");
        kashfObj.amountEntry("6");
        Assert.assertEquals(kashfObj.Amount.getText(), "القيمة");
        Assert.assertEquals(kashfObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(kashfObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(kashfObj.AmountVALUE.getText(), "EGP 6.0");
        Assert.assertEquals(kashfObj.CAFvalue.getText(), "EGP 2.00");
        Assert.assertEquals(kashfObj.totalValue.getText(), "EGP 8");
        kashfObj.flow();
        kashfObj.EnterPIN("0000");
        kashfObj.print();
    }
}

