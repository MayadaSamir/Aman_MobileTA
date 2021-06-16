package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_kfart_ymen;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_kfart_ymen_test extends TestBase {

    Bank_el_ta3am_el_masry_kfart_ymen ymenObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            ymenObj= new  Bank_el_ta3am_el_masry_kfart_ymen(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كفارة يمين فئة 50ج\").instance(0))").click();
            ymenObj.raqmElmob("01090019467");
            ymenObj.raqmElmob1("01090019467");
            ymenObj.numberEntry("6");
            Assert.assertEquals(ymenObj.Amount.getText(), "القيمة");
            Assert.assertEquals(ymenObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(ymenObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(ymenObj.AmountVALUE.getText(), "EGP 300.0");
            Assert.assertEquals(ymenObj.CAFvalue.getText(), "EGP 2.00");
            Assert.assertEquals(ymenObj.totalValue.getText(), "EGP 302");
            ymenObj.flow();
            ymenObj.EnterPIN("0000");
            ymenObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
