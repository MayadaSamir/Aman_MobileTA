package Tests.Orange;

import Pages.Orange.OrangeVouchers_7_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_7_Test extends TestBase {

    OrangeVouchers_7_Page OrangeVoucher_7_Object ;

    @Test
    public  void  OrangeVoucher_7() throws Exception
    {
        try
        {
            OrangeVoucher_7_Object = new OrangeVouchers_7_Page(driver) ;
            OrangeVoucher_7_Object.Orangevouchers();
            OrangeVoucher_7_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_7_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_7_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_7_Object.Voucher_7.getText(),"EGP 7.0");
            Assert.assertEquals(OrangeVoucher_7_Object.TotalValue_7.getText(),"EGP 7.0");
            Thread.sleep(3000);
            OrangeVoucher_7_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_7_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_7_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_7_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_7_Object.Receipt_total_cost.getText() ,"7.0 EGP");
            Assert.assertEquals(OrangeVoucher_7_Object.Receipt_footer.getText() ,"شحن 4.9 جنيه رصيد #الكود*102#\t      شحن 300 وحده صالحه 3 ايام #الكود*1*102#شحن 600 سوبر ميجابايت صالحه 3 ايام #الكود*2*102#");
            OrangeVoucher_7_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
