package Tests.Orange;

import Pages.Orange.OrangeExtra_1_w_5_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeExtraVoucher_1_w_5_Test extends TestBase {

    OrangeExtra_1_w_5_Page  OrangeExtraVoucher1_w_5_Object ;

    @Test
    public  void  OrangeExtraVoucher_1_w_5() throws Exception
    {
        try
        {
            OrangeExtraVoucher1_w_5_Object = new OrangeExtra_1_w_5_Page(driver) ;
            OrangeExtraVoucher1_w_5_Object.OrangeExtraVoucher();
            OrangeExtraVoucher1_w_5_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.Voucher_1_w_5.getText(),"EGP 1.5");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.TotalValue_1_w_5.getText(),"EGP 1.5");
            Thread.sleep(3000);
            OrangeExtraVoucher1_w_5_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.Receipt_Title.getText() ,"كروت أورنج اكسترا - كود الشحن");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.Voucher_Pin.getText() ,"2885353624273088");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.Voucher_SerialNumber.getText() ,"1700000839502187");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.Receipt_total_cost.getText() ,"1.5 EGP");
            Assert.assertEquals(OrangeExtraVoucher1_w_5_Object.Receipt_footer.getText() ," ملاحظات للعميل: الشحن من اليسار لليمين    #الكود*102#  ثم إضغط زر الإتصال *تأكد من طباعة الكارت أمامك");
            OrangeExtraVoucher1_w_5_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
