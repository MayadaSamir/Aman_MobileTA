package Tests.Vodafone;
import Pages.Vodafone.VodafoneTopUp3laEltayerPage_50;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUp3laEltayer_50_Test extends TestBase {

    VodafoneTopUp3laEltayerPage_50 Vfsha7n3latayer_50_Object ;

    @Test
    public void VFshahn3laEltayer_Slab_50 () throws Exception
    {
        try {
            Vfsha7n3latayer_50_Object = new VodafoneTopUp3laEltayerPage_50(driver);
            Vfsha7n3latayer_50_Object.TabOnSha7n3laELtayer();
            Vfsha7n3latayer_50_Object.sha7n3laEltayerscreen1("01123115524");
            Vfsha7n3latayer_50_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(Vfsha7n3latayer_50_Object.Title.getText() , "شحن علي الطاير");
            Assert.assertTrue(Vfsha7n3latayer_50_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(Vfsha7n3latayer_50_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Vfsha7n3latayer_50_Object.Amount50.getText().contains("50"));
            Assert.assertTrue(Vfsha7n3latayer_50_Object.TotalAmount71_43.getText().contains("71.43"));
            Vfsha7n3latayer_50_Object.SlabsVFscreen("0000");
            Vfsha7n3latayer_50_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
