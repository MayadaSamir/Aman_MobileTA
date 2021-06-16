package Tests.Vodafone;

import Pages.Scroll.ScrollPage;
import Pages.Vodafone.VodafoneCouponesFakah_2_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneCouponesFakah_2_Test extends TestBase {

    VodafoneCouponesFakah_2_Page CouponFakah__Object ;

    @Test
    public  void VodafoneCouponseFakah_2 () throws Exception
    {
        try {
            CouponFakah__Object = new VodafoneCouponesFakah_2_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون فكه\"))").click();
            //CouponFakah__Object.VfCouponesFakahService.click();

            CouponFakah__Object.Flow1();
            Assert.assertEquals(CouponFakah__Object.AmountLable.getText() , "القيمة");
            Assert.assertEquals(CouponFakah__Object.AmountValueE.getText() , "EGP 2.0");
            Assert.assertEquals(CouponFakah__Object.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(CouponFakah__Object.totalamountValue.getText() , "EGP 2.0");
            CouponFakah__Object.flow2("0000");
            Assert.assertEquals(CouponFakah__Object.Receipt_Title.getText() , "كوبون فودافون فكه - كود الشحن");
            Assert.assertEquals(CouponFakah__Object.TotalAmountReceipt.getText() , "2.0 EGP");
            Assert.assertEquals(CouponFakah__Object.Footer.getText() , "لشحن 30 دقيقة أو وحدة وكمان 20 ميجابايت   واتس اب طول اليوم اطلب #كود الشحن858*    للتحكم في الكارت اطلب\n" +
                    " #86*");
            CouponFakah__Object.flow3();
            CouponFakah__Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
