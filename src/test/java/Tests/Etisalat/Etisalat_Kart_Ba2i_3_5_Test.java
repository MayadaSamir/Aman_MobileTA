package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Kart_Ba2i_2;
import Pages.Etisalat.Etisalat_Kart_Ba2i_3_w_5;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_Kart_Ba2i_3_5_Test extends TestBase {

    Etisalat_Kart_Ba2i_3_w_5  Etisalat ;

    @Test
    public  void etisalat_ba2i_3_w_5 () throws Exception
    {
        try {
            Etisalat = new Etisalat_Kart_Ba2i_3_w_5  (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كارت اتصالات باقي\"))").click();

            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 3.5");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 3.5");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كارت اتصالات باقي - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "3.5 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "شحن اقوى كارت لمدة يوم واحد /شحن 150 وحدة و50 ميجا بايت #الكود*556* /شحن 300 ميجا اكس #الكود*3*556* /شحن 60 دقيقه سوشيال ميديا #الكود*5*556* /شحن 60 دقيقه فيديو #الكود*7*556*\n");
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
