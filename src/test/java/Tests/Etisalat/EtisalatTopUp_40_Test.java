package Tests.Etisalat;
import Pages.Etisalat.EtisalatTopUp_Page_40;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUp_40_Test extends TestBase {

    EtisalatTopUp_Page_40 EtisalatTopUp_40_Object;

    @Test
    public void EtisalatTopUp_40 () throws Exception
    {
        try {
            EtisalatTopUp_40_Object = new EtisalatTopUp_Page_40(driver);
            EtisalatTopUp_40_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_40_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_40_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_40_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_40_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_40_Object.Etisalat_SelectSlab40();
            Assert.assertEquals(EtisalatTopUp_40_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_40_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_40_Object.Amount40.getText(), "EGP 40.0");
            Assert.assertEquals(EtisalatTopUp_40_Object.TotalAmount57_14.getText(), "EGP 57.14");
            EtisalatTopUp_40_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_40_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_40_Object.Print();
            EtisalatTopUp_40_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}