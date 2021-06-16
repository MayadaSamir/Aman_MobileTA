package Tests.Etisalat;

import Pages.Etisalat.EtisalatTopUp_Page_40;
import Pages.Etisalat.EtisalatTopUp_Page_50;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUP_50_Test extends TestBase {
    EtisalatTopUp_Page_50 EtisalatTopUp_50_Object ;

    @Test
    public  void  EtisalatTopUp_50 () throws Exception
    {
        try {
            EtisalatTopUp_50_Object = new EtisalatTopUp_Page_50(driver);
            EtisalatTopUp_50_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_50_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_50_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_50_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_50_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_50_Object.Etisalat_SelectSlab50();
            Assert.assertEquals(EtisalatTopUp_50_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_50_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_50_Object.Amount50.getText(), "EGP 50.0");
            Assert.assertEquals(EtisalatTopUp_50_Object.TotalAmount71_43.getText(), "EGP 71.43");
            EtisalatTopUp_50_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_50_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_50_Object.Print();
            EtisalatTopUp_50_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
