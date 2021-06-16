package Tests.Offers_and_Gifts;
import Pages.Offers_and_Gifts.OrodKolYoumOrange_page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrodKolYoumOrange_Test extends TestBase {

    OrodKolYoumOrange_page OrodKolYoumOrange_Object ;

    @Test
    public  void  OrodKolYoumOrange () throws Exception
    {
        try
        {
            OrodKolYoumOrange_Object = new OrodKolYoumOrange_page (driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"عروض وهدايا\").instance(0))").click();
            OrodKolYoumOrange_Object.ClickOnOrodKolYoumOrangeService();
            Assert.assertEquals(OrodKolYoumOrange_Object.title_of_entry_code_screen.getText(), "رقم الكود");
            OrodKolYoumOrange_Object.FlowScreen1("133");
            Assert.assertEquals(OrodKolYoumOrange_Object.title_of_entry_code_screen2.getText(),"تأكيد رقم الكود");
            OrodKolYoumOrange_Object.FlowScreen2("133");
            Assert.assertEquals(OrodKolYoumOrange_Object.estbdal_code_title.getText(),"إستبدال كود أورنج");
            Assert.assertEquals(OrodKolYoumOrange_Object.AmountParameter.getText(), "القيمة");
            Assert.assertEquals(OrodKolYoumOrange_Object.AmountValue.getText(), "EGP 5.0");
            OrodKolYoumOrange_Object.Flow1();
            Assert.assertEquals(OrodKolYoumOrange_Object.title_of_entry_code_screen2.getText(), "أدخل كود العملية");
            OrodKolYoumOrange_Object.Flow2("1");
            Assert.assertEquals(OrodKolYoumOrange_Object.title_of_entry_codeConfirmation_screen2.getText(), "تأكيد كود العملية");
            OrodKolYoumOrange_Object.Flow3("1");
            OrodKolYoumOrange_Object.EnterPIN("0000");
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
