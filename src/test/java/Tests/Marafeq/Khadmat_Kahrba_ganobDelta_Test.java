package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_ganobDelta;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_ganobDelta_Test extends TestBase{

    Khadmat_Kahrba_ganobDelta KhadmatGanobDeltaObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaGanobQahera() throws Exception
    {
        try {
            KhadmatGanobDeltaObj = new Khadmat_Kahrba_ganobDelta(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            // Thread.sleep(5000);
            KhadmatGanobDeltaObj.ClickOnKhadmatKahrba();
            KhadmatGanobDeltaObj.ClickOnDaf3Kahrba();
            KhadmatGanobDeltaObj.ClickOnGanobDelta ();
            KhadmatGanobDeltaObj.deltaQaheraGanobUPScreen1("30005000");
            KhadmatGanobDeltaObj.deltaQaheraGanobScreen2("30005000");
            KhadmatGanobDeltaObj.ElectriciryFlow1();
            Assert.assertEquals(KhadmatGanobDeltaObj.Amount.getText() , "القيمة");
            Assert.assertEquals(KhadmatGanobDeltaObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(KhadmatGanobDeltaObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(KhadmatGanobDeltaObj.AmountVALUE.getText() , "EGP 108.5");
            Assert.assertEquals(KhadmatGanobDeltaObj.CAFvalue.getText() , "EGP 3.99");
            Assert.assertEquals(KhadmatGanobDeltaObj.totalValue.getText() , "EGP 112.49");
            KhadmatGanobDeltaObj.Electricityflow2();
            KhadmatGanobDeltaObj.EnterPIN("0000");
            KhadmatGanobDeltaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

