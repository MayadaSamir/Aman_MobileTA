package Tests.WE;

import Pages.WE.FatortWE;
import Tests.TestBase;
import io.appium.java_client.MobileBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FatortWE_Test extends TestBase {

    FatortWE fatortWeObj;

    @Test
    public  void  fatortWe ()
    {
        fatortWeObj = new FatortWE(driver);

        //  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"فاتورة وي\").instance(0))").click();
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).resourceId(\"main_services_list\")).setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"فاتورة وي\"))");
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).resourceId(\"sub_service_name_tv\")).setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"فاتورة وي\"))");
        fatortWeObj.customerteleEntry("01090019467");
        fatortWeObj.customerteleEntry1("01090019467");
        fatortWeObj.customerInfo();
        Assert.assertEquals(fatortWeObj.Amount.getText(), "القيمة");
        Assert.assertEquals(fatortWeObj.CAFAmount.getText(), "تكلفة الخدمة بالجنيه");
        Assert.assertEquals(fatortWeObj.TotalAmount.getText(), "المبلغ الكلى");
        Assert.assertEquals(fatortWeObj.AmountVALUE.getText(), "EGP 304.17");
        Assert.assertEquals(fatortWeObj.CAFvalue.getText(), "EGP 5.70");
        Assert.assertEquals(fatortWeObj.totalValue.getText(), "EGP 309.87");
        fatortWeObj.EnterPIN("0000");
        fatortWeObj.print();
    }

    public void scrollByID(String Id, int index) {

        try {

            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"فاتورة وي\").instance(0));"));

            //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id+"\").instance("+index+"));"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

