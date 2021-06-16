package Pages.Wallets;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class CairoBank_Cashout_Page extends PageBase {
    public CairoBank_Cashout_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'service_name') and @text='محفظة بنك القاهره']")
    MobileElement CairoBankWallet ;

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'service_name') and @text='خدمة سحب نقدي']")
    MobileElement CairoBankcashOut ;

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumber ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (id = "popup_name")
    public MobileElement ScreenTitle ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterAmount ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3 ;

    @FindBy (id = "fees_title")
    public    MobileElement FeesScreenTitle ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement AmountLable;

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة']")
    public MobileElement CAFLable;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 8.0']")
    public MobileElement AmountValueE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 0.0']")
    public MobileElement CAFValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4 ;    // Code Confirmation Screen تأكيد 4

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation5 ;

    @FindBy (id = "fees_title")
    public   MobileElement FeesScreenTitle2 ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmounConfirmationtLable;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='8.0']")
    public MobileElement AmountConfirmationValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation6 ;

    public  void  clickOnService ()
    {
        ClickButton(CairoBankWallet);
        ClickButton(CairoBankcashOut);
    }

    public void Flow_Screen1 (String RefNumber)
    {
        SetTextElement(EnterMobileNumber , RefNumber );
        ClickButton(Confirmation1);
    }

    public void  Flow_Screen2 (String  ConRefNumber)
    {
        SetTextElement(EnterConfirmationMob , ConRefNumber);
        ClickButton(Confirmation2);
        System.out.println(ScreenTitle.getText());
    }

    public  void  EnterAmount ( String  Amount)
    {
        SetTextElement( EnterAmount, Amount);
        ClickButton(Confirmation3);
        System.out.println(FeesScreenTitle.getText());
        System.out.println(AmountLable.getText() + " =  " + AmountValueE.getText());
        System.out.println(CAFLable.getText() + "= " + CAFValue.getText());
    }

    public void ConfirmationFlow ( String  PIN)
    {
        ClickButton(Confirmation4);
        SetTextElement(PINEntryScreen , PIN);
        ClickButton(Confirmation5);
        System.out.println(FeesScreenTitle2.getText());
        System.out.println(TotalAmounConfirmationtLable.getText());
        System.out.println(AmountConfirmationValue.getText());
    }

    public  void  flow4 () {
        ClickButton(Confirmation6);
    }

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;

    @FindBy (id = "back_ib")
    public  MobileElement Back ;

    public  void  lastflow ()
    {
        ClickButton(CancleButton);
        ClickButton(Back);
        ClickButton(Back);
    }
}
