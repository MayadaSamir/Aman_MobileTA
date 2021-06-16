package Tests.Orange;

import Pages.Orange.OrangeTopUp_5_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_5_Test extends TestBase {

    OrangeTopUp_5_Page  Orange_Top_Up_5_Object ;

    @Test
    public  void  Orange_Top_up_5 () throws Exception
    {
        try
        {
            Orange_Top_Up_5_Object = new OrangeTopUp_5_Page(driver);
            Orange_Top_Up_5_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_5_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_5_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_5_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_5_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_5_Object.Orange_SelectSlab5();
            Assert.assertEquals(Orange_Top_Up_5_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_5_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_5_Object.Amount5.getText(),"EGP 5.0");
            Assert.assertEquals(Orange_Top_Up_5_Object.TotalAmount7_15.getText() , "EGP 7.15");
            Orange_Top_Up_5_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_5_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_5_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
