package Tests.Gam3at_7okmya;

import Pages.Gam3at_7okmya.Gam3t_ganob_elwady;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gam3t_ganob_elwady_test extends TestBase {
    Gam3t_ganob_elwady gam3t_ganob_elwadyObj ;

    @Test
    public  void  StudentRegister() throws Exception
    {
        try {
            gam3t_ganob_elwadyObj = new Gam3t_ganob_elwady(driver);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"الجامعات الحكومية\").instance(0))").click();
            //Thread.sleep(5000);
            //gam3t_ganob_elwadyObj.ClickOnGam3at7okmya();
            gam3t_ganob_elwadyObj.ClickOnGam3at7okmya1();
            //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"جامعة طنطا\").instance(0))").click();
            gam3t_ganob_elwadyObj.ClickOnGam3tGanobElWady ();
            gam3t_ganob_elwadyObj.studentCodeEntry("100100");
            gam3t_ganob_elwadyObj.studentCodeEntry1("100100");
            gam3t_ganob_elwadyObj.studentInfo();
            Assert.assertEquals(gam3t_ganob_elwadyObj.Amount.getText() , "القيمة");
            Assert.assertEquals(gam3t_ganob_elwadyObj.CAFAmount.getText() , "تكلفة الخدمة بالجنيه");
            Assert.assertEquals(gam3t_ganob_elwadyObj.TotalAmount.getText(),"المبلغ الكلى");
            Assert.assertEquals(gam3t_ganob_elwadyObj.AmountVALUE.getText() , "EGP 300.0");
            Assert.assertEquals(gam3t_ganob_elwadyObj.CAFvalue.getText() , "EGP 5.70");
            Assert.assertEquals(gam3t_ganob_elwadyObj.totalValue.getText() , "EGP 305.7");
            gam3t_ganob_elwadyObj.studentInfo2();
            gam3t_ganob_elwadyObj.EnterPIN("0000");
            gam3t_ganob_elwadyObj.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Assert.fail();
        }
    }
}

