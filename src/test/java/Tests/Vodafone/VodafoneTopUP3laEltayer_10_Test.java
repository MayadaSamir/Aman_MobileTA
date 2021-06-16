package Tests.Vodafone;
import Pages.Vodafone.VodaFoneTopUp3laEltayerPage_10;
import Tests.TestBase;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VodafoneTopUP3laEltayer_10_Test extends TestBase {

    VodaFoneTopUp3laEltayerPage_10 Vfsha7n3latayer_10_Object ;

    @Test
    public void VFshahn3laEltayer_Slab_10 () throws Exception
    {
        try
        {
            Vfsha7n3latayer_10_Object = new VodaFoneTopUp3laEltayerPage_10(driver);
            Vfsha7n3latayer_10_Object.VF4ahn3laTayer.click();
            Vfsha7n3latayer_10_Object.sha7n3laEltayerscreen1("01123115524");
            Vfsha7n3latayer_10_Object.ConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(Vfsha7n3latayer_10_Object.Title.getText() , "شحن علي الطاير");
            Assert.assertEquals(Vfsha7n3latayer_10_Object.VfTopUpAmount.getText(), "القيمة");
            Assert.assertEquals(Vfsha7n3latayer_10_Object.VfTopUpTotalAmount.getText(), "المبلغ الكلى");
            Assert.assertTrue(Vfsha7n3latayer_10_Object.Amount10.getText().contains("10"));
            Assert.assertEquals(Vfsha7n3latayer_10_Object.TotalAmount14_29.getText(), "EGP 14.29");
            Vfsha7n3latayer_10_Object.SlabsVFscreen("0000");
            Vfsha7n3latayer_10_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
