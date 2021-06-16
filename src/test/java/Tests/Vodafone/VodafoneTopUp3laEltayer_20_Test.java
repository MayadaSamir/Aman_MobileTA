package Tests.Vodafone;
import Pages.Vodafone.VodafoneTopUp3laEltayerPage_20;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUp3laEltayer_20_Test extends TestBase {

    VodafoneTopUp3laEltayerPage_20 Vfsha7n3latayer_20_Object ;

    @Test
    public void VFshahn3laEltayer_Slab_20 () throws Exception
    {
        try {
            Vfsha7n3latayer_20_Object = new VodafoneTopUp3laEltayerPage_20(driver);
            Vfsha7n3latayer_20_Object.TabOnSha7n3laELtayer();
            Vfsha7n3latayer_20_Object.sha7n3laEltayerscreen1("01123115524");
            Vfsha7n3latayer_20_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertTrue(Vfsha7n3latayer_20_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(Vfsha7n3latayer_20_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Vfsha7n3latayer_20_Object.Amount20.getText().contains("20"));
            Assert.assertTrue(Vfsha7n3latayer_20_Object.TotalAmount28_57.getText().contains("28.57"));
            Assert.assertEquals(Vfsha7n3latayer_20_Object.Title.getText() , "شحن علي الطاير");
            Vfsha7n3latayer_20_Object.SlabsVFscreen("0000");
            Vfsha7n3latayer_20_Object.lastflow ();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}


