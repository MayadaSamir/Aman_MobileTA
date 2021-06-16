package Tests.Vodafone;
import Pages.Scroll.ScrollPage;
import Pages.Vodafone.VodafoneMared10FlexPage;
import Pages.Vodafone.VodafoneMared10MinutesPage;
import Tests.TestBase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class VodafoneMared10Minutes_Test extends TestBase {

     VodafoneMared10MinutesPage VfMared10Minutes_Object ;

     @Test
      public void VfMared10MinutesService() throws Exception
     {
        try {
            VfMared10Minutes_Object = new VodafoneMared10MinutesPage(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"مارد 10 جنيه دقائق لكل الشبكات\"))").click();

            VfMared10Minutes_Object.VfMared10screen1("01123115524");
            VfMared10Minutes_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VfMared10Minutes_Object.Title.getText() , "مارد 10 جنيه دقائق لكل الشبكات");
            Assert.assertEquals(VfMared10Minutes_Object.VfTopUpAmount.getText() , "القيمة");
            Assert.assertEquals(VfMared10Minutes_Object.Amount10.getText() , "EGP 10.0");
            Assert.assertEquals(VfMared10Minutes_Object.VfTopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(VfMared10Minutes_Object.TotalAmount10.getText() , "EGP 10");
            VfMared10Minutes_Object.Mared10Flow("0000");
            VfMared10Minutes_Object.lastflow();
        }
        catch(Exception e)
         {
             System.out.println(e);
             Assert.fail();
         }
     }
}