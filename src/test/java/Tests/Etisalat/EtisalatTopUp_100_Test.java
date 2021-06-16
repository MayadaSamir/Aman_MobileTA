package Tests.Etisalat;

import Pages.Etisalat.EtisalatTopUp_Page_100;
import Pages.Etisalat.EtisalatTopUp_Page_40;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUp_100_Test extends TestBase {

    EtisalatTopUp_Page_100  EtisalatTopUp_100_Object ;

    @Test
    public  void  EtisalatTopUp_100 () throws Exception
    {
        try {
            EtisalatTopUp_100_Object = new EtisalatTopUp_Page_100(driver);
            EtisalatTopUp_100_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_100_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_100_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_100_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_100_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_100_Object.Etisalat_SelectSlab100();
            Assert.assertEquals(EtisalatTopUp_100_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_100_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_100_Object.Amount100.getText(), "EGP 100.0");
            Assert.assertEquals(EtisalatTopUp_100_Object.TotalAmount142_86.getText(), "EGP 142.86");
            EtisalatTopUp_100_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_100_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_100_Object.Print();
            EtisalatTopUp_100_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
