package Tests.Vodafone;

import Pages.Vodafone.VodafoneTopUpSha7nFakahPage_2;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUpSha7nFakah_2_Test extends TestBase {

    VodafoneTopUpSha7nFakahPage_2 VodafoneTopUpSha7nFakah_2_Object ;

    @Test
    public  void VfSha7nFakahSlab_2 () throws Exception
    {
        try {
            VodafoneTopUpSha7nFakah_2_Object = new VodafoneTopUpSha7nFakahPage_2(driver);
            VodafoneTopUpSha7nFakah_2_Object.VFSha7nTopUpFakahService();
            VodafoneTopUpSha7nFakah_2_Object.VFSha4nFakaheEntryScreenMobile("01123115524");
            VodafoneTopUpSha7nFakah_2_Object.VFSha7nFakahConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VodafoneTopUpSha7nFakah_2_Object.Title.getText(), "شحن فودافون فكه");
            Assert.assertTrue(VodafoneTopUpSha7nFakah_2_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah_2_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah_2_Object.Amount2.getText().contains("2"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah_2_Object.TotalAmount2.getText().contains("2"));
            VodafoneTopUpSha7nFakah_2_Object.SlabsVFscreen("0000");
            VodafoneTopUpSha7nFakah_2_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

