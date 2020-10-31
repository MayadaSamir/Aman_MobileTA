package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_elmansora;
import Pages.Gam3at_7okmya.Gam3t_portsaid;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_elmansora_test extends TestBase {
    Gam3t_elmansora gam3telMansoraObj;

    @Test
    public void StudentRegister() {
        gam3telMansoraObj = new Gam3t_elmansora(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
        //Thread.sleep(5000);
        //gam3t3enShamsObj.ClickOnGam3at7okmya();
        gam3telMansoraObj.ClickOnGam3at7okmya1();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة المنصورة\").instance(0))").click();
        //gam3telSadatObj.ClickOnGam3tPortSaid();
        gam3telMansoraObj.studentCodeEntry("100100");
        gam3telMansoraObj.studentCodeEntry1("100100");
        gam3telMansoraObj.studentInfo();
        Assert.assertEquals(gam3telMansoraObj.Amount.getText(), "القيمة");
        Assert.assertEquals(gam3telMansoraObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(gam3telMansoraObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(gam3telMansoraObj.AmountVALUE.getText(), "EGP 300.0");
        Assert.assertEquals(gam3telMansoraObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(gam3telMansoraObj.totalValue.getText(), "EGP 305.7");
        gam3telMansoraObj.studentInfo2();
        gam3telMansoraObj.EnterPIN("0000");
        gam3telMansoraObj.print();
    }
}

