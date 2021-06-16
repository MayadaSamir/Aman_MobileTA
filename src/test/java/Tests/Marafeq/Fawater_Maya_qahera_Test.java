package Tests.Marafeq;

import Pages.Marafeq.Fawater_Maya_sherktQahera;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Fawater_Maya_qahera_Test extends TestBase {

    Fawater_Maya_sherktQahera fawaterQaheraObj;

    @Test
    public void Test() throws Exception
    {
        try {
            fawaterQaheraObj = new Fawater_Maya_sherktQahera(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
            fawaterQaheraObj.ClickOnFawaterMaya();
            fawaterQaheraObj.ClickOnMaytQahera();
            fawaterQaheraObj.ClickOnSherktMaytQahera();
            fawaterQaheraObj.CodeEntry("88");
            fawaterQaheraObj.CodeEntry1("88");
            fawaterQaheraObj.CustomerData();
            Assert.assertEquals(fawaterQaheraObj.Amount.getText(), "القيمة");
            Assert.assertEquals(fawaterQaheraObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(fawaterQaheraObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(fawaterQaheraObj.AmountVALUE.getText(), "EGP 108.5");
            Assert.assertEquals(fawaterQaheraObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(fawaterQaheraObj.totalValue.getText(), "EGP 114.2");
            fawaterQaheraObj.flow();
            fawaterQaheraObj.EnterPIN("0000");
            fawaterQaheraObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
