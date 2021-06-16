package Tests.Etisalat;

import Pages.Etisalat.EtisalatTopUp_Page_25;
import Pages.Etisalat.EtisalatTopUp_Page_30;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUP_30_Test extends TestBase {
    EtisalatTopUp_Page_30 EtisalatTopUp_30_Object ;

    @Test
    public  void  EtisalatTopUp_10 () throws Exception
    {
        try {
        EtisalatTopUp_30_Object = new EtisalatTopUp_Page_30(driver);
        EtisalatTopUp_30_Object.ClickOnEtisalatTopUPService();
        Assert.assertEquals(EtisalatTopUp_30_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
        EtisalatTopUp_30_Object.EtisalatTopUPScreen1("01123115524");
        Assert.assertEquals(EtisalatTopUp_30_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
        EtisalatTopUp_30_Object.EtisalatTopUpScreen2("01123115524");
        EtisalatTopUp_30_Object.Etisalat_SelectSlab30();
        Assert.assertEquals(EtisalatTopUp_30_Object.EtisalatTopUpAmount.getText(), "القيمة");
        Assert.assertEquals(EtisalatTopUp_30_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(EtisalatTopUp_30_Object.Amount30.getText(), "EGP 30.0");
        Assert.assertEquals(EtisalatTopUp_30_Object.TotalAmount42_86.getText(), "EGP 42.86");
        EtisalatTopUp_30_Object.EtislatFlow("0000");
        Assert.assertEquals(EtisalatTopUp_30_Object.Successfull_Message.getText(), "عملية ناجحة");
        EtisalatTopUp_30_Object.Print();
        EtisalatTopUp_30_Object.CancleButton.click();

        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
