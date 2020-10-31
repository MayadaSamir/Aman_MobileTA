package Tests.Others;

import Pages.Others.XPay;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XPay_test extends TestBase {

    XPay xObj;


    //test data: 221406130

    @Test
    public void Test() {
        xObj = new XPay(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مدفوعات متنوعة\").instance(0))").click();
        xObj.ClickOnXPAY();
        xObj.raqmElcode("221406130");
        xObj.raqmElcode1("221406130");
        xObj.CustomerData();
        Assert.assertEquals(xObj.Amount.getText(), "القيمة");
        Assert.assertEquals(xObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(xObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(xObj.AmountVALUE.getText(), "EGP 52.85");
        Assert.assertEquals(xObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(xObj.totalValue.getText(), "EGP 58.550000000000004");
        xObj.flow();
        xObj.EnterPIN("0000");
        xObj.print();
    }
}

