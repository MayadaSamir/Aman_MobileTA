package Tests.Etisalat;
import Pages.Etisalat.EtisalatTopUp_Page_20;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUP_20_Test extends TestBase {
    EtisalatTopUp_Page_20 EtisalatTopUp_20_Object;

    @Test
    public void EtisalatTopUp_10() throws Exception
    {
        try {
            EtisalatTopUp_20_Object = new EtisalatTopUp_Page_20(driver);
            EtisalatTopUp_20_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_20_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_20_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_20_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_20_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_20_Object.Etisalat_SelectSlab20();
            Assert.assertEquals(EtisalatTopUp_20_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_20_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_20_Object.Amount20.getText(), "EGP 20.0");
            Assert.assertEquals(EtisalatTopUp_20_Object.TotalAmount28_57.getText(), "EGP 28.57");
            EtisalatTopUp_20_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_20_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_20_Object.Print();
            EtisalatTopUp_20_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}