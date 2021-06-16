package Tests.Wallets;

import Pages.Wallets.Vodafone_Transaction_Inquiry_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Vodafone_Transaction_Inquiry_Test extends TestBase {

    Vodafone_Transaction_Inquiry_Page Vodafone_Transaction_Inquiry_Object ;

    @Test
    public  void  VFTrsnsaction_Inquiry () throws Exception
    {
         try
         {
             Vodafone_Transaction_Inquiry_Object   = new  Vodafone_Transaction_Inquiry_Page(driver);
             driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
             Vodafone_Transaction_Inquiry_Object.ClickOnService();
             Vodafone_Transaction_Inquiry_Object.Flow_Screen1("01123115524");
             Vodafone_Transaction_Inquiry_Object.Flow_Screen2("01123115524");
             Assert.assertEquals(Vodafone_Transaction_Inquiry_Object.ScreenTitle.getText() , "عملية سحب نقدي من محفظة ناجحة");
             Vodafone_Transaction_Inquiry_Object.Print();
             Vodafone_Transaction_Inquiry_Object.lastflow();
         }
         catch(Exception e)
         {
             System.out.println(e);
             Assert.fail();
         }
    }
}
