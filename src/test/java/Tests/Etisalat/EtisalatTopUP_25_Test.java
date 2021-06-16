package Tests.Etisalat;
import Pages.Etisalat.EtisalatTopUp_Page_25;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtisalatTopUP_25_Test extends TestBase {
    EtisalatTopUp_Page_25 EtisalatTopUp_25_Object ;

    @Test
    public  void  EtisalatTopUp_10 () throws Exception
    {
        try {
        EtisalatTopUp_25_Object = new EtisalatTopUp_Page_25 (driver);
        EtisalatTopUp_25_Object.ClickOnEtisalatTopUPService();
        Assert.assertEquals(EtisalatTopUp_25_Object.ScreenMobileTitle.getText() , "رقم الهاتف المحمول");
        EtisalatTopUp_25_Object.EtisalatTopUPScreen1("01123115524");
        Assert.assertEquals(EtisalatTopUp_25_Object.ScreenconfirmationMobileTitle.getText() ,"تأكيد رقم الهاتف المحمول");
        EtisalatTopUp_25_Object.EtisalatTopUpScreen2("01123115524") ;
        EtisalatTopUp_25_Object.Etisalat_SelectSlab25();
        Assert.assertEquals(EtisalatTopUp_25_Object.EtisalatTopUpAmount.getText() , "القيمة");
        Assert.assertEquals(EtisalatTopUp_25_Object.EtisalatTopUpTotalAmount.getText() , "المبلغ الكلى");
        Assert.assertEquals(EtisalatTopUp_25_Object.Amount25.getText(),"EGP 25.0");
        Assert.assertEquals(EtisalatTopUp_25_Object.TotalAmount35_72.getText() , "EGP 35.72");
        EtisalatTopUp_25_Object.EtislatFlow("0000");
        Assert.assertEquals(EtisalatTopUp_25_Object.Successfull_Message.getText(),"عملية ناجحة");
        EtisalatTopUp_25_Object.Print();
        EtisalatTopUp_25_Object.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
