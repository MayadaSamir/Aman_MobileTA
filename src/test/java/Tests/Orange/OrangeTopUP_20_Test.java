package Tests.Orange;

import Pages.Orange.OrangeTopUp_20_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_20_Test extends TestBase {

    OrangeTopUp_20_Page Orange_Top_Up_20_Object ;

    @Test
    public  void  Orange_Top_up_20 () throws Exception
    {
        try
        {
            Orange_Top_Up_20_Object = new OrangeTopUp_20_Page(driver);
            Orange_Top_Up_20_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_20_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_20_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_20_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_20_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_20_Object.Orange_SelectSla20();
            Assert.assertEquals(Orange_Top_Up_20_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_20_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_20_Object.Amount20.getText(),"EGP 20.0");
            Assert.assertEquals(Orange_Top_Up_20_Object.TotalAmount_28_6.getText() , "EGP 28.6");
            Orange_Top_Up_20_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_20_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_20_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
