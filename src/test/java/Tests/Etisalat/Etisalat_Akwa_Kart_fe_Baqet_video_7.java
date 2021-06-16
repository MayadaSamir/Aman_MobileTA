package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_5_Page;
import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_7_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Baqet_video_7 extends TestBase {

    Etisalat_Akwa_Kart_fe_Baqet_video_7_Page Etisalat_7 ;

    @Test
    public void  Etisalat_Akwa_kart_baqet_video_7 () throws Exception
    {
        try {
        Etisalat_7 = new Etisalat_Akwa_Kart_fe_Baqet_video_7_Page(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر باقة الفيديو\"))").click();

        Etisalat_7.Screen1("01123115566");
        Etisalat_7.Screen2("01123115566");
        Etisalat_7.SelectSlab();
        Assert.assertTrue(Etisalat_7.Title.getText().contains("أقوى كارت في مصر باقة الفيديو"));
        Assert.assertTrue(Etisalat_7.Amount.getText().contains("القيمة"));
        Assert.assertTrue(Etisalat_7.TotalAmount.getText().contains("المبلغ الكلى"));
        Assert.assertTrue(Etisalat_7.AmountVALUE.getText().contains("7"));
        Assert.assertTrue(Etisalat_7.Totalvalue.getText().contains("7"));
        Etisalat_7.flow("0000");
        Assert.assertTrue(Etisalat_7.Successfull_Message.getText().contains("عملية ناجحة"));
        Etisalat_7.print();
        Etisalat_7.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
