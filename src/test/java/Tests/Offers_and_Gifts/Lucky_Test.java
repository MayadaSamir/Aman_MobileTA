package Tests.Offers_and_Gifts;

import Pages.Offers_and_Gifts.Lucky_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lucky_Test extends TestBase {

    Lucky_Page LuckyObject ;

    @Test
    public void  Lucky () throws Exception
    {
        try
        {
            LuckyObject = new Lucky_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            LuckyObject.ClickOnLuckyService();
            Assert.assertEquals(LuckyObject.title_of_entry_refnum_screen.getText() ,"كود الإستبدال النقدى");
            LuckyObject.FlowScreen1("178683695199");
            Assert.assertEquals(LuckyObject.title_of_entry_refnumConfirmation_screen.getText(),"تأكيد كود الإستبدال النقدى");
            LuckyObject.FlowScreen2("178683695199");
            Assert.assertEquals(LuckyObject.AmountParameter.getText() , "قيمة الشحن");
            Assert.assertEquals(LuckyObject.AmountValue.getText() , "EGP 25.0");
            Assert.assertEquals(LuckyObject.Message_For_Merchant.getText() , "سوف يتم تحويل 25 جنيه لحسابك لشحن محمول العميل");
            LuckyObject.flow("0000");
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
