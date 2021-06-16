package Tests.Vodafone;

import Pages.Vodafone.VodafoneTopUpSha7nFakahPage_8;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUpSha7nFakah_8_Test extends TestBase {

    VodafoneTopUpSha7nFakahPage_8 VodafoneTopUpSha7nFakah8_Object ;

    @Test
    public  void  VfSha7nFakahSlab_8 () throws Exception
    {
        try {
            VodafoneTopUpSha7nFakah8_Object = new VodafoneTopUpSha7nFakahPage_8(driver);
            VodafoneTopUpSha7nFakah8_Object.VFSha7nTopUpFakahService();
            VodafoneTopUpSha7nFakah8_Object.VFSha4nFakaheEntryScreenMobile("01123115524");
            VodafoneTopUpSha7nFakah8_Object.VFSha7nFakahConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VodafoneTopUpSha7nFakah8_Object.Title.getText() , "شحن فودافون فكه");
            Assert.assertTrue(VodafoneTopUpSha7nFakah8_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah8_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah8_Object.Amount8.getText().contains("8"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah8_Object.TotalAmount8.getText().contains("8"));
            VodafoneTopUpSha7nFakah8_Object.SlabsVFscreen("0000");
            VodafoneTopUpSha7nFakah8_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
