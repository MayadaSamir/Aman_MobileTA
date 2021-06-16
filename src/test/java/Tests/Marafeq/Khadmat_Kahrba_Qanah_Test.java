package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_Qanah;
import Pages.Marafeq.Khadmat_Kahrba_shamalQahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_Qanah_Test extends TestBase {
    Khadmat_Kahrba_Qanah KhadmatQanahObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaQanah() throws Exception
    {
        try {
            KhadmatQanahObj = new Khadmat_Kahrba_Qanah(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            //Thread.sleep(5000);
            KhadmatQanahObj.ClickOnKhadmatKahrba();
            KhadmatQanahObj.ClickOnDaf3Kahrba();
            KhadmatQanahObj.ClickOnQanah();
            KhadmatQanahObj.QanahUPScreen1("30005000");
            KhadmatQanahObj.QanahScreen2("30005000");
            KhadmatQanahObj.ElectriciryFlow1();
            Assert.assertEquals(KhadmatQanahObj.Amount.getText() , "القيمة");
            Assert.assertEquals(KhadmatQanahObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(KhadmatQanahObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(KhadmatQanahObj.AmountVALUE.getText() , "EGP 108.5");
            Assert.assertEquals(KhadmatQanahObj.CAFvalue.getText() , "EGP 3.99");
            Assert.assertEquals(KhadmatQanahObj.totalValue.getText() , "EGP 112.49");
            KhadmatQanahObj.Electricityflow2();
            KhadmatQanahObj.EnterPIN("0000");
            KhadmatQanahObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

