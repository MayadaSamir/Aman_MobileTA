package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Kart_Ba2i_3_w_5;
import Pages.Etisalat.Etisalat_Kart_Ba2i_4_25;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_Kart_Ba2i_4_25_Test extends TestBase {

    Etisalat_Kart_Ba2i_4_25 Etisalat ;

    @Test(enabled = false)
    public  void etisalat_ba2i_3_w_5 () throws Exception
    {
        try {
            Etisalat = new Etisalat_Kart_Ba2i_4_25   (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كارت اتصالات باقي\"))").click();

            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 4.25");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 4.25");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كارت اتصالات باقي - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "4.25 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "لشحن 190 دقيقه و 50 ميجابايت واتساب لأخر اليوم *556*2*كود الشحن# لشحن 190 وحده و 50 ميجابايت واتساب لأخر اليوم *556*1*كود الشحن# لشحن 380 ميجا اكس لأخر اليوم *556*3*كود الشحن# لشحن 70 دقيقه سوشيال لأخر اليوم *556*5*كود الشحن# لشحن 70 دقيقه فيديو لأخر اليوم *556*7*كود الشحن\n");
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
