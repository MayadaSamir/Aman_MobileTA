package Pages.Orange;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class OrangeTopUp_20_Page extends PageBase {
    public OrangeTopUp_20_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='شحن أورنج']")
    MobileElement OrangeTopUPService ;

    public void OrangeTopUp ()

    {
        ClickButton(OrangeTopUPService);
    }

    @FindBy (id = "popup_name")
    public MobileElement ScreenMobileTitle ;

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumber ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id = "popup_name")
    public MobileElement ScreenconfirmationMobileTitle ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='20']")
    MobileElement Slab20 ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement TopUpAmount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='المبلغ الكلى']")
    public MobileElement TopUpTotalAmount ;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text= 'EGP 20.00']")
    public MobileElement Amount20 ;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 28.6']")
    public MobileElement TotalAmount_28_6 ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation3 ;

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation4 ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    public void  OrangeTopUPScreen1 ( String  MobileNumber)
    {
        System.out.println(ScreenMobileTitle.getText());
        SetTextElement(EnterMobileNumber, MobileNumber );
        ClickButton(Confirmation1);
    }

    public void  OrangeETopUpScreen2 ( String  ConfirmationMobileNumber)
    {
        System.out.println(ScreenconfirmationMobileTitle.getText());
        SetTextElement(EnterConfirmationMob , ConfirmationMobileNumber);
        ClickButton(Confirmation2);
    }

    public  void Orange_SelectSla20 ()
    {
        ClickButton(Slab20);
    }

    public void  OrangeFlow (String PIN ) {

        System.out.println(TopUpAmount.getText());
        System.out.println(TopUpTotalAmount.getText());
        System.out.println(Amount20.getText());
        System.out.println(TotalAmount_28_6.getText());
        ClickButton(Confirmation3);
        System.out.println(PINEntryScreenTitle.getText());
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation4);
        System.out.println(Successfull_Message.getText());

    }
    public  void  Print()
    {
        ClickButton(Print);
    }
}
