package Tests.Vodafone;
import Pages.Vodafone.VodafoneCouponesFakah_6_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneCouponesFakah_6_Test extends TestBase {

    VodafoneCouponesFakah_6_Page CouponFakah_Object ;

    @Test
    public  void VodafoneCouponseFakah_6 () throws Exception
    {
        try
        {
            CouponFakah_Object = new VodafoneCouponesFakah_6_Page (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون فكه\"))").click();

            CouponFakah_Object.Flow1();
            Assert.assertEquals(CouponFakah_Object.AmountLable.getText() , "القيمة");
            Assert.assertEquals(CouponFakah_Object.AmountValueE.getText() , "EGP 6.0");
            Assert.assertEquals(CouponFakah_Object.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(CouponFakah_Object.totalamountValue.getText() , "EGP 6.0");
            CouponFakah_Object.flow2("0000");
            Assert.assertEquals(CouponFakah_Object.Receipt_Title.getText() , "كوبون فودافون فكه - كود الشحن");
            Assert.assertEquals(CouponFakah_Object.TotalAmountReceipt.getText() , "6.0 EGP");
            Assert.assertEquals(CouponFakah_Object.Footer.getText() , "لشحن 300 دقيقة او وحده و كمان 40 ميجابايت واتس اب لمدة 2 ايام اطلب *858*كود الشحن# للتحكم في الكارت اطلب #86*\n" +
                    "\n" +
                    "لشحن 600 سوشيال ميجابايت و كمان 40 ميجابايت واتس اب لمدة 2 ايام اطلب *858*4*كود الشحن#");
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
