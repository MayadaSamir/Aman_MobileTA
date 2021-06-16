package Tests.NaqlweSeya7a;

import Pages.NaqlweSeya7a.AutoShare_110;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoShare_110_test extends TestBase {
    AutoShare_110 autoShare110Obj;

    //test data: 01099999296

    @Test
    public void Test() throws Exception
    {
        try {
            autoShare110Obj = new AutoShare_110(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"نقل وسياحة\").instance(0))").click();
            Thread.sleep(5000);
            autoShare110Obj.ClickOnAutoShare();
            autoShare110Obj.mobileEntry("01099999296");
            autoShare110Obj.mobileEntry1("01099999296");
            autoShare110Obj.ClickOnslab();
            autoShare110Obj.customerInfo();
            Assert.assertEquals(autoShare110Obj.Amount.getText(), "القيمة");
            Assert.assertEquals(autoShare110Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(autoShare110Obj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(autoShare110Obj.AmountVALUE.getText(), "EGP 110.0");
            Assert.assertEquals(autoShare110Obj.CAFvalue.getText(), "EGP 0.00");
            Assert.assertEquals(autoShare110Obj.totalValue.getText(), "EGP 110.0");
            autoShare110Obj.customerInfo2();
            autoShare110Obj.EnterPIN("0000");
            autoShare110Obj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

