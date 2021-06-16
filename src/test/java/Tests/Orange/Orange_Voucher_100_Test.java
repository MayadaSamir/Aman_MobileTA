package Tests.Orange;

import Pages.Orange.OrangeVouchers_100_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_100_Test extends TestBase {

    OrangeVouchers_100_Page OrangeVoucher_100_Object ;

    @Test
    public  void  OrangeVoucher_50() throws Exception
    {
        try
        {
            OrangeVoucher_100_Object = new OrangeVouchers_100_Page (driver) ;
            OrangeVoucher_100_Object.Orangevouchers();
            OrangeVoucher_100_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_100_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_100_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_100_Object.Voucher_100.getText(),"EGP 100.0");
            Assert.assertEquals(OrangeVoucher_100_Object.TotalValue_100.getText(),"EGP 100.0");
            Thread.sleep(3000);
            OrangeVoucher_100_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_100_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_100_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_100_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_100_Object.Receipt_total_cost.getText() ,"100.0 EGP");
            Assert.assertEquals(OrangeVoucher_100_Object.Receipt_footer.getText() ," ملاحظات للعميل: الشحن من اليسار لليمين    #الكود*102#  ثم إضغط زر الإتصال *تأكد من طباعة الكارت أمامك");
            OrangeVoucher_100_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
