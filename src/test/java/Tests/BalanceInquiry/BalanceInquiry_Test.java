package Tests.BalanceInquiry;

import Pages.Balance_Inquiry.BalanceInquiryPage;
import Tests.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BalanceInquiry_Test extends TestBase {
    BalanceInquiryPage BalanceInquiryObJect ;

    @Test(enabled = true  , priority =  1)
    public void InquiryBalance () throws Exception
    {
        try {
            BalanceInquiryObJect = new BalanceInquiryPage(driver);
            BalanceInquiryObJect.balanceInquiry();
            BalanceInquiryObJect.printBalance();
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
