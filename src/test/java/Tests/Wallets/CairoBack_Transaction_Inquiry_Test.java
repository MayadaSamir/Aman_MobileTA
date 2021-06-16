package Tests.Wallets;

import Pages.Wallets.CairoBank_Transaction_Inquiry_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CairoBack_Transaction_Inquiry_Test extends TestBase {
    CairoBank_Transaction_Inquiry_Page CairoBankTransactionInquiryObject ;

    @Test
    public  void  CairoBankTransactionInquiry () throws Exception
    {
        try
        {
            CairoBankTransactionInquiryObject = new CairoBank_Transaction_Inquiry_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
            CairoBankTransactionInquiryObject.ClickOnService();
            CairoBankTransactionInquiryObject.Flow_Screen1("01123115524");
            CairoBankTransactionInquiryObject.Flow_Screen2("01123115524");
            Assert.assertEquals(CairoBankTransactionInquiryObject.ScreenTitle.getText() , "عملية سحب نقدي من محفظة ناجحة");
            CairoBankTransactionInquiryObject.Print();
            CairoBankTransactionInquiryObject.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
