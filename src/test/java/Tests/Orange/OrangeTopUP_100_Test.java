package Tests.Orange;

import Pages.Orange.OrangeTopUp_100_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_100_Test extends TestBase {

    OrangeTopUp_100_Page Orange_Top_Up_100_Object ;

    @Test
    public  void  Orange_Top_up_100 () throws Exception
    {
        try
        {
            Orange_Top_Up_100_Object = new OrangeTopUp_100_Page(driver);
            Orange_Top_Up_100_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_100_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_100_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_100_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_100_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_100_Object.Orange_SelectSlab100();
            Assert.assertEquals(Orange_Top_Up_100_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_100_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_100_Object.Amount100.getText(),"EGP 100.0");
            Assert.assertEquals(Orange_Top_Up_100_Object.TotalAmount_143.getText() , "EGP 143");
            Orange_Top_Up_100_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_100_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_100_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
