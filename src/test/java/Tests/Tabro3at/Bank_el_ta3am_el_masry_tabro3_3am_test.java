package Tests.Tabro3at;

import Pages.Tabro3at.Bank_el_ta3am_el_masry_tabro3_3am;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_el_ta3am_el_masry_tabro3_3am_test extends TestBase {
    Bank_el_ta3am_el_masry_tabro3_3am tabro3Obj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            tabro3Obj= new  Bank_el_ta3am_el_masry_tabro3_3am(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"بنك الطعام المصري\").instance(0))").click();
            tabro3Obj.ClickOntabro3am();
            tabro3Obj.raqmElmob("01090019467");
            tabro3Obj.raqmElmob1("01090019467");
            tabro3Obj.amountEntry("6");
            Assert.assertEquals(tabro3Obj.Amount.getText(), "القيمة");
            Assert.assertEquals(tabro3Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(tabro3Obj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(tabro3Obj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(tabro3Obj.CAFvalue.getText(), "EGP 2.00");
            Assert.assertEquals(tabro3Obj.totalValue.getText(), "EGP 8");
            tabro3Obj.flow();
            tabro3Obj.EnterPIN("0000");
            tabro3Obj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
