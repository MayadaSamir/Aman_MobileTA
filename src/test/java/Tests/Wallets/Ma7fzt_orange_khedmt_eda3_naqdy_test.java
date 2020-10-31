package Tests.Wallets;

import Pages.Wallets.Ma7fzt_orange_khedmt_eda3_naqdy;
import Pages.Wallets.Ma7fzt_orange_khedmt_eda3_naqdy;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ma7fzt_orange_khedmt_eda3_naqdy_test extends TestBase {

    Ma7fzt_orange_khedmt_eda3_naqdy naqdyOrangeObj ;

    @Test
    public  void  eda3orange()  throws InterruptedException {
        naqdyOrangeObj = new Ma7fzt_orange_khedmt_eda3_naqdy(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات المحافظ النقدية\").instance(0))").click();
        Thread.sleep(5000);
        naqdyOrangeObj.ClickOnma7fztOrangeCash();
        naqdyOrangeObj.ClickOneda3Naqdy();
        naqdyOrangeObj.customerteleEntry("222");
        naqdyOrangeObj.customerteleEntry1("222");
        naqdyOrangeObj.customerAmountEntry("12");
        Assert.assertEquals(naqdyOrangeObj.Amount.getText() , "القيمة");
        Assert.assertEquals(naqdyOrangeObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(naqdyOrangeObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(naqdyOrangeObj.AmountVALUE.getText() , "EGP 12.0");
        Assert.assertEquals(naqdyOrangeObj.CAFvalue.getText() , "EGP 0.00");
        Assert.assertEquals(naqdyOrangeObj.totalValue.getText() , "EGP 12.0");
        naqdyOrangeObj.customerInfo();
        naqdyOrangeObj.EnterPIN("0000");
        naqdyOrangeObj.customerInfo2();
        Assert.assertEquals(naqdyOrangeObj.Totalamountt.getText(),"المبلغ الكلى");
        Assert.assertEquals(naqdyOrangeObj.amountVal.getText() , "12.0");
        naqdyOrangeObj.print();
    }

}

