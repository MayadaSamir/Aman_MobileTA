package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Kart_Ba2i_1_w_5;
import Pages.PageBase;
import Pages.Vodafone.VodafoneCouponesFakah_4_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_Kart_Ba2i_1_w_5_Test extends TestBase {

    Etisalat_Kart_Ba2i_1_w_5  Etisalat ;

    @Test
    public  void etisalat_ba2i_1_5 () throws Exception
    {
        try {
            Etisalat = new Etisalat_Kart_Ba2i_1_w_5 (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كارت اتصالات باقي\"))").click();

            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 1.5");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 1.5");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كارت اتصالات باقي - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "1.5 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "الآن مع أقوي كارت باقي من اتصالات أكبر قيمة وحدات بأقل سعر مع كارت 1.5 استخدم 25 وحده و20 ميجابايت\n");
            Etisalat.flow3();
            Etisalat.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }

    @AfterTest
    public void  quit ()
    {
        driver.quit();
    }
}
