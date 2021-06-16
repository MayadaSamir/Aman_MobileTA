package Tests.Offers_and_Gifts;

import Pages.Offers_and_Gifts.Nestle_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nestle_Test extends TestBase {

    Nestle_Page Nestle_Object ;

    @Test
    public  void  Nestle () throws Exception
    {
        try
        {
            Nestle_Object = new Nestle_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            Nestle_Object.ClickOnNestleService();
            Assert.assertEquals(Nestle_Object.title_of_entry_code_screen.getText(), "رقم الكود");
            Nestle_Object.FlowScreen1("078683695178");
            Assert.assertEquals(Nestle_Object.title_of_entry_codeConfirmation_screen.getText(),"تأكيد رقم الكود");
            Nestle_Object.FlowScreen2("078683695178");
            Assert.assertEquals(Nestle_Object.estbdal_code_title.getText(),"الكل كسبان");
            Assert.assertEquals(Nestle_Object.AmountParameter.getText(),"القيمة");
            Assert.assertEquals(Nestle_Object.AmountValue.getText(),"EGP 10.0");
            Assert.assertEquals(Nestle_Object.Message_For_Merchant.getText(),"سيتم تحويل10جنية لحساب التاجرتستخدم في الشحن ع الطاير\n");
            Nestle_Object.flow("0000");
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
