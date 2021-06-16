package Tests.Wallets;

import Pages.Wallets.CairoBank_Cashout_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CairoBank_CashOut_Test extends TestBase {
    CairoBank_Cashout_Page CairoBankCashOutObject ;

     @Test
    public void CairoBankCashOut () throws Exception
     {
        try
        {
            CairoBankCashOutObject = new CairoBank_Cashout_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
            CairoBankCashOutObject.clickOnService();
            CairoBankCashOutObject.Flow_Screen1("01123115524");
            CairoBankCashOutObject.Flow_Screen2("01123115524");
            Assert.assertEquals(CairoBankCashOutObject.ScreenTitle.getText(), "أدخل المبلغ");
            CairoBankCashOutObject.EnterAmount("8");
            Assert.assertEquals(CairoBankCashOutObject.AmountLable.getText(),"القيمة");
            Assert.assertEquals(CairoBankCashOutObject.CAFLable.getText(),"تكلفة الخدمة");
            Assert.assertEquals(CairoBankCashOutObject.AmountValueE.getText(),"EGP 8.0");
            Assert.assertEquals(CairoBankCashOutObject.CAFValue.getText(),"EGP 0.0");
            CairoBankCashOutObject.ConfirmationFlow("0000");
            Assert.assertEquals(CairoBankCashOutObject.FeesScreenTitle2.getText(), "اطلب من عميلك ادخال الرقم السرى على محفظته");
            Assert.assertEquals(CairoBankCashOutObject.TotalAmounConfirmationtLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(CairoBankCashOutObject.AmountConfirmationValue.getText() , "8.0");
            CairoBankCashOutObject.flow4();
            CairoBankCashOutObject.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
     }
}

