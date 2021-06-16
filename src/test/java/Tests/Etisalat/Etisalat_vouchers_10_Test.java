package Tests.Etisalat;

import Pages.Etisalat.Etisalat_vouchers_10;
import Pages.Etisalat.Etisalat_vouchers_100;
import Pages.Etisalat.Etisalat_vouchers_9;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_vouchers_10_Test extends TestBase {

    Etisalat_vouchers_10  Etisalat ;

    @Test
    public  void etisalat_voucher_10 () throws Exception
    {
        try {
            Etisalat = new Etisalat_vouchers_10  (driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كروت شحن اتصالات\"))").click();

            Etisalat.Flow1();

            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 10.0");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 10.0");
            Etisalat.flow2("0000");
            if ( Etisalat.Footer.isDisplayed() == true)
            {
                Etisalat.printout();

            }else { driver.quit();}

            if (Etisalat.Receipt_Title.isDisplayed() == true)
            { Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كروت شحن اتصالات  - كود الشحن");
            }
            else {
                driver.quit();
            }
            if (Etisalat.TotalAmountReceipt.isDisplayed()== true)
            {
                Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "10.0 EGP");

            }else {
                driver.quit();
            }
            if (Etisalat.Footer.isDisplayed() == true)
            {
                Assert.assertEquals(Etisalat.Footer.getText() , "لشحن 10 جنيه رصيد   #الكود*556*\n" +
                        "لشحن أقوى كارت لمدة 7 أيام :\n" +
                        "  شحن 475 دقيقة   #الكود*2*556*\n" +
                        "/ شحن 475 ميكس   #الكود*1*556*\n" +
                        "/ شحن 900 ميجا اكس   #الكود*3*556*\n" +
                        "/ شحن 300 دقيقه فيديو   #الكود*7*556*\n" +
                        "/ شحن 300 دقيقه سوشيال ميديا   #الكود*5*556*");
            }else {
                driver.quit();
            }
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
