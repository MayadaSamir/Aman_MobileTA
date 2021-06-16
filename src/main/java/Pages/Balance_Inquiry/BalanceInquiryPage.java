package Pages.Balance_Inquiry;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class BalanceInquiryPage  extends PageBase {
    public BalanceInquiryPage(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(id = "balance_text_view")
    MobileElement BalanceInquiry ;

    @FindBy(id= "confirm_btn")
    MobileElement PrintBalance ;

    public  void  balanceInquiry ()
    {
        ClickButton(BalanceInquiry);
    }

    public void printBalance ()
    {
        ClickButton(PrintBalance);
    }
}
