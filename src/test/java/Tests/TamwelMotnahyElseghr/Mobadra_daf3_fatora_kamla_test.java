package Tests.TamwelMotnahyElseghr;

import Pages.TamwelMotnahyElseghr.Mobadra_daf3_fatora_kamla;
import Pages.TamwelMotnahyElseghr.qest_tamwel_aman;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mobadra_daf3_fatora_kamla_test extends TestBase {

    Mobadra_daf3_fatora_kamla mobdraObj;

    @Test
    public void Test() throws Exception {
        try {
            mobdraObj = new Mobadra_daf3_fatora_kamla(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تمويل متناهى الصغر\").instance(0))").click();
            mobdraObj.ClickOnMobadra();
            mobdraObj.ClickOnDaf3();
            mobdraObj.raqmElID("333");
            mobdraObj.raqmElID1("333");
            mobdraObj.CustomerData();
            mobdraObj.ClickOndaf3FatoraKamla();
            Assert.assertEquals(mobdraObj.Amount.getText(), "القيمة");
            Assert.assertEquals(mobdraObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(mobdraObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(mobdraObj.AmountVALUE.getText(), "EGP 20000.0");
            Assert.assertEquals(mobdraObj.CAFvalue.getText(), "EGP 17.10");
            Assert.assertEquals(mobdraObj.totalValue.getText(), "EGP 20017.1");
            mobdraObj.flow();
            mobdraObj.EnterPIN("0000");
            mobdraObj.print();
        } catch (Exception e) {
            System.out.println(e);
            Assert.fail();
        }
    }
}


