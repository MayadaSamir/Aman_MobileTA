package Tests.Etisalat;

import Pages.Etisalat.EtisalatTopUp_Page_200;
import Pages.Etisalat.EtisalatTopUp_Page_250;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUp_250_Test extends TestBase {

    EtisalatTopUp_Page_250  EtisalatTopUp_250_Object ;

    @Test
    public  void  EtisalatTopUp_250 () throws Exception
    {
        try {
            EtisalatTopUp_250_Object = new EtisalatTopUp_Page_250(driver);
            EtisalatTopUp_250_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_250_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_250_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_250_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_250_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_250_Object.Etisalat_SelectSlab250();
            Assert.assertEquals(EtisalatTopUp_250_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_250_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_250_Object.Amount250.getText(), "EGP 250.0");
            Assert.assertEquals(EtisalatTopUp_250_Object.TotalAmount357_15.getText(), "EGP 357.15");
            EtisalatTopUp_250_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_250_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_250_Object.Print();
            EtisalatTopUp_250_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
