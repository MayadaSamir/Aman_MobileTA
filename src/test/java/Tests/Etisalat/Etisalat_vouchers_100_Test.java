package Tests.Etisalat;
import Pages.Etisalat.Etisalat_vouchers_100;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Etisalat_vouchers_100_Test extends TestBase {

    Etisalat_vouchers_100 Etisalat;

    @Test
    public void etisalat_voucher_100() throws Exception
    {
        try {
            Etisalat = new Etisalat_vouchers_100(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable" +
                    "(new UiSelector().scrollable(true).instance(3))" + ".setAsHorizontalList()" +
                    ".scrollIntoView(new UiSelector().textContains(\"كروت شحن اتصالات\"))").click();
            Etisalat.Flow1();
            Assert.assertEquals(Etisalat.AmountLable.getText(), "القيمة");
            Assert.assertEquals(Etisalat.AmountValueE.getText(), "EGP 100.0");
            Assert.assertEquals(Etisalat.TotalAmountLable.getText(), "المبلغ الكلي");
            Assert.assertEquals(Etisalat.totalamountValue.getText(), "EGP 100.0");
            Etisalat.flow2("0000");
            if (Etisalat.Receipt_Title.isEnabled()) {
                Assert.assertEquals(Etisalat.Receipt_Title.getText(), "كروت شحن اتصالات - كود الشحن");
            } else {
                throw new Exception("issue");
            }
            if (Etisalat.TotalAmountReceipt.isDisplayed()) {
                Assert.assertEquals(Etisalat.TotalAmountReceipt.getText(), "100.0 EGP");
            } else {
                throw new Exception("issue");
            }
            if (Etisalat.Footer.isDisplayed()) {
                Assert.assertEquals(Etisalat.Footer.getText(), "*ملاحظات للعميل: للشحن اطلب #الكود*556*\n");
            } else {
                throw new Exception("issue");
            }
            Etisalat.flow3();
            Etisalat.lastflow();
        } catch (Exception e) {
            System.out.println(e);
            Assert.fail();
        }
    }
}
