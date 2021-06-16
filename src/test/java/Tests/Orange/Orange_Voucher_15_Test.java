package Tests.Orange;
import Pages.Orange.OrangeVouchers_15_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_15_Test extends TestBase {

    OrangeVouchers_15_Page OrangeVoucher_15_Object ;

    @Test
    public  void  OrangeVoucher_15()  throws Exception
    {
        try
        {
            OrangeVoucher_15_Object = new OrangeVouchers_15_Page  (driver) ;
            OrangeVoucher_15_Object.Orangevouchers();
            OrangeVoucher_15_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_15_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_15_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_15_Object.Voucher_15.getText(),"EGP 15.0");
            Assert.assertEquals(OrangeVoucher_15_Object.TotalValue_15.getText(),"EGP 15.0");
            Thread.sleep(3000);
            OrangeVoucher_15_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_15_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_15_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_15_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_15_Object.Receipt_total_cost.getText() ,"15.0 EGP");
            Assert.assertEquals(OrangeVoucher_15_Object.Receipt_footer.getText() ,"شحن 10.5 جنيه رصيد #الكود*102#\t     شحن 800 وحده صالحه 7 ايام #الكود*1*102#شحن 1600 سوبر ميجابايت صالحه 7ايام #الكود*2*102#");
            OrangeVoucher_15_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
