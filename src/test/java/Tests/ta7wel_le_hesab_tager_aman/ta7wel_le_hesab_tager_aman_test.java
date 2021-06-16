package Tests.ta7wel_le_hesab_tager_aman;

import Pages.ta7wel_le_hesab_tager.ta7wel_le_hesab_tager;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ta7wel_le_hesab_tager_aman_test extends TestBase {

    ta7wel_le_hesab_tager ta7welObj;

    // test data : mobile number

    @Test
    public void Test() throws Exception
    {
        try {
            ta7welObj = new ta7wel_le_hesab_tager(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تحويل لحساب تاجر امان\").instance(0))").click();
            ta7welObj.ClickOnTa7wel();
            ta7welObj.raqmElhesab("01090019467");
            ta7welObj.raqmElhesab1("01090019467");
            ta7welObj.amountEntry("6");
            ta7welObj.amountEntryConfirm("6");
            Assert.assertEquals(ta7welObj.Amount.getText(), "القيمة");
            Assert.assertEquals(ta7welObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(ta7welObj.AmountVALUE.getText(), "EGP 6.0");
            Assert.assertEquals(ta7welObj.totalValue.getText(), "EGP 6");
            ta7welObj.flow();
            ta7welObj.EnterPIN("0000");
            ta7welObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
