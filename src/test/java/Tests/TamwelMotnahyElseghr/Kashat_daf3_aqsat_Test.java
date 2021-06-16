package Tests.TamwelMotnahyElseghr;
import Pages.TamwelMotnahyElseghr.Kashat_daf3_aqsat;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Kashat_daf3_aqsat_Test extends TestBase {

    Kashat_daf3_aqsat daf3Obj;

    @Test
    public void Test()  throws Exception
    {
        try
        {
            daf3Obj = new Kashat_daf3_aqsat(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تمويل متناهى الصغر\").instance(0))").click();
            daf3Obj.ClickOnKashat();
            daf3Obj.ClickOnDaf3();
            daf3Obj.raqmEltamwel("6565");
            daf3Obj.raqmEltamwel1("6565");
            daf3Obj.CustomerData();
            Assert.assertEquals(daf3Obj.Amount.getText(), "القيمة");
            Assert.assertEquals(daf3Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(daf3Obj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(daf3Obj.AmountVALUE.getText(), "EGP 10.0");
            Assert.assertEquals(daf3Obj.CAFvalue.getText(), "EGP 0.00");
            Assert.assertEquals(daf3Obj.totalValue.getText(), "EGP 10.0");
            daf3Obj.flow();
            daf3Obj.EnterPIN("0000");
            daf3Obj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

