package Tests.Vodafone;

import Pages.Vodafone.VodafoneVouchersPage_5;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneVouchers_5_Test extends TestBase {

    VodafoneVouchersPage_5 VF_voucher_5_object ;


    @Test
    public  void  VF_Voucher_5 () throws Exception
    {
        try {
            VF_voucher_5_object = new VodafoneVouchersPage_5(driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون\"))").click();
            VF_voucher_5_object.VFVoucher_5_Select();
            Assert.assertEquals(VF_voucher_5_object.VfVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(VF_voucher_5_object.VfVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(VF_voucher_5_object.Amount5.getText(),"EGP 5.0");
            Assert.assertEquals(VF_voucher_5_object.TotalAmount5_00.getText() , "EGP 5.0");
            VF_voucher_5_object.EnterPIN("0000");
            Assert.assertEquals(VF_voucher_5_object.Receipt_Title.getText() , "كوبون فودافون - كود الشحن");
            Assert.assertEquals(VF_voucher_5_object.TotalAmountReceipt.getText(), "5.0 EGP");
            Assert.assertEquals(VF_voucher_5_object.Footer.getText() , "لشحن الكارت  1- 160 دقيقة لكل الشبكات  صالحة لمدة ثلاثه ايام اطلب #كود الشحن *1*858* 2- 160 فليكس صالحة لمدة ثلاثه ايام اطلب     #كود الشحن*2*858*  3- رصيد عادى     اطلب #كود الشحن*858*");
            VF_voucher_5_object.Receipt();
            VF_voucher_5_object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
