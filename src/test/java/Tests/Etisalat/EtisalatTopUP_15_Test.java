package Tests.Etisalat;
import Pages.Etisalat.EtisalatTopUp_Page_15;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUP_15_Test extends TestBase {

    EtisalatTopUp_Page_15 EtisalatTopUp_15_Object;

    @Test
    public void EtisalatTopUp_10() throws Exception
    {
        try {
            EtisalatTopUp_15_Object = new EtisalatTopUp_Page_15(driver);
            EtisalatTopUp_15_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_15_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_15_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_15_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_15_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_15_Object.Etisalat_SelectSlab15();
            Assert.assertEquals(EtisalatTopUp_15_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_15_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_15_Object.Amount15.getText(), "EGP 15.0");
            Assert.assertEquals(EtisalatTopUp_15_Object.TotalAmount21_43.getText(), "EGP 21.43");
            EtisalatTopUp_15_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_15_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_15_Object.Print();
            EtisalatTopUp_15_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}