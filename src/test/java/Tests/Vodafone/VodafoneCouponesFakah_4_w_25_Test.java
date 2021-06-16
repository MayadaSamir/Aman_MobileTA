package Tests.Vodafone;

import Pages.Scroll.ScrollPage;
import Pages.Vodafone.VodafoneCouponesFakah_2_Page;
import Pages.Vodafone.VodafoneCouponesFakah_4_Page;
import Pages.Vodafone.VodafoneCouponesFakah_4_w_25_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneCouponesFakah_4_w_25_Test extends TestBase {
    VodafoneCouponesFakah_4_w_25_Page CouponFakah__Object ;

    @Test
    public  void VodafoneCouponseFakah_4_w_25 () throws Exception
    {
        try
            {
                CouponFakah__Object = new VodafoneCouponesFakah_4_w_25_Page(driver);
                driver.findElementByAndroidUIAutomator("new UiScrollable" +
                        "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                        ".scrollIntoView(new UiSelector().textContains(\"كوبون فودافون فكه\"))").click();

                CouponFakah__Object.Flow1();
                Assert.assertEquals(CouponFakah__Object.AmountLable.getText() , "القيمة");
                Assert.assertEquals(CouponFakah__Object.AmountValueE.getText() , "EGP 4.25");
                Assert.assertEquals(CouponFakah__Object.TotalAmountLable.getText() , "المبلغ الكلي");
                Assert.assertEquals(CouponFakah__Object.totalamountValue.getText() , "EGP 4.25");
                CouponFakah__Object.flow2("0000");
                Assert.assertEquals(CouponFakah__Object.Receipt_Title.getText() , "كوبون فودافون فكة - كود الشحن");
                Assert.assertEquals(CouponFakah__Object.TotalAmountReceipt.getText() , "4.25 EGP");
                Assert.assertEquals(CouponFakah__Object.Footer.getText() , "لشحن 190 دقيقة او وحده و كمان 50 ميجابايت واتس اب طول اليوم اطلب *858*كود الشحن# للتحكم في الكارت اطلب #86*\n" +
                        "\n" +
                        "لشحن 380 سوشيال ميجابايت و كمان 50 ميجابايت واتس اب طول اليوم اطلب *858*4*كود الشحن#");
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

