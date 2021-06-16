package Tests.Orange;

import Pages.Orange.OrangeTopUp_15_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_15_Test extends TestBase {

    OrangeTopUp_15_Page Orange_Top_Up_15_Object ;

    @Test
    public  void  Orange_Top_up_15 () throws Exception
    {
        try
        {
            Orange_Top_Up_15_Object = new OrangeTopUp_15_Page(driver);
            Orange_Top_Up_15_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_15_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_15_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_15_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_15_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_15_Object.Orange_SelectSlab15();
            Assert.assertEquals(Orange_Top_Up_15_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_15_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_15_Object.Amount15.getText(),"EGP 15.0");
            Assert.assertEquals(Orange_Top_Up_15_Object.TotalAmount_21_45.getText() , "EGP 21.45");
            Orange_Top_Up_15_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_15_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_15_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
