package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Misr_MIX_lkol_el4abakat_30;
import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Misr_MIX_lkol_el4abakat_50;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Misr_MIX_lkol_el4abakat_50_Test extends TestBase {

    Etisalat_Akwa_Kart_fe_Misr_MIX_lkol_el4abakat_50 Etisalat;

    @Test
    public void Etisalat_Akwa_Kart_fe_Misr_MIX_lkol_el4abakat_50()  throws  Exception
    {
        try {
        Etisalat = new Etisalat_Akwa_Kart_fe_Misr_MIX_lkol_el4abakat_50  (driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                ".scrollIntoView(new UiSelector().textContains(\"أقوي كارت فى مصر ميكس لكل الشبكات\"))").click();

        Etisalat.Screen1("01123115566");
        Etisalat.Screen2("01123115566");
        Etisalat.SelectSlab();
        Assert.assertTrue(Etisalat.Title.getText().contains("أقوي كارت فى مصر ميكس لكل الشبكات"));
        Assert.assertTrue(Etisalat.Amount.getText().contains("القيمة"));
        Assert.assertTrue(Etisalat.TotalAmount.getText().contains("المبلغ الكلى"));
        Assert.assertTrue(Etisalat.AmountVALUE.getText().contains("50"));
        Assert.assertTrue(Etisalat.Totalvalue.getText().contains("50"));
        Etisalat.flow("0000");
        Assert.assertTrue(Etisalat.Successfull_Message.getText().contains("عملية ناجحة"));
        Etisalat.print();
        Etisalat.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}


