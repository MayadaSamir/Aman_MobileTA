package Tests.Offers_and_Gifts;

import Pages.Offers_and_Gifts.Raw_Prizes_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Raw_Prizes_Test extends TestBase {

    Raw_Prizes_Page Raw_Object ;

    @Test
    public  void  Raw () throws Exception
    {
        try
        {
            Raw_Object = new Raw_Prizes_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            Raw_Object.ClickOnRaw();
            Assert.assertEquals(Raw_Object.title_of_entry_code_screen.getText() , "الكود");
            Raw_Object.FlowScreen1("");
            Assert.assertEquals(Raw_Object.title_of_entry_codeConfirmation_screen.getText() , "تأكيد الكود");
            Raw_Object.FlowScreen2("");
            Assert.assertEquals(Raw_Object.AmountParameter.getText() , "");
            Assert.assertEquals(Raw_Object.AmountValue.getText() , "");
            Assert.assertEquals(Raw_Object.Message_For_Merchant.getText(), "");
            Raw_Object.flow("0000");
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
