package Tests.Marafeq;

import Pages.Marafeq.Khadmat_PetroTrade_Daf3FatoraGoz2y;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_PetroTrade_Daf3FatoraGoz2_Test extends TestBase {

    Khadmat_PetroTrade_Daf3FatoraGoz2y daf3Goz2Obj;

    @Test
    public void Test() throws Exception
    {
        try {
            daf3Goz2Obj = new Khadmat_PetroTrade_Daf3FatoraGoz2y(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            daf3Goz2Obj.ClickOnPetroTrade();
            daf3Goz2Obj.ClickOnKhadmatKahrba();
            daf3Goz2Obj.el3adadEntry1("34");
            daf3Goz2Obj.el3adadEntry2("34");
            daf3Goz2Obj.CustomerData();
            daf3Goz2Obj.ClickOnDaf3Goz2();
            daf3Goz2Obj.enterAmount("14");
            Assert.assertEquals(daf3Goz2Obj.Amount.getText() , "القيمة");
            Assert.assertEquals(daf3Goz2Obj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(daf3Goz2Obj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(daf3Goz2Obj.AmountVALUE.getText() , "EGP 14.0");
            Assert.assertEquals(daf3Goz2Obj.CAFvalue.getText() , "EGP 1.71");
            Assert.assertEquals(daf3Goz2Obj.totalValue.getText() , "EGP 15.71");
            daf3Goz2Obj.flow2();
            daf3Goz2Obj.EnterPIN("0000");
            daf3Goz2Obj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

