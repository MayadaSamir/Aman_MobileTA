package Tests.Marafeq;


import Pages.Marafeq.Khadmat_PetroTrade_TasgelQera2a;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_PetroTrade_TasgelQera2a_Test extends TestBase {

    Khadmat_PetroTrade_TasgelQera2a qera2aObj;

    @Test
    public void Test() throws Exception
    {
        try {
            qera2aObj = new Khadmat_PetroTrade_TasgelQera2a(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            // Thread.sleep(5000);
            qera2aObj.ClickOnKhadmatPetroTrade();
            qera2aObj.ClickOnTasgelQera2a();
            qera2aObj.tasgelQera2aScreen1("55","24");
            qera2aObj.tasgelQera2aScreen2("55","24");
            qera2aObj.flow();
            Assert.assertEquals(qera2aObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(qera2aObj.CAFvalue.getText() , "EGP 3.99");
            qera2aObj.EnterPIN("0000");
            qera2aObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

