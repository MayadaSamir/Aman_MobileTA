package Tests.Vodafone;

import Pages.Vodafone.VodafoneBillPayment_Full_paymentPage;
import Pages.Vodafone.VodafoneBillPayment_partial_paymentPage;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneBillPayment_partial_payment_Test extends TestBase {

    VodafoneBillPayment_partial_paymentPage object ;

    @Test
    public void  VF_Bull_payment_partial_payment () throws Exception
    {
        try {
            object = new VodafoneBillPayment_partial_paymentPage(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"فواتير محمول\"))").click();

            object.Flow_Screen1("01123115524");
            object.Flow_Screen2("01123115524");
            Assert.assertEquals(object.Title.getText(), "القيمة المستحقة 5.0");
            Assert.assertEquals(object.Partial_payment_option.getText() , "دفع قيمة مختلفة");
            object.Partialpayment();
            Assert.assertEquals(object.pop_msg.getText() , "أدخل المبلغ\n" +
                    "اقل قيمه هى 0.5 واعلى قيمه هى 5.0");
            object.flow1("2");
            Assert.assertEquals(object.AmountLable.getText() , "القيمة");
            Assert.assertEquals(object.CAFLable.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(object.TotalAmountLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(object.AmountValueE.getText() , "EGP 2.0");
            Assert.assertEquals(object.CAFValue.getText() , "EGP 2.00");
            Assert.assertEquals(object.totalamountValue.getText() , "EGP 4.0");
            object.flow2("0000");
            Assert.assertEquals(object.Successfull_Message.getText() , "عملية ناجحة");
            object.Print();
            object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
