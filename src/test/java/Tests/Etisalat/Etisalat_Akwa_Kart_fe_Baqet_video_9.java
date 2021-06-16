package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_7_Page;
import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_9_page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Baqet_video_9 extends TestBase {

    Etisalat_Akwa_Kart_fe_Baqet_video_9_page Etisalat_9 ;

    @Test
    public void  Etisalat_Akwa_kart_baqet_video_9 () throws Exception
    {
        try {
            Etisalat_9 = new Etisalat_Akwa_Kart_fe_Baqet_video_9_page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر باقة الفيديو\"))").click();

            Etisalat_9.Screen1("01123115566");
            Etisalat_9.Screen2("01123115566");
            Etisalat_9.SelectSlab();
            Assert.assertTrue(Etisalat_9.Title.getText().contains("أقوى كارت في مصر باقة الفيديو"));
            Assert.assertTrue(Etisalat_9.Amount.getText().contains("القيمة"));
            Assert.assertTrue(Etisalat_9.TotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Etisalat_9.AmountVALUE.getText().contains("9"));
            Assert.assertTrue(Etisalat_9.Totalvalue.getText().contains("9"));
            Etisalat_9.flow("0000");
            Assert.assertTrue(Etisalat_9.Successfull_Message.getText().contains("عملية ناجحة"));
            Etisalat_9.print();
            Etisalat_9.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
