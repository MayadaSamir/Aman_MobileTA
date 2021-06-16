package Tests.Orange;

import Pages.Orange.OrangeTopUp_25_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_25_Test extends TestBase  {
    OrangeTopUp_25_Page Orange_Top_Up_25_Object ;

    @Test
    public  void  Orange_Top_up_25 () throws Exception
    {
        try
        {
            Orange_Top_Up_25_Object = new OrangeTopUp_25_Page(driver);
            Orange_Top_Up_25_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_25_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_25_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_25_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_25_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_25_Object.Orange_SelectSla25();
            Assert.assertEquals(Orange_Top_Up_25_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_25_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_25_Object.Amount25.getText(),"EGP 25.0");
            Assert.assertEquals(Orange_Top_Up_25_Object.TotalAmount_35_75.getText() , "EGP 36.75");
            Orange_Top_Up_25_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_25_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_25_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
