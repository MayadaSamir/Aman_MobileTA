package Tests.Etisalat;

import Pages.Etisalat.Etisalat_vouchers_10;
import Pages.Etisalat.Etisalat_vouchers_15;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_vouchers_15_Test  extends TestBase {
    Etisalat_vouchers_15  Etisalat ;

    @Test(enabled = false)
    public  void etisalat_voucher_15 () throws Exception
    {
        try {
            Etisalat = new Etisalat_vouchers_15   (driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كروت شحن اتصالات\"))").click();

            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 15.0");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 15.0");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كروت شحن اتصالات - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "15.0 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "شحن 15 جنيه رصيد #الكود*556* /شحن اقوى كارت لمدة 7 ايام /شحن 800 دقيقه #الكود*2*556* /شحن 800 ميكس #الكود*1*556* /شحن 1600 ميجا اكس #الكود*3*556* /شحن 420 دقيقه سوشيال ميديا #الكود*5*556* /شحن 420 دقيقه فيديو #الكود*7*556*\n");
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
