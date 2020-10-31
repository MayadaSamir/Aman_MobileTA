package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_MasrWosta;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_MasrWosta_Test extends TestBase {
    Khadmat_Kahrba_MasrWosta KhadmatMasrWostaObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaMasrWosta()
    {
        KhadmatMasrWostaObj = new Khadmat_Kahrba_MasrWosta(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
        //Thread.sleep(5000);
        KhadmatMasrWostaObj.ClickOnKhadmatKahrba();
        KhadmatMasrWostaObj.ClickOnDaf3Kahrba();
        KhadmatMasrWostaObj.ClickOnMasrWosta();
        KhadmatMasrWostaObj.MasrWostaUPScreen1("30005000");
        KhadmatMasrWostaObj.MasrWostaScreen2("30005000");
        KhadmatMasrWostaObj.ElectriciryFlow1();
        Assert.assertEquals(KhadmatMasrWostaObj.Amount.getText() , "القيمة");
        Assert.assertEquals(KhadmatMasrWostaObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(KhadmatMasrWostaObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(KhadmatMasrWostaObj.AmountVALUE.getText() , "EGP 108.5");
        Assert.assertEquals(KhadmatMasrWostaObj.CAFvalue.getText() , "EGP 3.99");
        Assert.assertEquals(KhadmatMasrWostaObj.totalValue.getText() , "EGP 112.49");
        KhadmatMasrWostaObj.Electricityflow2();
        KhadmatMasrWostaObj.EnterPIN("0000");
        KhadmatMasrWostaObj.print();
    }
}

