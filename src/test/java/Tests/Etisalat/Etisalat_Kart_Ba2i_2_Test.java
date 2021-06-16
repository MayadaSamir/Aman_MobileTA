package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Kart_Ba2i_2;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_Kart_Ba2i_2_Test extends TestBase {

    Etisalat_Kart_Ba2i_2  Etisalat ;

    @Test
    public  void etisalat_ba2i_2 () throws Exception
    {
        try {
            Etisalat = new Etisalat_Kart_Ba2i_2 (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كارت اتصالات باقي\"))").click();
            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 2.0");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 2.0");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كارت اتصالات باقي - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "2.0 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "لشحن 30 دقيقه و 20 ميجابايت واتساب لأخر اليوم *556*2*كود الشحن# لشحن 30 وحده و 20 ميجابايت واتساب لأخر اليوم *556*1*كود الشحن");
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
