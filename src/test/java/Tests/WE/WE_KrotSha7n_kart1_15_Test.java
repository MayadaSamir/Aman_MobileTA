package Tests.WE;

import Pages.WE.WE_KrotSha7n_kart1_15;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kart1_15_Test extends TestBase {
    WE_KrotSha7n_kart1_15 WE_voucher_15_object;


    @Test
    public  void  WE_Kart1_Voucher_15 ()
    {
        WE_voucher_15_object = new WE_KrotSha7n_kart1_15(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
        WE_voucher_15_object.ClickOnWEVouchersService();
        WE_voucher_15_object.ClickOnWE_kart1();
        WE_voucher_15_object.WEVoucher_slab_15();
        Assert.assertEquals(WE_voucher_15_object.WeVoucherAmount.getText() , "القيمة");
        Assert.assertEquals(WE_voucher_15_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
        Assert.assertEquals(WE_voucher_15_object.Amount15_0.getText(),"EGP 15.0");
        Assert.assertEquals(WE_voucher_15_object.TotalAmount15_0.getText() , "EGP 15.0");
        WE_voucher_15_object.WEKrotFlow("0000");
        WE_voucher_15_object.Print();
    }

}  // End Class
