package Tests.Etisalat;

import Pages.Etisalat.Etisalat_vouchers_15;
import Pages.Etisalat.Etisalat_vouchers_30;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Etisalat_vouchers_30_Test extends TestBase {

    Etisalat_vouchers_30  Etisalat ;

    @Test
    public  void etisalat_voucher_30 () throws Exception
    {
        try {

            Etisalat = new Etisalat_vouchers_30    (driver) ;
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كروت شحن اتصالات\"))").click();

            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText() , "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText() , "EGP 30.0");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText() , "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText() , "EGP 30.0");
            Etisalat.flow2("0000");
            Assert.assertEquals(Etisalat.Receipt_Title.getText() , "كروت شحن اتصالات - كود الشحن");
            Assert.assertEquals(Etisalat.TotalAmountReceipt.getText() , "30.0 EGP");
            Assert.assertEquals(Etisalat.Footer.getText() , "شحن 30 جنيه رصيد #الكود*556* شحن 700 ميكس صالحة 28 ايام #الكود*1*556* شحن 700 دقيقة صالحة 28 ايام #الكود*2*556*\n");
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
