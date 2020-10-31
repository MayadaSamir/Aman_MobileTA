package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_Masr3olya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_Masr3olya_Test extends TestBase {
    Khadmat_Kahrba_Masr3olya KhadmatMasr3olyaObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaMasr3olya()
    {
        KhadmatMasr3olyaObj = new Khadmat_Kahrba_Masr3olya(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
        //Thread.sleep(5000);
        KhadmatMasr3olyaObj.ClickOnKhadmatKahrba();
        KhadmatMasr3olyaObj.ClickOnDaf3Kahrba();
        KhadmatMasr3olyaObj.ClickOnMasr3olya();
        KhadmatMasr3olyaObj.Masr3olyaUPScreen1("30005000");
        KhadmatMasr3olyaObj.Masr3olyaScreen2("30005000");
        KhadmatMasr3olyaObj.ElectriciryFlow1();
        Assert.assertEquals(KhadmatMasr3olyaObj.Amount.getText() , "القيمة");
        Assert.assertEquals(KhadmatMasr3olyaObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(KhadmatMasr3olyaObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(KhadmatMasr3olyaObj.AmountVALUE.getText() , "EGP 108.5");
        Assert.assertEquals(KhadmatMasr3olyaObj.CAFvalue.getText() , "EGP 3.99");
        Assert.assertEquals(KhadmatMasr3olyaObj.totalValue.getText() , "EGP 112.49");
        KhadmatMasr3olyaObj.Electricityflow2();
        KhadmatMasr3olyaObj.EnterPIN("0000");
        KhadmatMasr3olyaObj.print();
    }
}

