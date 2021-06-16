package Tests.Etisalat;
import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Baqet_video_3_5_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_fe_Baqet_video_3_5 extends TestBase {

    Etisalat_Akwa_Kart_fe_Baqet_video_3_5_Page Etisalat_3_5_object ;

    @Test
    public  void Etisalat_Akwa_kart_baqet_video_3_w_5 () throws Exception
    {
        try {
            Etisalat_3_5_object = new Etisalat_Akwa_Kart_fe_Baqet_video_3_5_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"أقوى كارت في مصر باقة الفيديو\"))").click();

            Etisalat_3_5_object.Screen1("01123115566");
            Etisalat_3_5_object.Screen2("01123115566");
            Etisalat_3_5_object.SelectSlab();
            Assert.assertTrue(Etisalat_3_5_object.Title.getText().contains("أقوى كارت في مصر باقة الفيديو"));
            Assert.assertTrue(Etisalat_3_5_object.Amount.getText().contains("القيمة"));
            Assert.assertTrue(Etisalat_3_5_object.TotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Etisalat_3_5_object.AmountVALUE.getText().contains("3.5"));
            Assert.assertTrue(Etisalat_3_5_object.Totalvalue.getText().contains("3.5"));
            Etisalat_3_5_object.flow("0000");
            Assert.assertTrue(Etisalat_3_5_object.Successfull_Message.getText().contains("عملية ناجحة"));
            Etisalat_3_5_object.print();
            Etisalat_3_5_object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}