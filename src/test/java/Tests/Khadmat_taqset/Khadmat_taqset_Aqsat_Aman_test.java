package Tests.Khadmat_taqset;


import Pages.Khadmat_taqset.Khadmat_taqset_Aqsat_Aman;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Khadmat_taqset_Aqsat_Aman_test extends TestBase {

    Khadmat_taqset_Aqsat_Aman taqsetAmanObj;

    @Test
    public void test() throws InterruptedException {
        taqsetAmanObj = new Khadmat_taqset_Aqsat_Aman(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"خدمات تقسيط\").instance(0))").click();
        Thread.sleep(5000);



       /* gam3tElMonfyaObj.studentCodeEntry("100100");
        gam3tElMonfyaObj.studentCodeEntry1("100100");
        gam3tElMonfyaObj.studentInfo();
        Assert.assertEquals(gam3tElMonfyaObj.Amount.getText(), "القيمة");
        Assert.assertEquals(gam3tElMonfyaObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(gam3tElMonfyaObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(gam3tElMonfyaObj.AmountVALUE.getText(), "EGP 300.0");
        Assert.assertEquals(gam3tElMonfyaObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(gam3tElMonfyaObj.totalValue.getText(), "EGP 305.7");
        gam3tElMonfyaObj.studentInfo2();
        gam3tElMonfyaObj.EnterPIN("0000");
        gam3tElMonfyaObj.print(); */
    }
}
