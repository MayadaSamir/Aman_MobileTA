package Tests.Vodafone;

import Pages.Vodafone.VodafoneTopUpSha7nFakahPage_6;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUpSha7nFakah_6_Test extends TestBase {

    VodafoneTopUpSha7nFakahPage_6 VodafoneTopUpSha7nFakah6_Object ;

    @Test
    public  void  VfSha7nFakahSlab_6 () throws Exception
    {
        try {
            VodafoneTopUpSha7nFakah6_Object = new VodafoneTopUpSha7nFakahPage_6(driver);
            VodafoneTopUpSha7nFakah6_Object.VFSha7nTopUpFakahService();
            VodafoneTopUpSha7nFakah6_Object.VFSha4nFakaheEntryScreenMobile("01123115524");
            VodafoneTopUpSha7nFakah6_Object.VFSha7nFakahConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VodafoneTopUpSha7nFakah6_Object.Title.getText() , "شحن فودافون فكه");
            Assert.assertTrue(VodafoneTopUpSha7nFakah6_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah6_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah6_Object.Amount6.getText().contains("6"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah6_Object.TotalAmount6.getText().contains("6"));
            VodafoneTopUpSha7nFakah6_Object.SlabsVFscreen("0000");
            VodafoneTopUpSha7nFakah6_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
