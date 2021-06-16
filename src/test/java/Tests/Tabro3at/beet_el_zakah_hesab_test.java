package Tests.Tabro3at;

import Pages.Tabro3at.beet_el_zakah_hesab;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class beet_el_zakah_hesab_test extends TestBase {
    beet_el_zakah_hesab hesabObj;


    @Test
    public void Test() throws Exception
    {
        try
        {
            hesabObj= new beet_el_zakah_hesab(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            hesabObj.ClickOnBeetELZakah();
            hesabObj.ClickOnHesab();
            hesabObj.raqmElmob("01090019467");
            hesabObj.raqmElmob1("01090019467");
            hesabObj.amountEntry("6");
            Assert.assertEquals(hesabObj.Amount.getText(), "القيمة");
            Assert.assertEquals(hesabObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(hesabObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(hesabObj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(hesabObj.CAFvalue.getText(), "EGP 0.00");
            Assert.assertEquals(hesabObj.totalValue.getText(), "EGP 6");
            hesabObj.flow();
            hesabObj.EnterPIN("0000");
            hesabObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
