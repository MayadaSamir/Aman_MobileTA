package Tests.NaqlweSeya7a;


import Pages.NaqlweSeya7a.GoBus;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoBus_test extends TestBase {

    GoBus goBusObj;

    @Test
    public void Test() throws InterruptedException {
        goBusObj = new GoBus(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"نقل وسياحة\").instance(0))").click();
        Thread.sleep(5000);
        goBusObj.ClickOnGoBus();
        goBusObj.raqmDaf3Entry("234");
        goBusObj.raqmDaf3Entry1("234");
        goBusObj.customerInfo();
        Assert.assertEquals(goBusObj.Amount.getText(), "القيمة");
        Assert.assertEquals(goBusObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(goBusObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(goBusObj.AmountVALUE.getText(), "EGP 620.0");
        Assert.assertEquals(goBusObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(goBusObj.totalValue.getText(), "EGP 625.7");
        goBusObj.customerInfo2();
        goBusObj.EnterPIN("0000");
        goBusObj.print();
    }
}

