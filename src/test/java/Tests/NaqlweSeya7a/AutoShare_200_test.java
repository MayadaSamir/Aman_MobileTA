package Tests.NaqlweSeya7a;

import Pages.NaqlweSeya7a.AutoShare_200;
import Pages.NaqlweSeya7a.AutoShare_60;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoShare_200_test extends TestBase {

    AutoShare_200 autoShare200Obj;

    //test data: 01099999297

    @Test
    public void Test() throws Exception
    {
        try {
            autoShare200Obj = new AutoShare_200(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"نقل وسياحة\").instance(0))").click();
            Thread.sleep(5000);
            autoShare200Obj.ClickOnAutoShare();
            autoShare200Obj.mobileEntry("01099999297");
            autoShare200Obj.mobileEntry1("01099999297");
            autoShare200Obj.ClickOnslab();
            autoShare200Obj.customerInfo();
            Assert.assertEquals(autoShare200Obj.Amount.getText(), "القيمة");
            Assert.assertEquals(autoShare200Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(autoShare200Obj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(autoShare200Obj.AmountVALUE.getText(), "EGP 200.0");
            Assert.assertEquals(autoShare200Obj.CAFvalue.getText(), "EGP 0.00");
            Assert.assertEquals(autoShare200Obj.totalValue.getText(), "EGP 200.0");
            autoShare200Obj.customerInfo2();
            autoShare200Obj.EnterPIN("0000");
            autoShare200Obj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

