package Tests.Etisalat;
import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_4_25_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Baqet_video_4_25 extends TestBase {

    Etisalat_Akwa_Kart_fe_Baqet_video_4_25_Page Etisalat4_25 ;

    @Test
    public void Etisalat_Akwa_kart_baqet_video_4_25 () throws Exception
    {
        try {
        Etisalat4_25 = new Etisalat_Akwa_Kart_fe_Baqet_video_4_25_Page(driver);
        driver.findElementByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر باقة الفيديو\"))").click();

        Etisalat4_25.Screen1("01123115566");
        Etisalat4_25.Screen2("01123115566");
        Etisalat4_25.SelectSlab();
        Assert.assertTrue(Etisalat4_25.Title.getText().contains("أقوى كارت في مصر باقة الفيديو"));
        Assert.assertTrue(Etisalat4_25.Amount.getText().contains("القيمة"));
        Assert.assertTrue(Etisalat4_25.TotalAmount.getText().contains("المبلغ الكلى"));
        Assert.assertTrue(Etisalat4_25.AmountVALUE.getText().contains("4.25"));
        Assert.assertTrue(Etisalat4_25.Totalvalue.getText().contains("4.25"));
        Etisalat4_25.flow("0000");
        Assert.assertTrue(Etisalat4_25.Successfull_Message.getText().contains("عملية ناجحة"));
        Etisalat4_25.print();
        Etisalat4_25.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
