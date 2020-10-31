package Tests.NaqlweSeya7a;

import Pages.NaqlweSeya7a.BlueBus;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlueBus_test extends TestBase {
    BlueBus blueBusObj;

    @Test
    public void Test() throws InterruptedException {
        blueBusObj = new BlueBus(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"نقل وسياحة\").instance(0))").click();
        Thread.sleep(5000);
        blueBusObj.ClickOnGoBus();
        blueBusObj.raqmDaf3Entry("258");
        blueBusObj.raqmDaf3Entry1("258");
        blueBusObj.customerInfo();
        Assert.assertEquals(blueBusObj.Amount.getText(), "القيمة");
        Assert.assertEquals(blueBusObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(blueBusObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(blueBusObj.AmountVALUE.getText(), "EGP 100.0");
        Assert.assertEquals(blueBusObj.CAFvalue.getText(), "EGP 4.00");
        Assert.assertEquals(blueBusObj.totalValue.getText(), "EGP 104.0");
        blueBusObj.customerInfo2();
        blueBusObj.EnterPIN("0000");
        blueBusObj.print();
    }
}

