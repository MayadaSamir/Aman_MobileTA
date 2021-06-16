package Tests.Orange;
import Pages.Orange.OrangeVouchers_25_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_Voucher_25_Test extends TestBase  {

    OrangeVouchers_25_Page OrangeVoucher_25_Object ;

    @Test
    public  void  OrangeVoucher_25()  throws Exception
    {
        try
        {
            OrangeVoucher_25_Object = new OrangeVouchers_25_Page(driver) ;
            OrangeVoucher_25_Object.Orangevouchers();
            OrangeVoucher_25_Object.OrangeVouchers_flow1();
            Assert.assertEquals(OrangeVoucher_25_Object.Amount.getText() , "القيمة");
            Assert.assertEquals(OrangeVoucher_25_Object.TotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(OrangeVoucher_25_Object.Voucher_25.getText(),"EGP 25.0");
            Assert.assertEquals(OrangeVoucher_25_Object.TotalValue_25.getText(),"EGP 25.0");
            Thread.sleep(3000);
            OrangeVoucher_25_Object.orangeVouchers_flow2("0000");
            Assert.assertEquals(OrangeVoucher_25_Object.Receipt_Title.getText() ,"كروت شحن أورنچ - كود الشحن");
            Assert.assertEquals(OrangeVoucher_25_Object.Voucher_Pin.getText() ,"5952941530835645");
            Assert.assertEquals(OrangeVoucher_25_Object.Voucher_SerialNumber.getText() ,"1700000234497213");
            Assert.assertEquals(OrangeVoucher_25_Object.Receipt_total_cost.getText() ,"25.0 EGP");
            Assert.assertEquals(OrangeVoucher_25_Object.Receipt_footer.getText() ," ملاحظات للعميل: الشحن من اليسار لليمين    #الكود*102#  ثم إضغط زر الإتصال *تأكد من طباعة الكارت أمامك");
            OrangeVoucher_25_Object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
