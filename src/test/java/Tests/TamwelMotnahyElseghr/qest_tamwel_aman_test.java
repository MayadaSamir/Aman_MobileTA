package Tests.TamwelMotnahyElseghr;

import Pages.TamwelMotnahyElseghr.qest_tamwel_aman;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class qest_tamwel_aman_test extends TestBase {

    qest_tamwel_aman Amandaf3Obj;

    @Test
    public void Test() {
        Amandaf3Obj = new qest_tamwel_aman(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تمويل متناهى الصغر\").instance(0))").click();
        Amandaf3Obj.ClickOnQestTamwelAman();
        Amandaf3Obj.ClickOnDaf3();
        Amandaf3Obj.raqmElmobile("01090019467");
        Amandaf3Obj.raqmElmobile1("01090019467");
        Amandaf3Obj.CustomerData();
        Assert.assertEquals(Amandaf3Obj.Amount.getText(), "القيمة");
        Assert.assertEquals(Amandaf3Obj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(Amandaf3Obj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(Amandaf3Obj.AmountVALUE.getText(), "EGP 535.0");
        Assert.assertEquals(Amandaf3Obj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(Amandaf3Obj.totalValue.getText(), "EGP 540.7");
        Amandaf3Obj.flow();
        Amandaf3Obj.EnterPIN("0000");
        Amandaf3Obj.print();
    }
}

