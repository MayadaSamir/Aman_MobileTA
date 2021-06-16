package Pages.Offers_and_Gifts;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Vf_Prizes_7wafez_365_3la_elTayer_For_Merchant_Page extends PageBase {

    public Vf_Prizes_7wafez_365_3la_elTayer_For_Merchant_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='جوائز فودافون']")
    MobileElement VodaFonePrizes;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='حوافز 365 على الطاير للتاجر']")
    MobileElement Orod3653laEltayerforMerchant;

    public  void  ClickOnService ()
    {
        ClickButton(VodaFonePrizes);
        ClickButton(Orod3653laEltayerforMerchant);
    }

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/android.widget.TextView\n")
    public  MobileElement hawafez ;

    @FindBy ( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button\n")
    MobileElement rpgo3_Button ;

    public  void  flow ()
    {
        System.out.println(hawafez.getText());
        ClickButton(rpgo3_Button);
    }
}









