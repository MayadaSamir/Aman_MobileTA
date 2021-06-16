package Tests.Vodafone;

import Pages.Vodafone.VodafoneTopUpSha7nFakahPage_4;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUpSha7nFakah_4_Test extends TestBase {

    VodafoneTopUpSha7nFakahPage_4 VodafoneTopUpSha7nFakah4_Object ;

    @Test
    public  void  VfSha7nFakahSlab_4 () throws Exception
    {
        try {
            VodafoneTopUpSha7nFakah4_Object = new VodafoneTopUpSha7nFakahPage_4(driver);
            VodafoneTopUpSha7nFakah4_Object.VFSha7nTopUpFakahService();
            VodafoneTopUpSha7nFakah4_Object.VFSha4nFakaheEntryScreenMobile("01123115524");
            VodafoneTopUpSha7nFakah4_Object.VFSha7nFakahConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VodafoneTopUpSha7nFakah4_Object.Title.getText() , "شحن فودافون فكه");
            Assert.assertTrue(VodafoneTopUpSha7nFakah4_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah4_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah4_Object.Amount4.getText().contains("4"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah4_Object.TotalAmount4.getText().contains("4"));
            VodafoneTopUpSha7nFakah4_Object.SlabsVFscreen("0000");
            VodafoneTopUpSha7nFakah4_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
