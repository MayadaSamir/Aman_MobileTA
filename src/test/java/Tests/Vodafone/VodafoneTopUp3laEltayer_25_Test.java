package Tests.Vodafone;
import Pages.Vodafone.VodafoneTopUp3laEltayerPage_25;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUp3laEltayer_25_Test extends TestBase {

    VodafoneTopUp3laEltayerPage_25 Vfsha7n3latayer_25_Object ;

    @Test
    public void VFshahn3laEltayer_Slab_25 () throws Exception
    {
        try {
            Vfsha7n3latayer_25_Object = new VodafoneTopUp3laEltayerPage_25(driver);
            Vfsha7n3latayer_25_Object.TabOnSha7n3laELtayer();
            Vfsha7n3latayer_25_Object.sha7n3laEltayerscreen1("01123115524");
            Vfsha7n3latayer_25_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(Vfsha7n3latayer_25_Object.Title.getText() , "شحن علي الطاير");
            Assert.assertTrue(Vfsha7n3latayer_25_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(Vfsha7n3latayer_25_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Vfsha7n3latayer_25_Object.Amount25.getText().contains("25"));
            Assert.assertTrue(Vfsha7n3latayer_25_Object.TotalAmount35_72.getText().contains("35.72"));
            Vfsha7n3latayer_25_Object.SlabsVFscreen("0000");
            Vfsha7n3latayer_25_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
