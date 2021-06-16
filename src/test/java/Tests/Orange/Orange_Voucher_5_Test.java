package Tests.Orange;

import Pages.Orange.OrangeVouchers_5_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_5_Test  extends TestBase {

    OrangeVouchers_5_Page OrangeVoucher_5_Object ;

    @Test
    public  void  OrangeVoucher_5() throws Exception
    {
        try
        {
            OrangeVoucher_5_Object = new OrangeVouchers_5_Page(driver) ;
            OrangeVoucher_5_Object.Orangevouchers();
            OrangeVoucher_5_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_5_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_5_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_5_Object.Voucher_5.getText(),"EGP 5.0");
            Assert.assertEquals(OrangeVoucher_5_Object.TotalValue_5.getText(),"EGP 5.0");
            OrangeVoucher_5_Object.orangeVouchers_flow2("0000");
            // Assert.assertTrue(OrangeVoucher_5_Object.Receipt_AmanLogo.isDisplayed());
            Assert.assertEquals(OrangeVoucher_5_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_5_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_5_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_5_Object.Receipt_total_cost.getText() ,"5.0 EGP");
            Assert.assertEquals(OrangeVoucher_5_Object.Receipt_footer.getText() ,"شحن 3.5 جنيه رصيد #الكود*102#\t      شحن 160 وحده صالحه 3 ايام #الكود*1*102#شحن 320 سوبر ميجابايت صالحه 3 ايام #الكود*2*102#");
            OrangeVoucher_5_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
