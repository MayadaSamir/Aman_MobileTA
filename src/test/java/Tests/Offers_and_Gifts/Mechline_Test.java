package Tests.Offers_and_Gifts;

import Pages.Offers_and_Gifts.Mechline_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mechline_Test extends TestBase {

    Mechline_Page Mechline_Object ;

    @Test
    public  void  Mechline () throws Exception
    {
        try
        {
            Mechline_Object = new Mechline_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            Mechline_Object.ClickOnMechilineService();
            Assert.assertEquals(Mechline_Object.title_of_entry_code_screen.getText(), "رقم الكود");
            Mechline_Object.FlowScreen1("38683695178");
            Assert.assertEquals(Mechline_Object.title_of_entry_codeConfirmation_screen.getText(),"تأكيد رقم الكود");
            Mechline_Object.FlowScreen2("38683695178");
            Assert.assertEquals(Mechline_Object.Micheline_estbdal_code_title.getText(),"استبدال كود ميشلان");
            Assert.assertEquals(Mechline_Object.AmountParameter.getText(),"قيمة الشحن");
            Assert.assertEquals(Mechline_Object.AmountValue.getText(),"EGP 100.0");
            Assert.assertEquals(Mechline_Object.Message_For_Merchant.getText(),"سوف يتم تحويل مبلغ 100 جنية لحساب التاجر لتستخدم فى الشحن على الطاير فى احدى شركات المحمول");
            Mechline_Object.flow("0000");
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
