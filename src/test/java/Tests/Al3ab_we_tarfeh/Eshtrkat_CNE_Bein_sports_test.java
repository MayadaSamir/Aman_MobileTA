package Tests.Al3ab_we_tarfeh;

import Pages.Al3ab_we_tarfeh.Eshtrkat_CNE_Bein_sports;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Eshtrkat_CNE_Bein_sports_test extends TestBase {
    Eshtrkat_CNE_Bein_sports beinObj;


    @Test
    public void Test() {
        beinObj = new Eshtrkat_CNE_Bein_sports(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ألعاب وترفيه\").instance(0))").click();
        beinObj.ClickOnEshtrkat();
        beinObj.ClickOnEshtrkatCNE();
        beinObj.ClickOnBeinSlab();
        beinObj.raqmElkart("23");
        beinObj.raqmElKart1("23");
        beinObj.CustomerData();
        Assert.assertEquals(beinObj.Amount.getText(), "القيمة");
        Assert.assertEquals(beinObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(beinObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(beinObj.AmountVALUE.getText(), "EGP 108.5");
        Assert.assertEquals(beinObj.CAFvalue.getText(), "EGP 0.00");
        Assert.assertEquals(beinObj.totalValue.getText(), "EGP 108.5");
        beinObj.flow();
        beinObj.EnterPIN("0000");
        beinObj.print();
    }
}

