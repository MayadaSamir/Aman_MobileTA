package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Akadmyt_elfnon;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Akadmyt_elfnon_test extends TestBase {

    Akadmyt_elfnon akadmytElfnonObj;

    @Test
    public void StudentRegister() {
        akadmytElfnonObj = new Akadmyt_elfnon(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
        //Thread.sleep(5000);
        //gam3t3enShamsObj.ClickOnGam3at7okmya();
        akadmytElfnonObj.ClickOnGam3at7okmya1();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"أكاديمية الفنون\").instance(0))").click();
        //gam3telSadatObj.ClickOnGam3tPortSaid();
        akadmytElfnonObj.studentCodeEntry("100100");
        akadmytElfnonObj.studentCodeEntry1("100100");
        akadmytElfnonObj.studentInfo();
        Assert.assertEquals(akadmytElfnonObj.Amount.getText(), "القيمة");
        Assert.assertEquals(akadmytElfnonObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(akadmytElfnonObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(akadmytElfnonObj.AmountVALUE.getText(), "EGP 300.0");
        Assert.assertEquals(akadmytElfnonObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(akadmytElfnonObj.totalValue.getText(), "EGP 305.7");
        akadmytElfnonObj.studentInfo2();
        akadmytElfnonObj.EnterPIN("0000");
        akadmytElfnonObj.print();
    }

}

