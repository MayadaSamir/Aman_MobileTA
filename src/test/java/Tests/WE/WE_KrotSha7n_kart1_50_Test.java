package Tests.WE;

import Pages.WE.WE_KrotSha7n_kart1_50;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kart1_50_Test extends TestBase {
    WE_KrotSha7n_kart1_50 WE_voucher_50_object;


    @Test
    public  void  WE_Kart1_Voucher_50 () throws Exception
    {
        try
        {
            WE_voucher_50_object = new WE_KrotSha7n_kart1_50(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
            WE_voucher_50_object.ClickOnWEVouchersService();
            WE_voucher_50_object.ClickOnWE_kart1();
            WE_voucher_50_object.WEVoucher_slab_50();
            Assert.assertEquals(WE_voucher_50_object.WeVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(WE_voucher_50_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(WE_voucher_50_object.Amount50_0.getText(),"EGP 50.0");
            Assert.assertEquals(WE_voucher_50_object.TotalAmount50_0.getText() , "EGP 50.0");
            WE_voucher_50_object.WEKrotFlow("0000");
            WE_voucher_50_object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
