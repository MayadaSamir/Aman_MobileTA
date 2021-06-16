package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_10_page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Baqet_video_10 extends TestBase {

    Etisalat_Akwa_Kart_fe_Baqet_video_10_page Etisalat_10;

    @Test
    public void  Etisalat_Akwa_kart_baqet_video_10 () throws Exception
    {
        try {
            Etisalat_10 = new Etisalat_Akwa_Kart_fe_Baqet_video_10_page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر باقة الفيديو\"))").click();

            Etisalat_10.Screen1("01123115566");
            Etisalat_10.Screen2("01123115566");
            Etisalat_10.SelectSlab();
            Assert.assertTrue(Etisalat_10.Title.getText().contains("أقوى كارت في مصر باقة الفيديو"));
            Assert.assertTrue(Etisalat_10.Amount.getText().contains("القيمة"));
            Assert.assertTrue(Etisalat_10.TotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Etisalat_10.AmountVALUE.getText().contains("10"));
            Assert.assertTrue(Etisalat_10.Totalvalue.getText().contains("10"));
            Etisalat_10.flow("0000");
            Assert.assertTrue(Etisalat_10.Successfull_Message.getText().contains("عملية ناجحة"));
            Etisalat_10.print();
            Etisalat_10.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
