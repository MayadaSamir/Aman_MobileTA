package Tests.Wallets;

import Pages.Wallets.Ma7fzt_raseedy_khedmt_sa7b_naqdy;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ma7fzt_raseedy_khedmt_sa7b_naqdy_test extends TestBase {


    Ma7fzt_raseedy_khedmt_sa7b_naqdy sa7bRasedyObj ;

    @Test
    public  void  sa7bOrange()  throws InterruptedException {
        sa7bRasedyObj = new Ma7fzt_raseedy_khedmt_sa7b_naqdy(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
        Thread.sleep(5000);
        sa7bRasedyObj.ClickOnma7fztOrangeCash();
        sa7bRasedyObj.ClickOnSa7b();
        sa7bRasedyObj.customerteleEntry("222");
        sa7bRasedyObj.customerteleEntry1("222");
        sa7bRasedyObj.customerAmountEntry("12");
        Assert.assertEquals(sa7bRasedyObj.Amount.getText() , "القيمة");
        Assert.assertEquals(sa7bRasedyObj.CAFAmount.getText() , "تكلفة الخدمة");
        Assert.assertEquals(sa7bRasedyObj.AmountVALUE.getText() , "EGP 12.0");
        Assert.assertEquals(sa7bRasedyObj.CAFvalue.getText() , "EGP 0.0");
        sa7bRasedyObj.customerInfo();
        sa7bRasedyObj.EnterPIN("0000");
        sa7bRasedyObj.customerInfo2();
        Assert.assertEquals(sa7bRasedyObj.Totalamountt.getText(),"المبلغ الكلى");
        Assert.assertEquals(sa7bRasedyObj.amountVal.getText() , "12.0");
        sa7bRasedyObj.print();
    }
}

