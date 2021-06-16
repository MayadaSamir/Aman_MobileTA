package Tests.Wallets;

import Pages.Wallets.CairoBank_CashIn_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CairoBank_CashIn_Test extends TestBase {

    CairoBank_CashIn_Page CairoBankCashInObject ;

    @Test
    public  void  CairoBankCashIn () throws Exception
    {
        try
        {
            CairoBankCashInObject = new CairoBank_CashIn_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
            CairoBankCashInObject.clickOnService();
            CairoBankCashInObject.Flow_Screen1("01123115524");
            CairoBankCashInObject.Flow_Screen2("01123115524");
            Assert.assertEquals(CairoBankCashInObject.ScreenTitle.getText() , "أدخل المبلغ");
            CairoBankCashInObject.EnterAmount("8");
            Assert.assertEquals(CairoBankCashInObject.AmountLable.getText() , "القيمة");
            Assert.assertEquals(CairoBankCashInObject.CAFLable.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(CairoBankCashInObject.TotalAmountLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(CairoBankCashInObject.AmountValueE.getText() , "EGP 8.0");
            Assert.assertEquals(CairoBankCashInObject.CAFValue.getText() , "EGP 0.00");
            Assert.assertEquals(CairoBankCashInObject.totalamountValue.getText() , "EGP 8.0");
            CairoBankCashInObject.ConfirmationFlow("0000");
            Assert.assertEquals(CairoBankCashInObject.FeesScreenTitle2.getText() , "اطلب من عميلك ادخال الرقم السرى على محفظته");
            Assert.assertEquals(CairoBankCashInObject.TotalAmounConfirmationtLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(CairoBankCashInObject.AmountConfirmationValue.getText() , "8.0");
            CairoBankCashInObject.flow4();
            Assert.assertEquals(CairoBankCashInObject.Successfull_Message.getText() , "عملية ناجحة");
            CairoBankCashInObject.Print();
            CairoBankCashInObject.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
