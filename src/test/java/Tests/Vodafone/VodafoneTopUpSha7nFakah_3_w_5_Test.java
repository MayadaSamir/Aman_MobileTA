package Tests.Vodafone;
import Pages.Vodafone.VodafoneTopUpSha7nFakahPage_3_w_5;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUpSha7nFakah_3_w_5_Test extends TestBase {

    VodafoneTopUpSha7nFakahPage_3_w_5 VodafoneTopUpSha7nFakah3_w_5_Object ;

    @Test
    public  void  VfSha7nFakahSlab_3_w_5 () throws Exception
    {
        try {
            VodafoneTopUpSha7nFakah3_w_5_Object = new VodafoneTopUpSha7nFakahPage_3_w_5(driver);
            VodafoneTopUpSha7nFakah3_w_5_Object.VFSha7nTopUpFakahService();
            VodafoneTopUpSha7nFakah3_w_5_Object.VFSha4nFakaheEntryScreenMobile("01123115524");
            VodafoneTopUpSha7nFakah3_w_5_Object.VFSha7nFakahConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VodafoneTopUpSha7nFakah3_w_5_Object.Title.getText(), "شحن فودافون فكه");
            Assert.assertTrue(VodafoneTopUpSha7nFakah3_w_5_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah3_w_5_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah3_w_5_Object.Amount3_w_5.getText().contains("3.5"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah3_w_5_Object.TotalAmount3_w_5.getText().contains("3.5"));
            VodafoneTopUpSha7nFakah3_w_5_Object.SlabsVFscreen("0000");
            VodafoneTopUpSha7nFakah3_w_5_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
