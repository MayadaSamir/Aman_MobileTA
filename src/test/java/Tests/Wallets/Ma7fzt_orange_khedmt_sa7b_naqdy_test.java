package Tests.Wallets;

import Pages.Wallets.Ma7fzt_orange_khedmt_sa7b_naqdy;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Ma7fzt_orange_khedmt_sa7b_naqdy_test extends TestBase {

    Ma7fzt_orange_khedmt_sa7b_naqdy sa7bOrangeObj ;

    @Test
    public  void  sa7bOrange()  throws Exception
    {
        try
        {
            sa7bOrangeObj = new Ma7fzt_orange_khedmt_sa7b_naqdy(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
            Thread.sleep(5000);
            sa7bOrangeObj.ClickOnma7fztOrangeCash();
            sa7bOrangeObj.ClickOnSa7b();
            sa7bOrangeObj.customerteleEntry("222");
            sa7bOrangeObj.customerteleEntry1("222");
            sa7bOrangeObj.customerAmountEntry("12");
            Assert.assertEquals(sa7bOrangeObj.Amount.getText() , "القيمة");
            Assert.assertEquals(sa7bOrangeObj.CAFAmount.getText() , "تكلفة الخدمة");
            Assert.assertEquals(sa7bOrangeObj.AmountVALUE.getText() , "EGP 12.0");
            Assert.assertEquals(sa7bOrangeObj.CAFvalue.getText() , "EGP 0.0");
            sa7bOrangeObj.customerInfo();
            sa7bOrangeObj.EnterPIN("0000");
            sa7bOrangeObj.customerInfo2();
            Assert.assertEquals(sa7bOrangeObj.Totalamountt.getText(),"المبلغ الكلى");
            Assert.assertEquals(sa7bOrangeObj.amountVal.getText() , "12.0");
            sa7bOrangeObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

