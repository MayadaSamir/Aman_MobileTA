package Tests.Etisalat;

import Pages.Etisalat.Etisalat_vouchers_5;
import Pages.Etisalat.Etisalat_vouchers_7;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_vouchers_7_Test extends TestBase {

    Etisalat_vouchers_7 Etisalat ;

    @Test
    public  void etisalat_voucher_7 () throws Exception
    {
        try {

            Etisalat = new Etisalat_vouchers_7(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كروت شحن اتصالات\"))").click();

            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 7.0");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 7.0");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كروت شحن اتصالات - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "7.0 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "شحن 7 جنيه رصيد #الكود*556* /شحن اقوى كارت لمدة 3 ايام /شحن 300 دقيقه #الكود*2*556* /شحن 300 ميكس #الكود*1*556* /شحن 600 ميجا اكس #الكود*3*556* /شحن 180 دقيقه سوشيال ميديا #الكود*5*556* /شحن 180 دقيقه فيديو #الكود*7*556*\n");
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
