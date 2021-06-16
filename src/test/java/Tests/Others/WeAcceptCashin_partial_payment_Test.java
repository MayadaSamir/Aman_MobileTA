package Tests.Others;

import Pages.Others.WeAcceptCashin_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeAcceptCashin_partial_payment_Test extends TestBase {
    WeAcceptCashin_Page WeAcceptCashInObject;

    @Test
    public  void WeAcceptCashInFullPayment () throws Exception
    {
        try
        {
            WeAcceptCashInObject = new WeAcceptCashin_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مدفوعات متنوعة\").instance(0))").click();
            WeAcceptCashInObject.Click_On_Service();
            WeAcceptCashInObject.Flow_Screen1("888");
            WeAcceptCashInObject.Flow_Screen2("888");
            Assert.assertEquals(WeAcceptCashInObject.Info.getText() , "اسم مقدم الخدمة:Sample Merchant\n" +
                    "نوع الخدمة:6062867\n" +
                    "اسم العميل:Test Client\n");
            WeAcceptCashInObject.Confirmation();
            WeAcceptCashInObject.Partial_Payment();
            Assert.assertEquals(WeAcceptCashInObject.FeeEnterTitle.getText() , "أدخل المبلغ اقل قيمه هى 1.0 واعلى قيمه هى 428.0");
            WeAcceptCashInObject.EnterUserInput("5");
            Assert.assertEquals(WeAcceptCashInObject.AmountLable.getText() , "القيمة");
            Assert.assertEquals(WeAcceptCashInObject.CAFLable.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(WeAcceptCashInObject.TotalAmountLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(WeAcceptCashInObject.AmountValueE.getText() , "EGP 5.0");
            Assert.assertEquals(WeAcceptCashInObject.CAFValue.getText() , "EGP 3.00");
            Assert.assertEquals(WeAcceptCashInObject.TotalamountValue.getText(), "EGP 8.0");
            WeAcceptCashInObject.Confirmation();
            WeAcceptCashInObject.EnterPIN("0000");
            WeAcceptCashInObject.printing();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
