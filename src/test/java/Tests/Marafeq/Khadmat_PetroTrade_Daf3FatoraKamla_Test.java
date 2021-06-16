package Tests.Marafeq;

import Pages.Marafeq.Khadmat_PetroTrade_Daf3FatoraKamla;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_PetroTrade_Daf3FatoraKamla_Test extends TestBase {

    Khadmat_PetroTrade_Daf3FatoraKamla daf3KamlaObj;

    @Test
    public void Test() throws Exception
    {
        try {
            daf3KamlaObj = new Khadmat_PetroTrade_Daf3FatoraKamla(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            daf3KamlaObj.ClickOnPetroTrade();
            daf3KamlaObj.ClickOnKhadmatKahrba();
            daf3KamlaObj.el3adadEntry1("25");
            daf3KamlaObj.el3adadEntry2("25");
            daf3KamlaObj.CustomerData();
            daf3KamlaObj.ClickOnDaf3Egmaly();
            Assert.assertEquals(daf3KamlaObj.Amount.getText() , "القيمة");
            Assert.assertEquals(daf3KamlaObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(daf3KamlaObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(daf3KamlaObj.AmountVALUE.getText() , "EGP 14.0");
            Assert.assertEquals(daf3KamlaObj.CAFvalue.getText() , "EGP 1.71");
            Assert.assertEquals(daf3KamlaObj.totalValue.getText() , "EGP 15.71");
            daf3KamlaObj.flow();
            daf3KamlaObj.EnterPIN("0000");
            daf3KamlaObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

