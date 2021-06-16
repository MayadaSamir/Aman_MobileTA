package Tests.Etisalat;

import Pages.Etisalat.Etisalat_Akwa_Kart_fe_Misr_d2aye2_lkol_el4abakat_1_5_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etisalat_Akwa_Kart_d2aye2_lkol_el4abakat_1_5_Test extends TestBase {

    Etisalat_Akwa_Kart_fe_Misr_d2aye2_lkol_el4abakat_1_5_Page EtisalatDayaye2 ;

    @Test
    public  void   Etisalat_Akwa_Kart_fe_Misr_d2aye2_1_5 () throws Exception {
        try {
            EtisalatDayaye2 = new Etisalat_Akwa_Kart_fe_Misr_d2aye2_lkol_el4abakat_1_5_Page(driver);
            EtisalatDayaye2.ClickonService();
            EtisalatDayaye2.Screen1("01123115524");
            EtisalatDayaye2.Screen2("01123115524") ;
            EtisalatDayaye2.SelectSlab();
            Assert.assertEquals(EtisalatDayaye2.Amount.getText() , "القيمة");
            Assert.assertEquals(EtisalatDayaye2.TotalAmount.getText() , "المبلغ الكلى");
            Assert.assertEquals(EtisalatDayaye2.AmountVALUE.getText(),"EGP 1.5");
            Assert.assertEquals(EtisalatDayaye2.Totalvalue.getText() , "EGP 1.5");
            EtisalatDayaye2.flow("0000");
            Assert.assertEquals(EtisalatDayaye2.Successfull_Message.getText(),"عملية ناجحة");
            EtisalatDayaye2.print();
            EtisalatDayaye2.CancleButton.click();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
