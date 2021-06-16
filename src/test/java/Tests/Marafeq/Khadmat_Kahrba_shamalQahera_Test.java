package Tests.Marafeq;

import Pages.Marafeq.Khadmat_Kahrba_shamalQahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Khadmat_Kahrba_shamalQahera_Test extends TestBase {

    Khadmat_Kahrba_shamalQahera KhadmatShamalQaheraObj ;

    @Test
    public  void  Electricity () throws Exception
    {
     try {
         KhadmatShamalQaheraObj = new Khadmat_Kahrba_shamalQahera(driver);
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
         //Thread.sleep(5000);
         KhadmatShamalQaheraObj.ClickOnKhadmatKahrba();
         KhadmatShamalQaheraObj.ClickOnDaf3Kahrba();
         KhadmatShamalQaheraObj.ClickOnShamalQahera();
         KhadmatShamalQaheraObj.shamalQaheraUPScreen1("30005000");
         KhadmatShamalQaheraObj.shamalQaheraScreen2("30005000");
         KhadmatShamalQaheraObj.ElectriciryFlow1();
         Assert.assertEquals(KhadmatShamalQaheraObj.Amount.getText() , "القيمة");
         Assert.assertEquals(KhadmatShamalQaheraObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
         Assert.assertEquals(KhadmatShamalQaheraObj.TotalAmount.getText(),"المبلغ الكلى");
         Assert.assertEquals(KhadmatShamalQaheraObj.AmountVALUE.getText() , "EGP 108.5");
         Assert.assertEquals(KhadmatShamalQaheraObj.CAFvalue.getText() , "EGP 3.99");
         Assert.assertEquals(KhadmatShamalQaheraObj.totalValue.getText() , "EGP 112.49");
         KhadmatShamalQaheraObj.Electricityflow2();
         KhadmatShamalQaheraObj.EnterPIN("0000");
         KhadmatShamalQaheraObj.print();
         }
         catch(Exception e)
         {
             System.out.println(e);
             Assert.fail();
         }
    }
}

