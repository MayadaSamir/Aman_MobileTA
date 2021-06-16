package Tests.Etisalat;

import Pages.Etisalat.EtisalatTopUp_Page_150;
import Pages.Etisalat.EtisalatTopUp_Page_200;
import Pages.Etisalat.EtisalatTopUp_Page_25;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUp_200_Test extends TestBase {

    EtisalatTopUp_Page_200  EtisalatTopUp_200_Object ;

    @Test
    public  void  EtisalatTopUp_200 () throws Exception
    {
        try {
            EtisalatTopUp_200_Object = new EtisalatTopUp_Page_200(driver);
            EtisalatTopUp_200_Object.ClickOnEtisalatTopUPService();
            Assert.assertEquals(EtisalatTopUp_200_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
            EtisalatTopUp_200_Object.EtisalatTopUPScreen1("01123115524");
            Assert.assertEquals(EtisalatTopUp_200_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
            EtisalatTopUp_200_Object.EtisalatTopUpScreen2("01123115524");
            EtisalatTopUp_200_Object.Etisalat_SelectSlab200();
            Assert.assertEquals(EtisalatTopUp_200_Object.EtisalatTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(EtisalatTopUp_200_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(EtisalatTopUp_200_Object.Amount200.getText(), "EGP 200.0");
            Assert.assertEquals(EtisalatTopUp_200_Object.TotalAmount285_72.getText(), "EGP 285.72");
            EtisalatTopUp_200_Object.EtislatFlow("0000");
            Assert.assertEquals(EtisalatTopUp_200_Object.Successfull_Message.getText(), "عملية ناجحة");
            EtisalatTopUp_200_Object.Print();
            EtisalatTopUp_200_Object.CancleButton.click();

        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}