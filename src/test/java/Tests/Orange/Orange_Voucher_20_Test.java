package Tests.Orange;

import Pages.Orange.OrangeVouchers_20_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_20_Test extends TestBase {

    OrangeVouchers_20_Page OrangeVoucher_20_Object ;

    @Test
    public  void  OrangeVoucher_20()  throws Exception
    {
        try
        {
            OrangeVoucher_20_Object = new OrangeVouchers_20_Page(driver) ;
            OrangeVoucher_20_Object.Orangevouchers();
            OrangeVoucher_20_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_20_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_20_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_20_Object.Voucher_20.getText(),"EGP 20.0");
            Assert.assertEquals(OrangeVoucher_20_Object.TotalValue_20.getText(),"EGP 20.0");
            Thread.sleep(3000);
            OrangeVoucher_20_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_20_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_20_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_20_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_20_Object.Receipt_total_cost.getText() ,"20.0 EGP");
            Assert.assertEquals(OrangeVoucher_20_Object.Receipt_footer.getText() ,"شحن 14 جنيه رصيد #الكود*102#\t       شحن 1000وحده صالحه 7 ايام #الكود*1*102#شحن2000سوبر ميجابايت صالحه10ايام #الكود*2*102#");
            OrangeVoucher_20_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
