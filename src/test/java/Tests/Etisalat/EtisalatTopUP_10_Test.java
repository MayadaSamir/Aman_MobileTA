package Tests.Etisalat;

import Pages.Etisalat.EtisalatTopUp_Page_10;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUP_10_Test extends TestBase {

    EtisalatTopUp_Page_10 EtisalatTopUp_10_Object ;

    @Test
    public  void  EtisalatTopUp_10 () throws Exception
    {
        try {
        EtisalatTopUp_10_Object = new EtisalatTopUp_Page_10(driver);
        EtisalatTopUp_10_Object.ClickOnEtisalatTopUPService();
        Assert.assertEquals(EtisalatTopUp_10_Object.ScreenMobileTitle.getText(), "رقم الهاتف المحمول");
        EtisalatTopUp_10_Object.EtisalatTopUPScreen1("01123115524");
        Assert.assertEquals(EtisalatTopUp_10_Object.ScreenconfirmationMobileTitle.getText(), "تأكيد رقم الهاتف المحمول");
        EtisalatTopUp_10_Object.EtisalatTopUpScreen2("01123115524");
        EtisalatTopUp_10_Object.Etisalat_SelectSlab10();
        Assert.assertEquals(EtisalatTopUp_10_Object.EtisalatTopUpAmount.getText(), "القيمة");
        Assert.assertEquals(EtisalatTopUp_10_Object.EtisalatTopUpTotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(EtisalatTopUp_10_Object.Amount10.getText(), "EGP 10.0");
        Assert.assertEquals(EtisalatTopUp_10_Object.TotalAmount14_29.getText(), "EGP 14.29");
        EtisalatTopUp_10_Object.EtislatFlow("0000");
        Assert.assertEquals(EtisalatTopUp_10_Object.Successfull_Message.getText(), "عملية ناجحة");
        EtisalatTopUp_10_Object.Print();
        EtisalatTopUp_10_Object.CancleButton.click();
         }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
