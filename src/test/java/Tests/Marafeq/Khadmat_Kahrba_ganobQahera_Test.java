package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_ganobQahera;
import Pages.Marafeq.Khadmat_Kahrba_shamalQahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_ganobQahera_Test extends TestBase{

    Khadmat_Kahrba_ganobQahera KhadmatganobQaheraObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaGanobQahera() throws Exception
    {
        try {
            KhadmatganobQaheraObj = new Khadmat_Kahrba_ganobQahera(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            // Thread.sleep(5000);
            KhadmatganobQaheraObj.ClickOnKhadmatKahrba();
            KhadmatganobQaheraObj.ClickOnDaf3Kahrba();
            KhadmatganobQaheraObj.ClickOnGanobQahera();
            KhadmatganobQaheraObj.GanobQaheraUPScreen1("30005000");
            KhadmatganobQaheraObj.GanobQaheraScreen2 ("30005000");
            KhadmatganobQaheraObj.ElectriciryFlow1();
            Assert.assertEquals(KhadmatganobQaheraObj.Amount.getText() , "القيمة");
            Assert.assertEquals(KhadmatganobQaheraObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(KhadmatganobQaheraObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(KhadmatganobQaheraObj.AmountVALUE.getText() , "EGP 108.5");
            Assert.assertEquals(KhadmatganobQaheraObj.CAFvalue.getText() , "EGP 3.99");
            Assert.assertEquals(KhadmatganobQaheraObj.totalValue.getText() , "EGP 112.49");
            KhadmatganobQaheraObj.Electricityflow2();
            KhadmatganobQaheraObj.EnterPIN("0000");
            KhadmatganobQaheraObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

