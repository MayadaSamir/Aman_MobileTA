package Tests.WE;

import Pages.WE.Sha7n_WE_TopUP_300;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sha7n_WE_TopUP_300_Test extends TestBase {

    Sha7n_WE_TopUP_300 WETopUp_300_Object ;


    @Test
    public  void  WETopUp_300 ()
    {
        WETopUp_300_Object = new  Sha7n_WE_TopUP_300 (driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"شحن وي\").instance(0))").click();
        WETopUp_300_Object.ClickOnWETopUPService();
        Assert.assertEquals(WETopUp_300_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
        WETopUp_300_Object.WETopUPScreen1("01091938838");
        Assert.assertEquals(WETopUp_300_Object.ScreenConfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
        WETopUp_300_Object.WETopUpScreen2("01091938838");
        WETopUp_300_Object.WE_EnterSlab300();
        Assert.assertEquals(WETopUp_300_Object.AmountEntryScreenTitle.getText() ,"أدخل المبلغ من 5 إلى 300");
        WETopUp_300_Object.WETopUpScreen3("300");
        Assert.assertEquals(WETopUp_300_Object.WETopUpAmount.getText() , "القيمة");
        Assert.assertEquals(WETopUp_300_Object.WETopUpTotalAmount.getText() , "المبلغ الكلى");
        Assert.assertEquals(WETopUp_300_Object.Amount300_0.getText(),"EGP 300.0");
        Assert.assertEquals(WETopUp_300_Object.TotalAmount300.getText() , "EGP 300");
        WETopUp_300_Object.WEFlow("0000");
        Assert.assertEquals(WETopUp_300_Object.Successful_Message.getText(),"عملية ناجحة");
        WETopUp_300_Object.Print();
    }  // End Test

}  // End Class
