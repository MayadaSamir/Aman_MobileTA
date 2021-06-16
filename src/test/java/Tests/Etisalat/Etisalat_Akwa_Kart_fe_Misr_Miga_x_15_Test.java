package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_15_Page;
import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Misr_Miga_x_15_page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Misr_Miga_x_15_Test extends TestBase {

    Etisalat_Akwa_Kart_fe_Misr_Miga_x_15_page Etisalat;

    @Test
    public void Akwa_Kart_fe_Misr_Miga_x_15 () throws Exception
    {
        try {
            Etisalat = new Etisalat_Akwa_Kart_fe_Misr_Miga_x_15_page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر ميجا إكس\"))").click();

            Etisalat.Screen1("01123115566");
            Etisalat.Screen2("01123115566");
            Etisalat.SelectSlab();
            Assert.assertTrue(Etisalat.Title.getText().contains("أقوى كارت في مصر ميجا إكس"));
            Assert.assertTrue(Etisalat.Amount.getText().contains("القيمة"));
            Assert.assertTrue(Etisalat.TotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Etisalat.AmountVALUE.getText().contains("15"));
            Assert.assertTrue(Etisalat.Totalvalue.getText().contains("15"));
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