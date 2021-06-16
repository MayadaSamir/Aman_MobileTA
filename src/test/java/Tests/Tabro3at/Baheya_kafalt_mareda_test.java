package Tests.Tabro3at;

import Pages.Tabro3at.Baheya_kafalt_mareda;
import Pages.Tabro3at.Bank_el_kesa2_el_masry_sak_el_batnya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Baheya_kafalt_mareda_test extends TestBase {
    Baheya_kafalt_mareda kafalaObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            kafalaObj= new  Baheya_kafalt_mareda(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بهية\").instance(0))").click();
            kafalaObj.ClickOnKafaltMareda();
            kafalaObj.raqmElmob("01090019467");
            kafalaObj.raqmElmob1("01090019467");
            kafalaObj.amountEntry("6");
            Assert.assertEquals(kafalaObj.Amount.getText(), "القيمة");
            Assert.assertEquals(kafalaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(kafalaObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(kafalaObj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(kafalaObj.CAFvalue.getText(), "EGP 2.00");
            Assert.assertEquals(kafalaObj.totalValue.getText(), "EGP 8");
            kafalaObj.flow();
            kafalaObj.EnterPIN("0000");
            kafalaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

