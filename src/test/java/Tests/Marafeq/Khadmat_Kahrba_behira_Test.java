package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_behira;
import Pages.Marafeq.Khadmat_Kahrba_shamalQahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_Kahrba_behira_Test extends TestBase {
    Khadmat_Kahrba_behira KhadmatBehiraObj ;

    @Test
    public  void  Marafeq_KhadmatKahrbaQanah() throws Exception
    {
        try {
            KhadmatBehiraObj = new Khadmat_Kahrba_behira(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            //Thread.sleep(5000);
            KhadmatBehiraObj.ClickOnKhadmatKahrba();
            KhadmatBehiraObj.ClickOnDaf3Kahrba();
            KhadmatBehiraObj.ClickOnBehira();
            KhadmatBehiraObj.BehiraUPScreen1("30005000");
            KhadmatBehiraObj.BehiraScreen2("30005000");
            KhadmatBehiraObj.ElectriciryFlow1();
            Assert.assertEquals(KhadmatBehiraObj.Amount.getText() , "القيمة");
            Assert.assertEquals(KhadmatBehiraObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(KhadmatBehiraObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(KhadmatBehiraObj.AmountVALUE.getText() , "EGP 108.5");
            Assert.assertEquals(KhadmatBehiraObj.CAFvalue.getText() , "EGP 3.99");
            Assert.assertEquals(KhadmatBehiraObj.totalValue.getText() , "EGP 112.49");
            KhadmatBehiraObj.Electricityflow2();
            KhadmatBehiraObj.EnterPIN("0000");
            KhadmatBehiraObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

