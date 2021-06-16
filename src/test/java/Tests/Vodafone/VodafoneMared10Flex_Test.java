package Tests.Vodafone;
import Pages.Scroll.ScrollPage;
import Pages.Vodafone.VodafoneMared10FlexPage;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneMared10Flex_Test extends TestBase {

    VodafoneMared10FlexPage VfMared10Flex_Object ;

    @Test
    public void VfMared10FlexService () throws Exception
    {
        try
        {
            VfMared10Flex_Object = new  VodafoneMared10FlexPage (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(1))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"مارد 10 جنيه فليكسات\"))").click();
            VfMared10Flex_Object.VfMared10Flexscreen1("01123115524");
            VfMared10Flex_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VfMared10Flex_Object.VfTopUpAmount.getText() , "القيمة");
            Assert.assertEquals(VfMared10Flex_Object.Amount10.getText() , "EGP 10.0");
            Assert.assertEquals(VfMared10Flex_Object.VfTopUpTotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(VfMared10Flex_Object.TotalAmount10.getText() , "EGP 10");
            VfMared10Flex_Object.Mared10FlexFlow("0000");
            VfMared10Flex_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
