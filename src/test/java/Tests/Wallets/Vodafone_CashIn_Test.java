package Tests.Wallets;

import Pages.Wallets.Vodafone_CashIn_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Vodafone_CashIn_Test extends TestBase {

     Vodafone_CashIn_Page VF_Cash_in_Object;

     @Test
    public void  VF_Cash_In () throws Exception
    {
        try
        {
            VF_Cash_in_Object = new Vodafone_CashIn_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
            VF_Cash_in_Object.clickOnService();
            VF_Cash_in_Object.Flow_Screen1("01123115524");
            VF_Cash_in_Object.Flow_Screen2("01123115524");
            Assert.assertEquals(VF_Cash_in_Object.ScreenTitle.getText() , "أدخل المبلغ\n" +
                    "اقل قيمه هى 5 واعلى قيمه هى 50000");
            VF_Cash_in_Object.EnterAmount("8");
            Assert.assertEquals(VF_Cash_in_Object.AmountLable.getText() , "القيمة");
            Assert.assertEquals(VF_Cash_in_Object.CAFLable.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(VF_Cash_in_Object.TotalAmountLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(VF_Cash_in_Object.AmountValueE.getText() , "EGP 8.0");
            Assert.assertEquals(VF_Cash_in_Object.CAFValue.getText() , "EGP 0.00");
            Assert.assertEquals(VF_Cash_in_Object.totalamountValue.getText() , "EGP 8.0");
            VF_Cash_in_Object.ConfirmationFlow("0000");
            Assert.assertEquals(VF_Cash_in_Object.FeesScreenTitle2.getText() , "اطلب من عميلك ادخال الرقم السرى على محفظته");
            Assert.assertEquals(VF_Cash_in_Object.TotalAmounConfirmationtLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(VF_Cash_in_Object.AmountConfirmationValue.getText() , "8.0");
            VF_Cash_in_Object.flow4();
            Assert.assertEquals(VF_Cash_in_Object.Successfull_Message.getText() , "عملية ناجحة");
            VF_Cash_in_Object.Print();
            VF_Cash_in_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
