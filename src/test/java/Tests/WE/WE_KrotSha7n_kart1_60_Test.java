package Tests.WE;

import Pages.WE.WE_KrotSha7n_kart1_60;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kart1_60_Test extends TestBase {
    WE_KrotSha7n_kart1_60 WE_voucher_60_object;


    @Test
    public  void  WE_Kart1_Voucher_60 ()
    {
        WE_voucher_60_object = new WE_KrotSha7n_kart1_60(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
        WE_voucher_60_object.ClickOnWEVouchersService();
        WE_voucher_60_object.ClickOnWE_kart1();
        WE_voucher_60_object.WEVoucher_slab_60();
        Assert.assertEquals(WE_voucher_60_object.WeVoucherAmount.getText() , "القيمة");
        Assert.assertEquals(WE_voucher_60_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
        Assert.assertEquals(WE_voucher_60_object.Amount60_0.getText(),"EGP 60.0");
        Assert.assertEquals(WE_voucher_60_object.TotalAmount60_0.getText() , "EGP 60.0");
        WE_voucher_60_object.WEKrotFlow("0000");
        WE_voucher_60_object.Print();
    }

}  // End Class

