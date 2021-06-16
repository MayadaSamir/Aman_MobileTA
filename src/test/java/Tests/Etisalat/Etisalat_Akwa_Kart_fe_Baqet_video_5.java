package Tests.Etisalat;
import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_5_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Baqet_video_5 extends TestBase {

    Etisalat_Akwa_Kart_fe_Baqet_video_5_Page Etisalat_5 ;

    @Test
    public void  Etisalat_Akwa_kart_baqet_video_5 () throws Exception
    {
        try {
        Etisalat_5 = new Etisalat_Akwa_Kart_fe_Baqet_video_5_Page(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر باقة الفيديو\"))").click();

        Etisalat_5.Screen1("01123115566");
        Etisalat_5.Screen2("01123115566");
        Etisalat_5.SelectSlab();
        Assert.assertTrue(Etisalat_5.Title.getText().contains("أقوى كارت في مصر باقة الفيديو"));
        Assert.assertTrue(Etisalat_5.Amount.getText().contains("القيمة"));
        Assert.assertTrue(Etisalat_5.TotalAmount.getText().contains("المبلغ الكلى"));
        Assert.assertTrue(Etisalat_5.AmountVALUE.getText().contains("5"));
        Assert.assertTrue(Etisalat_5.Totalvalue.getText().contains("5"));
        Etisalat_5.flow("0000");
        Assert.assertTrue(Etisalat_5.Successfull_Message.getText().contains("عملية ناجحة"));
        Etisalat_5.print();
        Etisalat_5.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}




