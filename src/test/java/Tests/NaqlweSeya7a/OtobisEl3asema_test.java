package Tests.NaqlweSeya7a;


import Pages.NaqlweSeya7a.OtobisEl3asema;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OtobisEl3asema_test extends TestBase {

    OtobisEl3asema otobisiObj;

    @Test
    public void Test() throws Exception
    {
        try {
            otobisiObj = new OtobisEl3asema(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"نقل وسياحة\").instance(0))").click();
            Thread.sleep(5000);
            otobisiObj.ClickOnOtobisi();
            otobisiObj.raqmDaf3Entry("111");
            otobisiObj.raqmDaf3Entry1("111");
            Assert.assertEquals(otobisiObj.Amount.getText(), "القيمة");
            Assert.assertEquals(otobisiObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(otobisiObj.TotalAmount.getText(), "المبلغ الكلى");
            Assert.assertEquals(otobisiObj.AmountVALUE.getText(), "EGP 95.0");
            Assert.assertEquals(otobisiObj.CAFvalue.getText(), "EGP 5.70");
            Assert.assertEquals(otobisiObj.totalValue.getText(), "EGP 100.7");
            otobisiObj.customerInfo();
            otobisiObj.EnterPIN("0000");
            otobisiObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}
//not working

