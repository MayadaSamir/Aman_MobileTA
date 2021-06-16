package Tests.NaqlweSeya7a;


import Pages.NaqlweSeya7a.AutoShare_60;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoShare_60_test extends TestBase {
    AutoShare_60 autoShare60Obj;

    //test data: 01099999295

    @Test
    public void Test() throws Exception
    {
        try {
            autoShare60Obj = new AutoShare_60(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"نقل وسياحة\").instance(0))").click();
            Thread.sleep(5000);
            autoShare60Obj.ClickOnAutoShare();
            autoShare60Obj.mobileEntry("01099999295");
            autoShare60Obj.mobileEntry1("01099999295");
            autoShare60Obj.ClickOnslab();
            autoShare60Obj.customerInfo();
            Assert.assertEquals(autoShare60Obj.Amount.getText(), "القيمة");
            Assert.assertEquals(autoShare60Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(autoShare60Obj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(autoShare60Obj.AmountVALUE.getText(), "EGP 60.0");
            Assert.assertEquals(autoShare60Obj.CAFvalue.getText(), "EGP 0.00");
            Assert.assertEquals(autoShare60Obj.totalValue.getText(), "EGP 60.0");
            autoShare60Obj.customerInfo2();
            autoShare60Obj.EnterPIN("0000");
            autoShare60Obj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
