package Tests.Tabro3at;

import Pages.Tabro3at.Ahl_Masr_3elag_7alat_zakah;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ahl_Masr_3elag_7alat_zakah_test extends TestBase {
    Ahl_Masr_3elag_7alat_zakah halatObj;

    @Test
    public void Test() {
        halatObj= new  Ahl_Masr_3elag_7alat_zakah(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مؤسسة أهل مصر للتنمية\").instance(0))").click();
        halatObj.ClickOn3elag7alat();
        halatObj.ClickOnZakah();
        halatObj.raqmElmob("01090019467");
        halatObj.raqmElmob1("01090019467");
        halatObj.amountEntry("6");
        Assert.assertEquals(halatObj.Amount.getText(), "القيمة");
        Assert.assertEquals(halatObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(halatObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(halatObj.AmountVALUE.getText(), "EGP 15.0");
        Assert.assertEquals(halatObj.CAFvalue.getText(), "EGP 3.00");
        Assert.assertEquals(halatObj.totalValue.getText(), "EGP 18");
        halatObj.flow();
        halatObj.EnterPIN("0000");
        halatObj.print();
    }
}
