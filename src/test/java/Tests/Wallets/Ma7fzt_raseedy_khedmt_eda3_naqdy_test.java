package Tests.Wallets;

import Pages.Wallets.Ma7fzt_raseedy_khedmt_eda3_naqdy;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ma7fzt_raseedy_khedmt_eda3_naqdy_test extends TestBase {

    Ma7fzt_raseedy_khedmt_eda3_naqdy eda3RasedyObj ;

    @Test
    public  void  eda3Rasedy()  throws InterruptedException {
        eda3RasedyObj = new Ma7fzt_raseedy_khedmt_eda3_naqdy(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
        Thread.sleep(5000);
        eda3RasedyObj.ClickOnRasedy();
        eda3RasedyObj.ClickOneda3Naqdy();
        eda3RasedyObj.customerteleEntry("222");
        eda3RasedyObj.customerteleEntry1("222");
        eda3RasedyObj.customerAmountEntry("56");
        Assert.assertEquals(eda3RasedyObj.Amount.getText() , "القيمة");
        Assert.assertEquals(eda3RasedyObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(eda3RasedyObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(eda3RasedyObj.AmountVALUE.getText() , "EGP 56.0");
        Assert.assertEquals(eda3RasedyObj.CAFvalue.getText() , "EGP 0.00");
        Assert.assertEquals(eda3RasedyObj.totalValue.getText() , "EGP 56.0");
        eda3RasedyObj.customerInfo();
        eda3RasedyObj.EnterPIN("0000");
        eda3RasedyObj.customerInfo2();
        Assert.assertEquals(eda3RasedyObj.Totalamountt.getText(),"المبلغ الكلى");
        Assert.assertEquals(eda3RasedyObj.amountVal.getText() , "56.0");
        eda3RasedyObj.print();
    }

}

