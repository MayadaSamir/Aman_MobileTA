package Tests.Vodafone;

import Pages.Vodafone.VodafoneTopUpSha7nFakahPage_4_w_25;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VodafoneTopUpSha7nFakah_4_w_25_Test extends TestBase {

    VodafoneTopUpSha7nFakahPage_4_w_25 VodafoneTopUpSha7nFakah4__w_25_Object ;


    @Test
    public  void  VfSha7nFakahSlab_4_w_25 () throws Exception
    {
        try {
            VodafoneTopUpSha7nFakah4__w_25_Object = new VodafoneTopUpSha7nFakahPage_4_w_25(driver);
            VodafoneTopUpSha7nFakah4__w_25_Object.VFSha7nTopUpFakahService();
            VodafoneTopUpSha7nFakah4__w_25_Object.VFSha4nFakaheEntryScreenMobile("01123115524");
            VodafoneTopUpSha7nFakah4__w_25_Object.VFSha7nFakahConfirmationMobileNumberScreen2("01123115524");
            Assert.assertEquals(VodafoneTopUpSha7nFakah4__w_25_Object.Title.getText() , "شحن فودافون فكه");
            Assert.assertTrue(VodafoneTopUpSha7nFakah4__w_25_Object.VfTopUpAmount.getText().contains("القيمة"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah4__w_25_Object.VfTopUpTotalAmount.getText().contains("المبلغ الكلى"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah4__w_25_Object.Amount4_w_25.getText().contains("4.25"));
            Assert.assertTrue(VodafoneTopUpSha7nFakah4__w_25_Object.TotalAmount4_w_25.getText().contains("4.25"));
            VodafoneTopUpSha7nFakah4__w_25_Object.SlabsVFscreen("0000");
            VodafoneTopUpSha7nFakah4__w_25_Object.lastflow();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }

    @AfterTest
    public void  AfterTest ()
    {
        driver.quit();
    }
}
