package Tests.Offers_and_Gifts;
import Pages.Offers_and_Gifts.Etisalat_Prizes_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Prizes_Test extends TestBase {

    Etisalat_Prizes_Page EtisalatPrizes_Object ;

    @Test
    public  void  Etisalat_Prizes () throws Exception
    {
        try
        {
            EtisalatPrizes_Object = new Etisalat_Prizes_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            EtisalatPrizes_Object.ClickOnEtisalatPrizesService();
            Assert.assertEquals(EtisalatPrizes_Object.title_of_entry_refnum_screen.getText() ,"كود الإستبدال النقدى");
            EtisalatPrizes_Object.FlowScreen1("123");
            Assert.assertEquals(EtisalatPrizes_Object.title_of_entry_refnumConfirmation_screen.getText(),"تأكيد كود الإستبدال النقدى");
            EtisalatPrizes_Object.FlowScreen2("123");
            Assert.assertEquals(EtisalatPrizes_Object.AmountParameter.getText() , "القيمة");
            Assert.assertEquals(EtisalatPrizes_Object.AmountValue.getText() , "EGP 5.0");
            EtisalatPrizes_Object.flow("0000");
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
