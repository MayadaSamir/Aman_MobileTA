package Tests.Orange;

import Pages.Orange.OrangeExtra_3_w_5_Page;
import Pages.Orange.OrangeExtra_4_w_25_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeExtraVoucher_4_w_25_Test extends TestBase {
    OrangeExtra_4_w_25_Page  OrangeExtraVoucher_4_W_25_Object ;

    @Test
    public  void  OrangeExtraVoucher_4_w_25() throws Exception
    {
        try
        {
            OrangeExtraVoucher_4_W_25_Object = new OrangeExtra_4_w_25_Page(driver) ;
            OrangeExtraVoucher_4_W_25_Object.OrangeExtraVoucher();
            OrangeExtraVoucher_4_W_25_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.Voucher4_w_25.getText(),"EGP 4.25");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.TotalValue4_w_25.getText(),"EGP 4.25");
            Thread.sleep(3000);
            OrangeExtraVoucher_4_W_25_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.Receipt_Title.getText() ,"كروت أورنج اكسترا - كود الشحن");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.Voucher_Pin.getText() ,"2885353624273088");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.Voucher_SerialNumber.getText() ,"1700000839502187");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.Receipt_total_cost.getText() ,"4.25 EGP");
            Assert.assertEquals(OrangeExtraVoucher_4_W_25_Object.Receipt_footer.getText() ," ملاحظات للعميل: الشحن من اليسار لليمين    #الكود*102#  ثم إضغط زر الإتصال *تأكد من طباعة الكارت أمامك");
            OrangeExtraVoucher_4_W_25_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
