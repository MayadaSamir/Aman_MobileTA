package Tests.Wallets;

import Pages.Wallets.Vodafone_CashOut_page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Vodafone_CashOut_Test extends TestBase {
    Vodafone_CashOut_page VodafoneCashOutObject ;

    @Test
    public  void  VodafoneCashOut() throws Exception
    {
        try
        {
            VodafoneCashOutObject = new Vodafone_CashOut_page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
            VodafoneCashOutObject.clickOnService();
            VodafoneCashOutObject.Flow_Screen1("01123115524");
            VodafoneCashOutObject.Flow_Screen2("01123115524");
            Assert.assertEquals(VodafoneCashOutObject.ScreenTitle.getText() , "أدخل المبلغ\n" +
                    "اقل قيمه هى 5 واعلى قيمه هى 30000");
            VodafoneCashOutObject.EnterAmount("8");
            Assert.assertEquals(VodafoneCashOutObject.AmountLable.getText() , "القيمة");
            Assert.assertEquals(VodafoneCashOutObject.CAFLable.getText() , "تكلفة الخدمة");
            Assert.assertEquals(VodafoneCashOutObject.AmountValueE.getText() , "EGP 8.0");
            Assert.assertEquals(VodafoneCashOutObject.CAFValue.getText() , "EGP 0.0");
            VodafoneCashOutObject.ConfirmationFlow("0000");
            Assert.assertEquals(VodafoneCashOutObject.FeesScreenTitle2.getText() , "اطلب من عميلك ادخال الرقم السرى على محفظته");
            Assert.assertEquals(VodafoneCashOutObject.TotalAmounConfirmationtLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(VodafoneCashOutObject.AmountConfirmationValue.getText() , "8.0");
            VodafoneCashOutObject.flow4();
            VodafoneCashOutObject.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
