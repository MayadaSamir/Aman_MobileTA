package Tests.WE;

import Pages.WE.Sha7n_WE_TopUP_100;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sha7n_WE_TopUP_100_Test extends TestBase {

    Sha7n_WE_TopUP_100 WETopUp_100_Object ;


    @Test
    public  void  WETopUp_100 () throws Exception
    {
        try
        {
            WETopUp_100_Object = new  Sha7n_WE_TopUP_100 (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"شحن وي\").instance(0))").click();
            WETopUp_100_Object.ClickOnWETopUPService();
            Assert.assertEquals(WETopUp_100_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            WETopUp_100_Object.WETopUPScreen1("01091938838");
            Assert.assertEquals(WETopUp_100_Object.ScreenConfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            WETopUp_100_Object.WETopUpScreen2("01091938838");
            WETopUp_100_Object.WE_EnterSlab100();
            Assert.assertEquals(WETopUp_100_Object.AmountEntryScreenTitle.getText() ,"أدخل المبلغ من 5 إلى 300");
            WETopUp_100_Object.WETopUpScreen3("100");
            Assert.assertEquals(WETopUp_100_Object.WETopUpAmount.getText() , "القيمة");
            Assert.assertEquals(WETopUp_100_Object.WETopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(WETopUp_100_Object.Amount100_0.getText(),"EGP 100.0");
            Assert.assertEquals(WETopUp_100_Object.TotalAmount100.getText() , "EGP 100");
            WETopUp_100_Object.WEFlow("0000");
            Assert.assertEquals(WETopUp_100_Object.Successful_Message.getText(),"عملية ناجحة");
            WETopUp_100_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
