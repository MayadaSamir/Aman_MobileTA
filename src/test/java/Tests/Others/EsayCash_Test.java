package Tests.Others;
import Pages.Others.EasyCash_Page;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EsayCash_Test extends TestBase
{
    EasyCash_Page EasyCashObject ;

    @Test
    public void EasyCashService () throws Exception
    {
        try
        {
            EasyCashObject = new EasyCash_Page(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"مدفوعات متنوعة\").instance(0))").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ايزي كاش\").instance(0))").click();
            EasyCashObject.Flow_Screen1("2222");
            EasyCashObject.Flow_Screen2("2222");
            Assert.assertEquals(EasyCashObject.Parameters.getText() , "القيمة:10.0\n" +
                    "اسم العميل:Some User Name\n" +
                    "رقم هاتف العميل:01234567890\n");
            EasyCashObject.Flow();
            Assert.assertEquals(EasyCashObject.AmountLable.getText() , "القيمة");
            Assert.assertEquals(EasyCashObject.CAFLable.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(EasyCashObject.TotalAmountLable.getText() , "المبلغ الكلى");
            Assert.assertEquals(EasyCashObject.AmountValueE.getText() , "EGP 10.0");
            Assert.assertEquals(EasyCashObject.CAFValue.getText() , "EGP 5.70");
            Assert.assertEquals(EasyCashObject.totalamountValue.getText() , "EGP 15.7");
            EasyCashObject.Flow2("0000");
            Assert.assertEquals(EasyCashObject.Successfull_Message.getText() , "عملية ناجحة");
            EasyCashObject.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
