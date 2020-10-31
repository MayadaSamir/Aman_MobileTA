package Tests.WE;

import Pages.WE.WE_KrotSha7n_kartGomla_150;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WE_KrotSha7n_kartGomla_150_Test extends TestBase {

    WE_KrotSha7n_kartGomla_150 WE_voucher_150_object;


    @Test
    public  void  WE_KartGomla_Voucher_150 ()
    {
        WE_voucher_150_object = new WE_KrotSha7n_kartGomla_150(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"كروت شحن وي\").instance(0))").click();
        WE_voucher_150_object.ClickOnWEVouchersService();
        WE_voucher_150_object.ClickOnWE_kartGomla();
        WE_voucher_150_object.WEVoucher_slab_150();
        Assert.assertEquals(WE_voucher_150_object.WeVoucherAmount.getText() , "القيمة");
        Assert.assertEquals(WE_voucher_150_object.WeVoucherTotalAmount.getText() , "المبلغ الكلي");
        Assert.assertEquals(WE_voucher_150_object.Amount150_0.getText(),"EGP 150.0");
        Assert.assertEquals(WE_voucher_150_object.TotalAmount150_0.getText() , "EGP 150.0");
        WE_voucher_150_object.WEKrotFlow("0000");
        WE_voucher_150_object.Print();
    }

}  // End Class
