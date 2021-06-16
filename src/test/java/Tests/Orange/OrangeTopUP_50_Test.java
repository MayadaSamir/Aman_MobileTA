package Tests.Orange;
import Pages.Orange.OrangeTopUp_50_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
public class OrangeTopUP_50_Test extends TestBase {

    OrangeTopUp_50_Page Orange_Top_Up_50_Object ;

    @Test
    public  void  Orange_Top_up_50 () throws Exception
    {
        try
        {
            Orange_Top_Up_50_Object = new OrangeTopUp_50_Page(driver);
            Orange_Top_Up_50_Object.OrangeTopUp();
            Assert.assertEquals(Orange_Top_Up_50_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
            Orange_Top_Up_50_Object.OrangeTopUPScreen1("01123115524");
            Assert.assertEquals(Orange_Top_Up_50_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
            Orange_Top_Up_50_Object.OrangeETopUpScreen2("01123115524"); ;
            Orange_Top_Up_50_Object.Orange_SelectSla50();
            Assert.assertEquals(Orange_Top_Up_50_Object.TopUpAmount.getText() , "القيمة");
            Assert.assertEquals(Orange_Top_Up_50_Object.TopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(Orange_Top_Up_50_Object.Amount50.getText(),"EGP 50.0");
            Assert.assertEquals(Orange_Top_Up_50_Object.TotalAmount_71_5.getText() , "EGP 71.5");
            Orange_Top_Up_50_Object.OrangeFlow("0000");
            Assert.assertEquals(Orange_Top_Up_50_Object.Successfull_Message.getText(),"عملية ناجحة");
            Orange_Top_Up_50_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
