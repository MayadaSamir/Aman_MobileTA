package Tests.WE;

import Pages.WE.WE_KrotSha7n_kart1_75;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kart1_75_Test extends TestBase {
    WE_KrotSha7n_kart1_75 WE_voucher_75_object;


    @Test
    public  void  WE_Kart1_Voucher_75 () throws Exception
    {
        try
        {
            WE_voucher_75_object = new WE_KrotSha7n_kart1_75(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
            WE_voucher_75_object.ClickOnWEVouchersService();
            WE_voucher_75_object.ClickOnWE_kart1();
            WE_voucher_75_object.WEVoucher_slab_75();
            Assert.assertEquals(WE_voucher_75_object.WeVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(WE_voucher_75_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(WE_voucher_75_object.Amount75_0.getText(),"EGP 75.0");
            Assert.assertEquals(WE_voucher_75_object.TotalAmount75_0.getText() , "EGP 75.0");
            WE_voucher_75_object.WEKrotFlow("0000");
            WE_voucher_75_object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

