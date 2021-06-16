package Tests.Vodafone;

import Pages.Vodafone.VodafoneVouchersPage_100;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneVouchers_100_Test extends TestBase {

    VodafoneVouchersPage_100 VF_voucher_100_object ;

    @Test
    public  void  VF_Voucher_100 () throws Exception
    {
        try {
            VF_voucher_100_object = new VodafoneVouchersPage_100(driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون\"))").click();
            VF_voucher_100_object.VFVoucher_100_Select();
            Assert.assertEquals(VF_voucher_100_object.VfVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(VF_voucher_100_object.VfVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(VF_voucher_100_object.Amount100.getText(),"EGP 100.0");
            Assert.assertEquals(VF_voucher_100_object.TotalAmount100_00.getText() , "EGP 100.0");
            VF_voucher_100_object.EnterPIN("0000");
            Assert.assertEquals(VF_voucher_100_object.Receipt_Title.getText() , "كوبون فودافون - كود الشحن");
            Assert.assertEquals(VF_voucher_100_object.TotalAmountReceipt.getText(), "100.0 EGP");
            Assert.assertEquals(VF_voucher_100_object.Footer.getText() , "لشحن الكارت  1- 160 دقيقة لكل الشبكات  صالحة لمدة ثلاثه ايام اطلب #كود الشحن *1*858* 2- 160 فليكس صالحة لمدة ثلاثه ايام اطلب     #كود الشحن*2*858*  3- رصيد عادى     اطلب #كود الشحن*858*");
            VF_voucher_100_object.Receipt();
            VF_voucher_100_object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
