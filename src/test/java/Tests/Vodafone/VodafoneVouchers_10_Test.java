package Tests.Vodafone;

import Pages.Vodafone.VodafoneVouchersPage_10;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneVouchers_10_Test  extends TestBase {

    VodafoneVouchersPage_10 VF_voucher_10_object ;


    @Test
    public  void  VF_Voucher_10 () throws Exception
    {
        try {
            VF_voucher_10_object = new VodafoneVouchersPage_10(driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون\"))").click();
            VF_voucher_10_object.VFVoucher_10_Select();
            Assert.assertEquals(VF_voucher_10_object.VfVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(VF_voucher_10_object.VfVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(VF_voucher_10_object.Amount10.getText(),"EGP 10.0");
            Assert.assertEquals(VF_voucher_10_object.TotalAmount10_00.getText() , "EGP 10.0");
            VF_voucher_10_object.EnterPIN("0000");
            Assert.assertEquals(VF_voucher_10_object.Receipt_Title.getText() , "كوبون فودافون - كود الشحن");
            Assert.assertEquals(VF_voucher_10_object.TotalAmountReceipt.getText(), "10.0 EGP");
            Assert.assertEquals(VF_voucher_10_object.Footer.getText() , "لشحن الكارت  1- 160 دقيقة لكل الشبكات  صالحة لمدة ثلاثه ايام اطلب #كود الشحن *1*858* 2- 160 فليكس صالحة لمدة ثلاثه ايام اطلب     #كود الشحن*2*858*  3- رصيد عادى     اطلب #كود الشحن*858*");
            VF_voucher_10_object.Receipt();
            VF_voucher_10_object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
