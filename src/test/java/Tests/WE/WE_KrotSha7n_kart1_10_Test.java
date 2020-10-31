package Tests.WE;

import Pages.WE.WE_KrotSha7n_kart1_10;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kart1_10_Test extends TestBase  {

    WE_KrotSha7n_kart1_10 WE_voucher_10_object;


    @Test
    public  void  WE_Kart1_Voucher_10 ()
    {
        WE_voucher_10_object = new WE_KrotSha7n_kart1_10(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
        WE_voucher_10_object.ClickOnWEVouchersService();
        WE_voucher_10_object.ClickOnWE_kart1();
        WE_voucher_10_object.WEVoucher_slab_10();
        Assert.assertEquals(WE_voucher_10_object.WeVoucherAmount.getText() , "القيمة");
        Assert.assertEquals(WE_voucher_10_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
        Assert.assertEquals(WE_voucher_10_object.Amount10_0.getText(),"EGP 10.0");
        Assert.assertEquals(WE_voucher_10_object.TotalAmount10_0.getText() , "EGP 10.0");
        WE_voucher_10_object.WEKrotFlow("0000");
        WE_voucher_10_object.Print();
    }
} // End Class
