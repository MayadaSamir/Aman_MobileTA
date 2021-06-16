package Tests.Orange;
import Pages.Orange.OrangeExtra_1_w_5_Page;
import Pages.Orange.OrangeExtra_2_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeExtraVoucher_2_Test extends TestBase {

    OrangeExtra_2_Page OrangeExtraVoucher_2_Object ;

    @Test
    public  void  OrangeExtraVoucher_2() throws Exception
    {
        try
        {
            OrangeExtraVoucher_2_Object = new OrangeExtra_2_Page(driver) ;
            OrangeExtraVoucher_2_Object.OrangeExtraVoucher();
            OrangeExtraVoucher_2_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeExtraVoucher_2_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.Voucher_2.getText(),"EGP 2.0");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.TotalValue2.getText(),"EGP 2.0");
            Thread.sleep(3000);
            OrangeExtraVoucher_2_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.Receipt_Title.getText() ,"كروت أورنج اكسترا - كود الشحن");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.Voucher_Pin.getText() ,"2885353624273088");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.Voucher_SerialNumber.getText() ,"1700000839502187");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.Receipt_total_cost.getText() ,"2.0 EGP");
            Assert.assertEquals(OrangeExtraVoucher_2_Object.Receipt_footer.getText() ," ملاحظات للعميل: الشحن من اليسار لليمين    #الكود*102#  ثم إضغط زر الإتصال *تأكد من طباعة الكارت أمامك");
            OrangeExtraVoucher_2_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
