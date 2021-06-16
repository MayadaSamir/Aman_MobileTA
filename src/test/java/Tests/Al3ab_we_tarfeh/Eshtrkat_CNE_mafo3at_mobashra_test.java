package Tests.Al3ab_we_tarfeh;

import Pages.Al3ab_we_tarfeh.Eshtrkat_CNE_Bein_sports;
import Pages.Al3ab_we_tarfeh.Eshtrkat_CNE_mafo3at_mobashra;
import Tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Eshtrkat_CNE_mafo3at_mobashra_test extends TestBase {

    Eshtrkat_CNE_mafo3at_mobashra mdo3atObj;

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Eshtrkat CNE Madfo3at Mobashra Test")
    public void Test() throws Exception
    {
        try {
            mdo3atObj = new Eshtrkat_CNE_mafo3at_mobashra(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ألعاب وترفيه\").instance(0))").click();
            mdo3atObj.ClickOnEshtrkat();
            mdo3atObj.ClickOnEshtrkatCNE();
            mdo3atObj.ClickOnMadfo3at();
            mdo3atObj.raqmElkart("23");
            mdo3atObj.raqmElKart1("23");
            mdo3atObj.CustomerData();
            Assert.assertEquals(mdo3atObj.Amount.getText(), "القيمة");
            Assert.assertEquals(mdo3atObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(mdo3atObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertNotNull(mdo3atObj.AmountVALUE.getText());
            Assert.assertNotNull(mdo3atObj.CAFvalue.getText());
            Assert.assertNotNull(mdo3atObj.totalValue.getText());
            mdo3atObj.flow();
            mdo3atObj.EnterPIN("0000");
            Assert.assertEquals(mdo3atObj.Successful_Message.getText(), "عملية ناجحة");
            //beinObj.print();
            mdo3atObj.BackToMainMenu();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
