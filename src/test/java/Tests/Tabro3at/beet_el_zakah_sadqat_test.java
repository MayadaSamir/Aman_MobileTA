package Tests.Tabro3at;

import Pages.Tabro3at.beet_el_zakah_sadqat;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class beet_el_zakah_sadqat_test extends TestBase {

    beet_el_zakah_sadqat sadqatObj;


    @Test
    public void Test() throws Exception
    {
        try
        {
            sadqatObj= new beet_el_zakah_sadqat(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            sadqatObj.ClickOnBeetELZakah();
            sadqatObj.ClickOnSadqat();
            sadqatObj.raqmElmob("01090019467");
            sadqatObj.raqmElmob1("01090019467");
            sadqatObj.amountEntry("6");
            Assert.assertEquals(sadqatObj.Amount.getText(), "القيمة");
            Assert.assertEquals(sadqatObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(sadqatObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(sadqatObj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(sadqatObj.CAFvalue.getText(), "EGP 0.00");
            Assert.assertEquals(sadqatObj.totalValue.getText(), "EGP 6");
            sadqatObj.flow();
            sadqatObj.EnterPIN("0000");
            sadqatObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

