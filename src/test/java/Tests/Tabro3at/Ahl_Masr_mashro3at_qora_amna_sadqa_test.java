package Tests.Tabro3at;

import Pages.Tabro3at.Ahl_Masr_ensh2at_mostshfa_zakah;
import Pages.Tabro3at.Ahl_Masr_mashro3at_qora_amna_sadqa;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ahl_Masr_mashro3at_qora_amna_sadqa_test extends TestBase {

    Ahl_Masr_mashro3at_qora_amna_sadqa qoraObj;

    @Test
    public void Test() {
        qoraObj= new Ahl_Masr_mashro3at_qora_amna_sadqa(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"تبرعات\").instance(0))").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مؤسسة أهل مصر للتنمية\").instance(0))").click();
        qoraObj.ClickOnQora();
        qoraObj.ClickOnSadqa();
        qoraObj.raqmElmob("01090019467");
        qoraObj.raqmElmob1("01090019467");
        qoraObj.amountEntry("6");
        Assert.assertEquals(qoraObj.Amount.getText(), "القيمة");
        Assert.assertEquals(qoraObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(qoraObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(qoraObj.AmountVALUE.getText(), "EGP 15.0");
        Assert.assertEquals(qoraObj.CAFvalue.getText(), "EGP 3.00");
        Assert.assertEquals(qoraObj.totalValue.getText(), "EGP 18");
        qoraObj.flow();
        qoraObj.EnterPIN("0000");
        qoraObj.print();
    }
}

