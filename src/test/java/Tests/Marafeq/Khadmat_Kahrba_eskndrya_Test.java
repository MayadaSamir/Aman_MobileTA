package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_eskndrya;
import Pages.Marafeq.Khadmat_Kahrba_shamalQahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_eskndrya_Test extends TestBase {

    Khadmat_Kahrba_eskndrya KhadmateskndryaObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaEskndrya()
    {
        KhadmateskndryaObj = new Khadmat_Kahrba_eskndrya(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
        // Thread.sleep(5000);
        KhadmateskndryaObj.ClickOnKhadmatKahrba();
        KhadmateskndryaObj.ClickOnDaf3Kahrba();
        KhadmateskndryaObj.ClickOneskndrya();
        KhadmateskndryaObj.eskndryaUPScreen1("30005000");
        KhadmateskndryaObj.eskndryaScreen2("30005000");
        KhadmateskndryaObj.ElectriciryFlow1();
        Assert.assertEquals(KhadmateskndryaObj.Amount.getText() , "القيمة");
        Assert.assertEquals(KhadmateskndryaObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(KhadmateskndryaObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(KhadmateskndryaObj.AmountVALUE.getText() , "EGP 108.5");
        Assert.assertEquals(KhadmateskndryaObj.CAFvalue.getText() , "EGP 3.99");
        Assert.assertEquals(KhadmateskndryaObj.totalValue.getText() , "EGP 112.49");
        KhadmateskndryaObj.Electricityflow2();
        KhadmateskndryaObj.EnterPIN("0000");
        KhadmateskndryaObj.print();
    }
}

