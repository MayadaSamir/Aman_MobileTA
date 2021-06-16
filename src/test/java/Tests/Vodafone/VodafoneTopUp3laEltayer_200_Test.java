package Tests.Vodafone;
import Pages.Vodafone.VodafoneTopUp3laEltayerPage_200;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUp3laEltayer_200_Test extends TestBase {

    VodafoneTopUp3laEltayerPage_200 Vfsha7n3latayer_200_Object ;

    @Test
    public void VFshahn3laEltayer_Slab_200 () throws Exception
    {
        try {
            Vfsha7n3latayer_200_Object = new VodafoneTopUp3laEltayerPage_200(driver);
            Vfsha7n3latayer_200_Object.TabOnSha7n3laELtayer();
            Vfsha7n3latayer_200_Object.sha7n3laEltayerscreen1("01123115524");
            Vfsha7n3latayer_200_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(Vfsha7n3latayer_200_Object.Title.getText() , "شحن علي الطاير");
            Assert.assertTrue(Vfsha7n3latayer_200_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(Vfsha7n3latayer_200_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(Vfsha7n3latayer_200_Object.Amount200.getText().contains("200"));
            Assert.assertTrue(Vfsha7n3latayer_200_Object.TotalAmount285_72.getText().contains("285.72"));
            Vfsha7n3latayer_200_Object.SlabsVFscreen("0000");
            Vfsha7n3latayer_200_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
