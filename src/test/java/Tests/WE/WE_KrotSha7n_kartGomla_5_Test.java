package Tests.WE;

import Pages.WE.WE_KrotSha7n_KartGomla_5;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kartGomla_5_Test extends TestBase {

    WE_KrotSha7n_KartGomla_5 WE_voucher_5_object;


    @Test
    public  void  WE_KartGomla_Voucher_5 () throws Exception
    {
        try
        {
            WE_voucher_5_object = new WE_KrotSha7n_KartGomla_5(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
            WE_voucher_5_object.ClickOnWEVouchersService();
            WE_voucher_5_object.ClickOnWE_kartGomla();
            WE_voucher_5_object.WEVoucher_slab_5();
            Assert.assertEquals(WE_voucher_5_object.WeVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(WE_voucher_5_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(WE_voucher_5_object.Amount5_0.getText(),"EGP 5.0");
            Assert.assertEquals(WE_voucher_5_object.TotalAmount5_0.getText() , "EGP 5.0");
            WE_voucher_5_object.WEKrotFlow("0000");
            WE_voucher_5_object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
