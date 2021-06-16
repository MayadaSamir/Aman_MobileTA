package Tests.WE;

import Pages.WE.WE_KrotSha7n_kart1_25;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kart1_25_Test extends TestBase {
    WE_KrotSha7n_kart1_25 WE_voucher_25_object;


    @Test
    public  void  WE_Kart1_Voucher_25  () throws Exception
    {
        try
        {
            WE_voucher_25_object = new WE_KrotSha7n_kart1_25(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
            WE_voucher_25_object.ClickOnWEVouchersService();
            WE_voucher_25_object.ClickOnWE_kart1();
            WE_voucher_25_object.WEVoucher_slab_25();
            Assert.assertEquals(WE_voucher_25_object.WeVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(WE_voucher_25_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(WE_voucher_25_object.Amount25_0.getText(),"EGP 25.0");
            Assert.assertEquals(WE_voucher_25_object.TotalAmount25_0.getText() , "EGP 25.0");
            WE_voucher_25_object.WEKrotFlow("0000");
            WE_voucher_25_object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

