package Tests.Offers_and_Gifts;
import Pages.Offers_and_Gifts.Vf_Prizes_orod_365_3la_elTayer_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vf_Prizes_orod_365_3la_elTayer_Test extends TestBase {

    Vf_Prizes_orod_365_3la_elTayer_Page   VFprize_Object ;

    @Test
    public  void  Vf_Prize_365_3la_Eltayer () throws Exception
    {
        try
        {
            VFprize_Object = new Vf_Prizes_orod_365_3la_elTayer_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            VFprize_Object.ClickOnService();
            Assert.assertEquals(VFprize_Object.title_of_entry_code_screen.getText() , "رقم المحمول");
            VFprize_Object.FlowScreen1("01123115566");
            Assert.assertEquals(VFprize_Object.title_of_entry_codeConfirmation_screen.getText() , "أعد إدخال رقم المحمول");
            VFprize_Object.FlowScreen2("01123115566");
            VFprize_Object.flow();
            Assert.assertTrue(VFprize_Object.Details_offer.isDisplayed());
            VFprize_Object.flow2();
            Assert.assertEquals(VFprize_Object.confirmation_For_Eshtrak.getText() , "تم ارسال رسالة للعميل للتأكيد");
            VFprize_Object.flow3();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
