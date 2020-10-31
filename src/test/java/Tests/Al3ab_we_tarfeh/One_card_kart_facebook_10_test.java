package Tests.Al3ab_we_tarfeh;

import Pages.Al3ab_we_tarfeh.One_card_kart_facebook_10;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class One_card_kart_facebook_10_test extends TestBase {
    One_card_kart_facebook_10 oneObj;


    @Test
    public void Test() {
        oneObj = new One_card_kart_facebook_10(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ألعاب وترفيه\").instance(0))").click();
        oneObj.ClickOnOneCard();
        oneObj.ClickOnFacebook10();
        Assert.assertEquals(oneObj.esm.getText(), "إسم المنتج:");
        Assert.assertEquals(oneObj.Amount.getText(), "القيمة");
        Assert.assertEquals(oneObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(oneObj.esmVALUE.getText(), "كارت فيس بوك 10 دولار");
        Assert.assertEquals(oneObj.AmountVALUE.getText(), "EGP 157.53");
        Assert.assertEquals(oneObj.totalValue.getText(), "EGP 157.53");
        oneObj.flow();
        oneObj.EnterPIN("0000");
        oneObj.print();
    }
}

