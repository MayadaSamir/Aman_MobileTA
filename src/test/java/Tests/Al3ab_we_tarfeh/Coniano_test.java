package Tests.Al3ab_we_tarfeh;

import Pages.Al3ab_we_tarfeh.Coniano;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Coniano_test extends TestBase {

    Coniano conObj;


    @Test
    public void Test() {
        conObj = new Coniano(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ألعاب وترفيه\").instance(0))").click();
        conObj.ClickOnConiano();
        conObj.ClickOnConianoInside();
        conObj.raqmElMob("01090019467");
        conObj.raqmElMob1("01090019467");
        Assert.assertEquals(conObj.Amount.getText(), "القيمة");
        Assert.assertEquals(conObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(conObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(conObj.AmountVALUE.getText(), "EGP 500.0");
        Assert.assertEquals(conObj.CAFvalue.getText(), "EGP 0.00");
        Assert.assertEquals(conObj.totalValue.getText(), "EGP 500.0");
        conObj.flow();
        conObj.EnterPIN("0000");
        conObj.print();
    }
}

