package Tests.WE;

import Pages.WE.Sha7n_WE_TopUP_5;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sha7n_WE_TopUP_5_Test extends TestBase {

    Sha7n_WE_TopUP_5 WETopUp_5_Object ;

    @Test
    public  void  WETopUp_5 () throws Exception
    {
        try
        {
            WETopUp_5_Object = new  Sha7n_WE_TopUP_5 (driver);
            WETopUp_5_Object.ClickOnWETopUPService();
            Assert.assertEquals(WETopUp_5_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            WETopUp_5_Object.WETopUPScreen1("01091938838");
            Assert.assertEquals(WETopUp_5_Object.ScreenConfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            WETopUp_5_Object.WETopUpScreen2("01091938838");
            WETopUp_5_Object.WE_EnterSlab5();
            Assert.assertEquals(WETopUp_5_Object.AmountEntryScreenTitle.getText(),"أدخل المبلغ\n" +
                    "من 5 إلى 300" );
            WETopUp_5_Object.WETopUpScreen3("5");
            Assert.assertEquals(WETopUp_5_Object.WETopUpAmount.getText() , "القيمة");
            Assert.assertEquals(WETopUp_5_Object.WETopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(WETopUp_5_Object.Amount5_0.getText(),"EGP 5.0");
            Assert.assertEquals(WETopUp_5_Object.TotalAmount5.getText() , "EGP 5");
            WETopUp_5_Object.WEFlow("0000");
            Assert.assertEquals(WETopUp_5_Object.Successful_Message.getText(),"عملية ناجحة");
            WETopUp_5_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }  // End Test
}
