package Pages.ta7wel_le_hesab_tager;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class ta7wel_le_hesab_tager extends PageBase {
    public ta7wel_le_hesab_tager (AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='تحويل لحساب تاجر امان']")
    public MobileElement ta7wel;

    @FindBy(id = "popup_name")
    public MobileElement hesabTitle;

    @FindBy (id = "user_input_edit")
    MobileElement EnterNumber;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;

    @FindBy (id = "popup_name")
    public MobileElement hesabConfirmationTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterNumberConfirmation;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2;

    @FindBy (id = "popup_name")
    public MobileElement screenAmountTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterMoney;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;

    @FindBy (id = "popup_name")
    public MobileElement screenConfirmAmountTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterMoney1;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 6.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 6']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation5;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation6 ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public  void ClickOnTa7wel()
    { ClickButton(ta7wel); }

    public void  raqmElhesab (String mobNumber)
    {
        System.out.println(hesabTitle.getText());
        SetTextElement(EnterNumber , mobNumber );
        ClickButton(Confirmation1);
    }

    public void  raqmElhesab1  (String ConfirmationMobNumber)
    {
        System.out.println(hesabConfirmationTitle.getText());
        SetTextElement(EnterNumberConfirmation , ConfirmationMobNumber);
        ClickButton(Confirmation2);
    }

    public void  amountEntry (String money)
    {
        System.out.println(screenAmountTitle.getText());
        SetTextElement(EnterMoney , money );
        ClickButton(Confirmation3);
    }

    public void  amountEntryConfirm (String money)
    {
        System.out.println(screenConfirmAmountTitle.getText());
        SetTextElement(EnterMoney1 , money );
        ClickButton(Confirmation4);
    }

    public  void  flow()
    {
        System.out.println(Amount.getText());
        System.out.println(TotalAmount.getText());
        System.out.println(totalValue.getText());
        System.out.println(AmountVALUE.getText());
        ClickButton(Confirmation5);
    }

    public  void  EnterPIN ( String PIN) {
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation6);
    }

    public void  print ()
    {
        ClickButton(Print);
    }
}


