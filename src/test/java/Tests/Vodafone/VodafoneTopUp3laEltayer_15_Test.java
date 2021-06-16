package Tests.Vodafone;
import Pages.Vodafone.VodafoneTopUp3laEltayerPage_15;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUp3laEltayer_15_Test extends TestBase {

    VodafoneTopUp3laEltayerPage_15 Vfsha7n3latayer_15_Object ;


    @Test
    public void VFshahn3laEltayer_Slab_15 () throws Exception
    {
        try {
            Vfsha7n3latayer_15_Object = new VodafoneTopUp3laEltayerPage_15(driver);
            Vfsha7n3latayer_15_Object.TabOnSha7n3laELtayer();
            Vfsha7n3latayer_15_Object.sha7n3laEltayerscreen1("01123115524");
            Vfsha7n3latayer_15_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(Vfsha7n3latayer_15_Object.Title.getText() , "شحن علي الطاير");
            Assert.assertEquals(Vfsha7n3latayer_15_Object.VfTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(Vfsha7n3latayer_15_Object.VfTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertTrue(Vfsha7n3latayer_15_Object.Amount15.getText().contains("15"));
            Assert.assertEquals(Vfsha7n3latayer_15_Object.TotalAmount21_43.getText(), "EGP 21.43");
            Vfsha7n3latayer_15_Object.SlabsVFscreen("0000");
            Vfsha7n3latayer_15_Object.lastflow ();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

