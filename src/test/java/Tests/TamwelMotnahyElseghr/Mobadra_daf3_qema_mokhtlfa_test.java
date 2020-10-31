package Tests.TamwelMotnahyElseghr;

import Pages.TamwelMotnahyElseghr.Mobadra_daf3_fatora_kamla;
import Pages.TamwelMotnahyElseghr.Mobadra_daf3_qema_mokhtlfa;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mobadra_daf3_qema_mokhtlfa_test extends TestBase {

    Mobadra_daf3_qema_mokhtlfa mobdraObj;

    @Test
    public void Test() {
        mobdraObj = new Mobadra_daf3_qema_mokhtlfa(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تمويل متناهى الصغر\").instance(0))").click();
        mobdraObj.ClickOnMobadra();
        mobdraObj.ClickOnDaf3();
        mobdraObj.raqmElID("333");
        mobdraObj.raqmElID1("333");
        mobdraObj.CustomerData();
        mobdraObj.ClickOndaf3qemaMokthlfa();
        mobdraObj.amountEntry("87");
        Assert.assertEquals(mobdraObj.Amount.getText(), "القيمة");
        Assert.assertEquals(mobdraObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(mobdraObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(mobdraObj.AmountVALUE.getText(), "EGP 36.0");
        Assert.assertEquals(mobdraObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(mobdraObj.totalValue.getText(), "EGP 41.7");
        mobdraObj.flow();
        mobdraObj.EnterPIN("0000");
        mobdraObj.print();
    }
}

