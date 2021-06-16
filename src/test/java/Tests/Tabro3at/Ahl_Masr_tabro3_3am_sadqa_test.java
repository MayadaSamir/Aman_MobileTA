package Tests.Tabro3at;

import Pages.Tabro3at.Ahl_Masr_tabro3_3am_sadqa;
import Pages.Tabro3at.Ahl_Masr_tabro3_3am_zakah;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ahl_Masr_tabro3_3am_sadqa_test extends TestBase {
    Ahl_Masr_tabro3_3am_sadqa tabro3Obj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            tabro3Obj= new Ahl_Masr_tabro3_3am_sadqa(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مؤسسة أهل مصر للتنمية\").instance(0))").click();
            tabro3Obj.ClickOnTabro3();
            tabro3Obj.ClickOnSadqa();
            tabro3Obj.raqmElmob("01090019467");
            tabro3Obj.raqmElmob1("01090019467");
            tabro3Obj.amountEntry("6");
            Assert.assertEquals(tabro3Obj.Amount.getText(), "القيمة");
            Assert.assertEquals(tabro3Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(tabro3Obj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(tabro3Obj.AmountVALUE.getText(), "EGP 15.0");
            Assert.assertEquals(tabro3Obj.CAFvalue.getText(), "EGP 3.00");
            Assert.assertEquals(tabro3Obj.totalValue.getText(), "EGP 18");
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

