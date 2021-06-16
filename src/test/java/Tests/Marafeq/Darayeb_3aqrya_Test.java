package Tests.Marafeq;

import Pages.Marafeq.Darayeb_3aqrya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Darayeb_3aqrya_Test extends TestBase {

    Darayeb_3aqrya daraybObj;

    @Test
    public void Test() throws Exception
    {
        try {
            daraybObj = new Darayeb_3aqrya(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            daraybObj.ClickOnDarayb();
            daraybObj.ClickOnFatora();
            daraybObj.ClickOnFatoraDarebya();
            daraybObj.raqmElMotlba1("33");
            daraybObj.raqmElMotlba2("33");
            daraybObj.CustomerData();
            Assert.assertEquals(daraybObj.Amount.getText(), "القيمة");
            Assert.assertEquals(daraybObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(daraybObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(daraybObj.AmountVALUE.getText(), "EGP 108.5");
            Assert.assertEquals(daraybObj.CAFvalue.getText(), "EGP 34.20");
            Assert.assertEquals(daraybObj.totalValue.getText(), "EGP 142.7");
            daraybObj.flow();
            daraybObj.EnterPIN("0000");
            daraybObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

