package Tests.Orange;

import Pages.Orange.OrangeTopUp_200_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeTopUP_200_Test extends TestBase {

    OrangeTopUp_200_Page Orange_Top_Up_200_Object ;

    @Test
    public  void  Orange_Top_up_200 () throws Exception
    {
        try
        {
            Orange_Top_Up_200_Object = new OrangeTopUp_200_Page(driver);
            Orange_Top_Up_200_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_200_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_200_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_200_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_200_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_200_Object.Orange_SelectSlab200();
            Assert.assertEquals(Orange_Top_Up_200_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_200_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_200_Object.Amount200.getText(),"EGP 200.0");
            Assert.assertEquals(Orange_Top_Up_200_Object.TotalAmount_286.getText() , "EGP 286");
            Orange_Top_Up_200_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_200_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_200_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
