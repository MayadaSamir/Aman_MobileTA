package Tests.Orange;

import Pages.Orange.OrangeVouchers_30_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_30_Test extends TestBase {

    OrangeVouchers_30_Page  OrangeVoucher_30_Object ;

    @Test
    public  void  OrangeVoucher_30() throws Exception
    {
        try
        {
            OrangeVoucher_30_Object = new OrangeVouchers_30_Page(driver) ;
            OrangeVoucher_30_Object.Orangevouchers();
            OrangeVoucher_30_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_30_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_30_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_30_Object.Voucher_30.getText(),"EGP 30.0");
            Assert.assertEquals(OrangeVoucher_30_Object.TotalValue_30.getText(),"EGP 30.0");
            Thread.sleep(3000);
            OrangeVoucher_30_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_30_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_30_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_30_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_30_Object.Receipt_total_cost.getText() ,"30.0 EGP");
            Assert.assertEquals(OrangeVoucher_30_Object.Receipt_footer.getText() ," ملاحظات للعميل: الشحن من اليسار لليمين    #الكود*102#  ثم إضغط زر الإتصال *تأكد من طباعة الكارت أمامك");
            OrangeVoucher_30_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
