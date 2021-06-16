package Tests.Tabro3at;

import Pages.Tabro3at.Bedaya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bedaya_test extends TestBase {
    Bedaya bedayaObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            bedayaObj= new Bedaya(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عيون مصر\").instance(0))").click();
            bedayaObj.raqmElmob("01090019467");
            bedayaObj.raqmElmob1("01090019467");
            bedayaObj.amountEntry("6");
            Assert.assertEquals(bedayaObj.Amount.getText(), "القيمة");
            Assert.assertEquals(bedayaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(bedayaObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(bedayaObj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(bedayaObj.CAFvalue.getText(), "EGP 3.00");
            Assert.assertEquals(bedayaObj.totalValue.getText(), "EGP 9");
            bedayaObj.flow();
            bedayaObj.EnterPIN("0000");
            bedayaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

