package Tests.Orange;

import Pages.Orange.OrangeTopUp_10_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_10_Test extends TestBase {

    OrangeTopUp_10_Page Orange_Top_Up_10_Object ;

    @Test
    public  void  Orange_Top_up_10 () throws Exception
    {
        try
        {
            Orange_Top_Up_10_Object = new OrangeTopUp_10_Page(driver);
            Orange_Top_Up_10_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_10_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_10_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_10_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_10_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_10_Object.Orange_SelectSlab10();
            Assert.assertEquals(Orange_Top_Up_10_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_10_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_10_Object.Amount10.getText(),"EGP 10.0");
            Assert.assertEquals(Orange_Top_Up_10_Object.TotalAmount_14_3.getText() , "EGP 14.3");
            Orange_Top_Up_10_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_10_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_10_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
