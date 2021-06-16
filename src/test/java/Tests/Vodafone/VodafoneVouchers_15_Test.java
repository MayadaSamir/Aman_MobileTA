package Tests.Vodafone;
import Pages.Vodafone.VodafoneVouchersPage_15;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
public class VodafoneVouchers_15_Test extends TestBase {


    VodafoneVouchersPage_15 VF_voucher_15_object ;

    @Test
    public  void  VF_Voucher_15 () throws Exception
    {
        try {
            VF_voucher_15_object = new VodafoneVouchersPage_15(driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون\"))").click();
            VF_voucher_15_object.VFVoucher_15_Select();
            Assert.assertEquals(VF_voucher_15_object.VfVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(VF_voucher_15_object.VfVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(VF_voucher_15_object.Amount15.getText(),"EGP 15.0");
            Assert.assertEquals(VF_voucher_15_object.TotalAmount15_00.getText() , "EGP 15.0");
            VF_voucher_15_object.EnterPIN("0000");
            Assert.assertEquals(VF_voucher_15_object.Receipt_Title.getText() , "كوبون فودافون - كود الشحن");
            Assert.assertEquals(VF_voucher_15_object.TotalAmountReceipt.getText(), "5.0 EGP");
            Assert.assertEquals(VF_voucher_15_object.Footer.getText() , "لشحن الكارت  1- 160 دقيقة لكل الشبكات  صالحة لمدة ثلاثه ايام اطلب #كود الشحن *1*858* 2- 160 فليكس صالحة لمدة ثلاثه ايام اطلب     #كود الشحن*2*858*  3- رصيد عادى     اطلب #كود الشحن*858*");
            VF_voucher_15_object.Receipt();
            VF_voucher_15_object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
