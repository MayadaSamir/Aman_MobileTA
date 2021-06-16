package Tests.Tabro3at;

import Pages.Tabro3at.Ahl_Masr_3elag_7alat_sadqa;
import Pages.Tabro3at.Ahl_Masr_ensh2at_mostshfa_zakah;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ahl_Masr_ensh2at_mostshfa_zakah_test extends TestBase {

    Ahl_Masr_ensh2at_mostshfa_zakah ensh2atObj;

    @Test
    public void Test() throws Exception
    {
        try
        {
            ensh2atObj= new Ahl_Masr_ensh2at_mostshfa_zakah(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مؤسسة أهل مصر للتنمية\").instance(0))").click();
            ensh2atObj.ClickOnensh2at();
            ensh2atObj.ClickOnZakah();
            ensh2atObj.raqmElmob("01090019467");
            ensh2atObj.raqmElmob1("01090019467");
            ensh2atObj.amountEntry("6");
            Assert.assertEquals(ensh2atObj.Amount.getText(), "القيمة");
            Assert.assertEquals(ensh2atObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(ensh2atObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(ensh2atObj.AmountVALUE.getText(), "EGP 15.0");
            Assert.assertEquals(ensh2atObj.CAFvalue.getText(), "EGP 3.00");
            Assert.assertEquals(ensh2atObj.totalValue.getText(), "EGP 18");
            ensh2atObj.flow();
            ensh2atObj.EnterPIN("0000");
            ensh2atObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

