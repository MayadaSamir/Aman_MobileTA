package Tests.Vodafone;
import Pages.Vodafone.VodafoneVouchersPage_7;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneVouchers_7_Test extends TestBase {

    VodafoneVouchersPage_7 VF_voucher_7_object ;


    @Test
    public  void  VF_Voucher_7 () throws Exception
    {
        try {
            VF_voucher_7_object = new VodafoneVouchersPage_7(driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون\"))").click();
            VF_voucher_7_object.VFVoucher_7_Select();
            Assert.assertEquals(VF_voucher_7_object.VfVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(VF_voucher_7_object.VfVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(VF_voucher_7_object.Amount7.getText(),"EGP 7.0");
            Assert.assertEquals(VF_voucher_7_object.TotalAmount7_00.getText() , "EGP 7.0");
            VF_voucher_7_object.EnterPIN("0000");
            Assert.assertEquals(VF_voucher_7_object.Receipt_Title.getText() , "كوبون فودافون - كود الشحن");
            Assert.assertEquals(VF_voucher_7_object.TotalAmountReceipt.getText(), "7.0 EGP");
            Assert.assertEquals(VF_voucher_7_object.Footer.getText() , "لشحن الكارت  1- 160 دقيقة لكل الشبكات  صالحة لمدة ثلاثه ايام اطلب #كود الشحن *1*858* 2- 160 فليكس صالحة لمدة ثلاثه ايام اطلب     #كود الشحن*2*858*  3- رصيد عادى     اطلب #كود الشحن*858*");
            VF_voucher_7_object.Receipt();
            VF_voucher_7_object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
