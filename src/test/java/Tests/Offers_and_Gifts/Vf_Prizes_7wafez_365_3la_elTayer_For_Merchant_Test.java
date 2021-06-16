package Tests.Offers_and_Gifts;

import Pages.Offers_and_Gifts.Vf_Prizes_7wafez_365_3la_elTayer_For_Merchant_Page;
import Pages.Offers_and_Gifts.Vf_Prizes_orod_365_3la_elTayer_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vf_Prizes_7wafez_365_3la_elTayer_For_Merchant_Test extends TestBase {

   Vf_Prizes_7wafez_365_3la_elTayer_For_Merchant_Page  Hawafez_object ;

   @Test
   public  void  hawafez_for_merchant () throws Exception
   {
        try
        {
            Hawafez_object = new Vf_Prizes_7wafez_365_3la_elTayer_For_Merchant_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            Hawafez_object.ClickOnService();
            Assert.assertEquals(Hawafez_object.hawafez.getText() , "حوافز:370\n");
            Hawafez_object.flow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
   }
}
