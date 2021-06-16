package Tests.Vodafone;

import Pages.Vodafone.VodafoneBillPayment_Full_paymentPage;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneBillPayment_Full_Payment_Test extends TestBase {

    VodafoneBillPayment_Full_paymentPage BillPaymentVFObject;

    @Test
    public  void VfBillPayment () throws Exception

    {
        try {
            BillPaymentVFObject = new VodafoneBillPayment_Full_paymentPage(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"فواتير محمول\"))").click();

            BillPaymentVFObject.Flow_Screen1("01123115524");
            BillPaymentVFObject.Flow_Screen2("01123115524");
            Assert.assertEquals(BillPaymentVFObject.Title.getText(), "القيمة المستحقة 5.0");
            Assert.assertEquals(BillPaymentVFObject.full_payment_option.getText() , "دفع القيمة كاملة");
            BillPaymentVFObject.fullpayment();
            Assert.assertEquals(BillPaymentVFObject.AmountLable.getText() , "القيمة");
            Assert.assertEquals(BillPaymentVFObject.CAFLable.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(BillPaymentVFObject.TotalAmountLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(BillPaymentVFObject.AmountValueE.getText() , "EGP 5.0");
            Assert.assertEquals(BillPaymentVFObject.CAFValue.getText() , "EGP 2.00");
            Assert.assertEquals(BillPaymentVFObject.totalamountValue.getText() , "EGP 7.0");
            BillPaymentVFObject.flow("0000");
            Assert.assertEquals(BillPaymentVFObject.Successfull_Message.getText() , "عملية ناجحة");
            BillPaymentVFObject.Print();
            BillPaymentVFObject.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
            StartDriver();
        }
    }
}
