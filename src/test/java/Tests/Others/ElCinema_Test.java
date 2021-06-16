package Tests.Others;

import Pages.Others.ElCinema_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElCinema_Test extends TestBase {

    ElCinema_Page ElcinemaObject;

    @Test
    public  void  Elcinema () throws Exception
    {
        try
        {
            ElcinemaObject = new ElCinema_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مدفوعات متنوعة\").instance(0))").click();
            ElcinemaObject.ClickOnService();
            ElcinemaObject.Flow_Screen1("777");
            ElcinemaObject.Flow_Screen2("777");
            Assert.assertEquals(ElcinemaObject.Info.getText() , "اسم العميل:test name\n" +
                    "رقم هاتف العميل:01112565125\n" +
                    "القيمة:108.0\n" +
                    "القيمة:108.0\n");
            ElcinemaObject.FLOW();
            Assert.assertEquals(ElcinemaObject.AmountLable.getText() , "القيمة");
            Assert.assertEquals(ElcinemaObject.CAFLable.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(ElcinemaObject.TotalAmountLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(ElcinemaObject.AmountValueE.getText() , "EGP 108.0");
            Assert.assertEquals(ElcinemaObject.CAFValue.getText() , "EGP 3.42");
            Assert.assertEquals(ElcinemaObject.totalamountValue.getText() , "EGP 111.42");
            ElcinemaObject.FeesConfirmaion();
            ElcinemaObject.EnterPIN("0000");
            Assert.assertEquals(ElcinemaObject.Successfull_Message.getText(), "عملية ناجحة");
            ElcinemaObject.Print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
