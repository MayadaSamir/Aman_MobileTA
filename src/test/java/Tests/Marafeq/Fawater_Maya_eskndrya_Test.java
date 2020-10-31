package Tests.Marafeq;

import Pages.Marafeq.Fawater_Maya_sherktEskndrya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Fawater_Maya_eskndrya_Test extends TestBase {

    Fawater_Maya_sherktEskndrya fawaterEskndryaObj;

    @Test
    public void Test() {
        fawaterEskndryaObj = new Fawater_Maya_sherktEskndrya(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مرافق عامة\").instance(0))").click();
        fawaterEskndryaObj.ClickOnFawaterMaya();
        fawaterEskndryaObj.ClickOnMaytEskndrya();
        fawaterEskndryaObj.ClickOnSherktMaytEskndrya();
        fawaterEskndryaObj.CodeEntry("23");
        fawaterEskndryaObj.CodeEntry1("23");
        fawaterEskndryaObj.CustomerData();
        Assert.assertEquals(fawaterEskndryaObj.Amount.getText(), "القيمة");
        Assert.assertEquals(fawaterEskndryaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(fawaterEskndryaObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(fawaterEskndryaObj.AmountVALUE.getText(), "EGP 108.5");
        Assert.assertEquals(fawaterEskndryaObj.CAFvalue.getText(), "EGP 4.56");
        Assert.assertEquals(fawaterEskndryaObj.totalValue.getText(), "EGP 113.06");
        fawaterEskndryaObj.flow();
        fawaterEskndryaObj.EnterPIN("0000");
        fawaterEskndryaObj.print();
    }
}

