package Tests.Orange;

import Pages.Orange.OrangeVouchers_50_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_50_Test extends TestBase {

    OrangeVouchers_50_Page OrangeVoucher_50_Object ;

    @Test
    public  void  OrangeVoucher_50() throws Exception
    {
        try
        {
            OrangeVoucher_50_Object = new OrangeVouchers_50_Page (driver) ;
            OrangeVoucher_50_Object.Orangevouchers();
            OrangeVoucher_50_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_50_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_50_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_50_Object.Voucher_50.getText(),"EGP 50.0");
            Assert.assertEquals(OrangeVoucher_50_Object.TotalValue_50.getText(),"EGP 50.0");
            Thread.sleep(3000);
            OrangeVoucher_50_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_50_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_50_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_50_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_50_Object.Receipt_total_cost.getText() ,"50.0 EGP");
            Assert.assertEquals(OrangeVoucher_50_Object.Receipt_footer.getText() ," ملاحظات للعميل: الشحن من اليسار لليمين    #الكود*102#  ثم إضغط زر الإتصال *تأكد من طباعة الكارت أمامك");
            OrangeVoucher_50_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }

    }
}
