package Tests.Al3ab_we_tarfeh;

import Pages.Al3ab_we_tarfeh.Eshtrkat_CNE_Bein_sports;
import Tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Eshtrkat_CNE_Bein_sports_test extends TestBase {
    Eshtrkat_CNE_Bein_sports beinObj;


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Eshtrkat CNE BEIN Sports Test")
    public void Test() throws Exception
    {
        try {
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
            Assert.assertNotNull(beinObj.AmountVALUE.getText());
            Assert.assertNotNull(beinObj.CAFvalue.getText());
            Assert.assertNotNull(beinObj.totalValue.getText());
            beinObj.flow();
            beinObj.EnterPIN("0000");
            Assert.assertEquals(beinObj.Successful_Message.getText(), "عملية ناجحة");
            //beinObj.print();
            beinObj.BackToMainMenu();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

