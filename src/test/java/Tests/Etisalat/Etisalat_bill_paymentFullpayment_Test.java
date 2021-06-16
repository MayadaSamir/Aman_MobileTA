package Tests.Etisalat;

import Pages.Etisalat.Etisalat_bill_paymentFullpayment_page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_bill_paymentFullpayment_Test extends TestBase {

    Etisalat_bill_paymentFullpayment_page  Etisalat;

    @Test
    public  void Etisalat_Bill_payment () throws Exception
    {
        try {
        Etisalat = new Etisalat_bill_paymentFullpayment_page (driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"فواتير محمول\"))").click();

        Etisalat.Flow_Screen1("01123115524");
        Etisalat.Flow_Screen2("01123115524");
        Assert.assertEquals(Etisalat.Title.getText(), "القيمة المستحقة 80.0");
        Assert.assertEquals(Etisalat.Fullpayment.getText() , "دفع القيمة كاملة");
        Etisalat.fullpayment();
        Assert.assertEquals(Etisalat.Amount.getText() , "القيمة");
        Assert.assertEquals(Etisalat.CAF_lable.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(Etisalat.TotalAmount.getText() , "المبلغ الكلى");
        Assert.assertEquals(Etisalat.AmountVALUE.getText() , "EGP 80.0");
        Assert.assertEquals(Etisalat.Caf_Value.getText() , "EGP 2.50");
        Assert.assertEquals(Etisalat.Totalvalue.getText() , "EGP 82.5");
        Etisalat.flow("0000");
        Assert.assertEquals(Etisalat.Successfull_Message.getText() , "عملية ناجحة");
        Etisalat.Print();
        Etisalat.lastflow();
         }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
