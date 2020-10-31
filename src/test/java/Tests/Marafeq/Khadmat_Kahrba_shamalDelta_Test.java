package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_shamalDelta;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_shamalDelta_Test extends TestBase{

    Khadmat_Kahrba_shamalDelta KhadmatShamalDeltaObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaShamalQahera()
    {
        KhadmatShamalDeltaObj = new Khadmat_Kahrba_shamalDelta(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
        //Thread.sleep(5000);
        KhadmatShamalDeltaObj.ClickOnKhadmatKahrba();
        KhadmatShamalDeltaObj.ClickOnDaf3Kahrba();
        KhadmatShamalDeltaObj.ClickOnShamalDelta ();
        KhadmatShamalDeltaObj.deltaQaheraUPScreen1("30005000");
        KhadmatShamalDeltaObj.deltaQaheraScreen2("30005000");
        KhadmatShamalDeltaObj.ElectriciryFlow1();
        Assert.assertEquals(KhadmatShamalDeltaObj.Amount.getText() , "القيمة");
        Assert.assertEquals(KhadmatShamalDeltaObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(KhadmatShamalDeltaObj.TotalAmount.getText(),"المبلغ الكلى");
        Assert.assertEquals(KhadmatShamalDeltaObj.AmountVALUE.getText() , "EGP 108.5");
        Assert.assertEquals(KhadmatShamalDeltaObj.CAFvalue.getText() , "EGP 3.99");
        Assert.assertEquals(KhadmatShamalDeltaObj.totalValue.getText() , "EGP 112.49");
        KhadmatShamalDeltaObj.Electricityflow2();
        KhadmatShamalDeltaObj.EnterPIN("0000");
        KhadmatShamalDeltaObj.print();
    }
}

