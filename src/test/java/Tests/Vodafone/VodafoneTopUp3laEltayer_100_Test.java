package Tests.Vodafone;

import Pages.Vodafone.VodafoneTopUp3laEltayerPage_100;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUp3laEltayer_100_Test extends TestBase {

    VodafoneTopUp3laEltayerPage_100 Vfsha7n3latayer_100_Object ;

    @Test
    public void VFshahn3laEltayer_Slab_100 () throws Exception
    {
        try {
            Vfsha7n3latayer_100_Object = new VodafoneTopUp3laEltayerPage_100(driver);
            Vfsha7n3latayer_100_Object.TabOnSha7n3laELtayer();
            Vfsha7n3latayer_100_Object.sha7n3laEltayerscreen1("01123115524");
            Vfsha7n3latayer_100_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(Vfsha7n3latayer_100_Object.Title.getText() , "شحن علي الطاير");
            Assert.assertTrue(Vfsha7n3latayer_100_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(Vfsha7n3latayer_100_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Vfsha7n3latayer_100_Object.Amount100.getText().contains("100"));
            Assert.assertTrue(Vfsha7n3latayer_100_Object.TotalAmount142_86.getText().contains("142.86"));
            Vfsha7n3latayer_100_Object.SlabsVFscreen("0000");
            Vfsha7n3latayer_100_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
