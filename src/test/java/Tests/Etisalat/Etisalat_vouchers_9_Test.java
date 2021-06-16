package Tests.Etisalat;

import Pages.Etisalat.Etisalat_vouchers_7;
import Pages.Etisalat.Etisalat_vouchers_9;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_vouchers_9_Test extends TestBase {

    Etisalat_vouchers_9  Etisalat ;

    @Test
    public  void etisalat_voucher_9 () throws Exception
    {
        try {

            Etisalat = new Etisalat_vouchers_9 (driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كروت شحن اتصالات\"))").click();

            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 9.0");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 9.0");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كروت شحن اتصالات - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "9.0 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "شحن 9 جنيه رصيد # الكود *556* /اشحن أقوى كارت لمدة 4 أيام /اشحن400 وحدة #الكود*2*556* اشحن400 دقيقة #الكود*1*556* /اشحن240 دقيقة فيديو #الكود*7*556* /اشحن240 دقيقة سوشيال ميديا #الكود*5*556* /اشحن800 ميجا اكس #الكود*3*556*\n");
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
