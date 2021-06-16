package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_15_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Baqet_video_15 extends TestBase {

    Etisalat_Akwa_Kart_fe_Baqet_video_15_Page Etisalat15 ;

    @Test
    public  void Etisalat_Akwa_kart_baqet_video_15 () throws Exception
    {
        try {
        Etisalat15 = new Etisalat_Akwa_Kart_fe_Baqet_video_15_Page(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر باقة الفيديو\"))").click();

        Etisalat15.Screen1("01123115566");
        Etisalat15.Screen2("01123115566");
        Etisalat15.SelectSlab();
        Assert.assertTrue(Etisalat15.Title.getText().contains("أقوى كارت في مصر باقة الفيديو"));
        Assert.assertTrue(Etisalat15.Amount.getText().contains("القيمة"));
        Assert.assertTrue(Etisalat15.TotalAmount.getText().contains("المبلغ الكلى"));
        Assert.assertTrue(Etisalat15.AmountVALUE.getText().contains("15"));
        Assert.assertTrue(Etisalat15.Totalvalue.getText().contains("15"));
        Etisalat15.flow("0000");
        Assert.assertTrue(Etisalat15.Successfull_Message.getText().contains("عملية ناجحة"));
        Etisalat15.print();
        Etisalat15.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}