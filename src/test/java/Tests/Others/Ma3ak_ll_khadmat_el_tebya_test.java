package Tests.Others;

import Pages.Others.Ma3ak_ll_khadmat_el_tebya;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ma3ak_ll_khadmat_el_tebya_test extends TestBase {

    Ma3ak_ll_khadmat_el_tebya m3akObj;

    @Test
    public void Test()  throws Exception
    {
        try
        {
            m3akObj = new Ma3ak_ll_khadmat_el_tebya(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مدفوعات متنوعة\").instance(0))").click();
            m3akObj.ClickOnM3ak();
            m3akObj.raqmElCode("6");
            m3akObj.raqmElCode1("6");
            m3akObj.CustomerData();
            Assert.assertEquals(m3akObj.Amount.getText(), "القيمة");
            Assert.assertEquals(m3akObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(m3akObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(m3akObj.AmountVALUE.getText(), "EGP 60.0");
            Assert.assertEquals(m3akObj.CAFvalue.getText(), "EGP 0.00");
            Assert.assertEquals(m3akObj.totalValue.getText(), "EGP 60.0");
            m3akObj.flow();
            m3akObj.EnterPIN("0000");
            m3akObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
