package Tests.Vodafone;
import Pages.Vodafone.VodafoneCouponesFakah_8_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneCouponesFakah_8_Test extends TestBase {
    VodafoneCouponesFakah_8_Page CouponFakah_Object ;

    @Test
    public  void VodafoneCouponseFakah_8 () throws Exception

    {
        try
        {
            CouponFakah_Object = new VodafoneCouponesFakah_8_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون فكه\"))").click();

            CouponFakah_Object.Flow1();
            Assert.assertEquals(CouponFakah_Object.AmountLable.getText() , "القيمة");
            Assert.assertEquals(CouponFakah_Object.AmountValueE.getText() , "EGP 8.0");
            Assert.assertEquals(CouponFakah_Object.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(CouponFakah_Object.totalamountValue.getText() , "EGP 8.0");
            CouponFakah_Object.flow2("0000");
            Assert.assertEquals(CouponFakah_Object.Receipt_Title.getText() , "كوبون فودافون فكه - كود الشحن");
            Assert.assertEquals(CouponFakah_Object.TotalAmountReceipt.getText() , "8.0 EGP");
            Assert.assertEquals(CouponFakah_Object.Footer.getText() , "لشحن 350 دقيقة او وحده و كمان 50 ميجابايت واتس اب لمدة 4 ايام اطلب *858*كود الشحن# للتحكم في الكارت اطلب #86*\n" +
                    "\n" +
                    "لشحن 700 سوشيال ميجابايت و كمان 50 ميجابايت واتس اب لمدة 4 ايام اطلب *858*4*كود الشحن#");
            CouponFakah_Object.flow3();
            CouponFakah_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

