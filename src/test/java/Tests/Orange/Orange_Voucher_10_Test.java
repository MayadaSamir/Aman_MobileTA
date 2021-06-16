package Tests.Orange;

import Pages.Orange.OrangeVouchers_10_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_10_Test extends TestBase {

    OrangeVouchers_10_Page OrangeVoucher_10_Object ;

    @Test
    public  void  OrangeVoucher_10()  throws Exception
    {
        try
        {
            OrangeVoucher_10_Object = new OrangeVouchers_10_Page (driver) ;
            OrangeVoucher_10_Object.Orangevouchers();
            OrangeVoucher_10_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_10_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_10_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_10_Object.Voucher10.getText(),"EGP 10.0");
            Assert.assertEquals(OrangeVoucher_10_Object.TotalValue_10.getText(),"EGP 10.0");
            Thread.sleep(3000);
            OrangeVoucher_10_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_10_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_10_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_10_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_10_Object.Receipt_total_cost.getText() ,"10.0 EGP");
            Assert.assertEquals(OrangeVoucher_10_Object.Receipt_footer.getText() ,"شحن 7 جنيه رصيد #الكود*102#\t        شحن 475 وحده صالحه 7 ايام #الكود*1*102#شحن 950 سوبر ميجابايت صالحه 7 ايام #الكود*2*102#");
            OrangeVoucher_10_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

