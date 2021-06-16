package Tests.Etisalat;
import Pages.Etisalat.EtisalatTopUp_Page_100;
import Pages.Etisalat.EtisalatTopUp_Page_150;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUp_150_Test extends TestBase {

    EtisalatTopUp_Page_150 EtisalatTopUp_150_Object ;

    @Test
    public  void  EtisalatTopUp_150 () throws Exception
    {
        try {
            EtisalatTopUp_150_Object = new EtisalatTopUp_Page_150(driver);
            EtisalatTopUp_150_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_150_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_150_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_150_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_150_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_150_Object.Etisalat_SelectSlab150();
            Assert.assertEquals(EtisalatTopUp_150_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_150_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_150_Object.Amount150.getText(), "EGP 150.0");
            Assert.assertEquals(EtisalatTopUp_150_Object.TotalAmount214_29.getText(), "EGP 214.29");
            EtisalatTopUp_150_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_150_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_150_Object.Print();
            EtisalatTopUp_150_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
