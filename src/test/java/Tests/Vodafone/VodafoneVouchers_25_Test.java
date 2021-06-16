package Tests.Vodafone;
import Pages.Vodafone.VodafoneVouchersPage_25;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
public class VodafoneVouchers_25_Test extends TestBase {

    VodafoneVouchersPage_25 VF_voucher_25_object ;

    @Test
    public  void  VF_Voucher_25 () throws Exception
    {
        try {
            VF_voucher_25_object = new VodafoneVouchersPage_25(driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون\"))").click();
            VF_voucher_25_object.VFVoucher_25_Select();
            Assert.assertEquals(VF_voucher_25_object.VfVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(VF_voucher_25_object.VfVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(VF_voucher_25_object.Amount25.getText(),"EGP 25.0");
            Assert.assertEquals(VF_voucher_25_object.TotalAmount25_00.getText() , "EGP 25.0");
            VF_voucher_25_object.EnterPIN("0000");
            Assert.assertEquals(VF_voucher_25_object.Receipt_Title.getText() , "كوبون فودافون - كود الشحن");
            Assert.assertEquals(VF_voucher_25_object.TotalAmountReceipt.getText(), "25.0 EGP");
            Assert.assertEquals(VF_voucher_25_object.Footer.getText() , "لشحن الكارت  1- 160 دقيقة لكل الشبكات  صالحة لمدة ثلاثه ايام اطلب #كود الشحن *1*858* 2- 160 فليكس صالحة لمدة ثلاثه ايام اطلب     #كود الشحن*2*858*  3- رصيد عادى     اطلب #كود الشحن*858*");
            VF_voucher_25_object.Receipt();
            VF_voucher_25_object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
