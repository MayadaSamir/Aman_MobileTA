package Tests.Others;

import Pages.Others.Etida_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etida_Test extends TestBase {
   Etida_Page itidaObj;

    @Test
    public void Test()  throws Exception
    {
        try
        {
            itidaObj= new Etida_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مدفوعات متنوعة\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ايتيدا\").instance(0))").click();
            itidaObj.raqmElCode("36");
            itidaObj.raqmElCode1("36");
            itidaObj.CustomerData();
            Assert.assertEquals(itidaObj.Amount.getText(), "القيمة");
            Assert.assertEquals(itidaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(itidaObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(itidaObj.AmountVALUE.getText(), "EGP 108.5");
            Assert.assertEquals(itidaObj.CAFvalue.getText(), "EGP 30.00");
            Assert.assertEquals(itidaObj.totalValue.getText(), "EGP 138.5");
            itidaObj.flow();
            itidaObj.EnterPIN("0000");
            itidaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
