package Tests.WE;

import Pages.WE.WE_KrotSha7n_kartGomla_100;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kartGomla_100_Test extends TestBase {
    WE_KrotSha7n_kartGomla_100 WE_voucher_100_object;


    @Test
    public  void  WE_KartGomla_Voucher_100 () throws Exception
    {
        try
        {
            WE_voucher_100_object = new WE_KrotSha7n_kartGomla_100(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
            WE_voucher_100_object.ClickOnWEVouchersService();
            WE_voucher_100_object.ClickOnWE_kartGomla();
            WE_voucher_100_object.WEVoucher_slab_100();
            Assert.assertEquals(WE_voucher_100_object.WeVoucherAmount.getText() , "القيمة");
            Assert.assertEquals(WE_voucher_100_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
            Assert.assertEquals(WE_voucher_100_object.Amount100_0.getText(),"EGP 100.0");
            Assert.assertEquals(WE_voucher_100_object.TotalAmount100_0.getText() , "EGP 100.0");
            WE_voucher_100_object.WEKrotFlow("0000");
            WE_voucher_100_object.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}


