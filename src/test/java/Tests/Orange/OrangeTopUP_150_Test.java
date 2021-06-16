package Tests.Orange;

import Pages.Orange.OrangeTopUp_150_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_150_Test extends TestBase {

    OrangeTopUp_150_Page Orange_Top_Up_150_Object ;

    @Test
    public  void  Orange_Top_up_150 () throws Exception
    {
        try
        {
            Orange_Top_Up_150_Object = new OrangeTopUp_150_Page(driver);
            Orange_Top_Up_150_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_150_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_150_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_150_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_150_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_150_Object.Orange_SelectSlab150();
            Assert.assertEquals(Orange_Top_Up_150_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_150_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_150_Object.Amount150.getText(),"EGP 150.0");
            Assert.assertEquals(Orange_Top_Up_150_Object.TotalAmount_214_5.getText() , "EGP 214.5");
            Orange_Top_Up_150_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_150_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_150_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
