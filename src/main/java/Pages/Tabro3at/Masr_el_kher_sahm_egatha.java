package Pages.Tabro3at;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Masr_el_kher_sahm_egatha extends PageBase {
    public Masr_el_kher_sahm_egatha(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(id = "popup_name")
    public MobileElement mobileTitle;

    @FindBy (id = "user_input_edit")
    MobileElement EnterNumber;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;

    @FindBy (id = "popup_name")
    public MobileElement mobileConfirmationTitle;

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

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 6.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 0.00']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 6']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation5 ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print;


    public void  raqmElmob (String mobNumber)
    {
        System.out.println(mobileTitle.getText());
        SetTextElement(EnterNumber , mobNumber );
        ClickButton(Confirmation1);
    }

    public void  raqmElmob1 (String ConfirmationMobNumber)
    {
        System.out.println(mobileConfirmationTitle.getText());
        SetTextElement(EnterNumberConfirmation , ConfirmationMobNumber);
        ClickButton(Confirmation2);
    }
    public void  amountEntry (String money)
    {
        System.out.println(screenAmountTitle.getText());
        SetTextElement(EnterMoney , money );
        ClickButton(Confirmation3);
    }
    public  void  flow()
    {
        System.out.println(Amount.getText());
        System.out.println(CAFAmount.getText());
        System.out.println(TotalAmount.getText());
        System.out.println(totalValue.getText());
        System.out.println(CAFvalue.getText());
        System.out.println(AmountVALUE.getText());
        ClickButton(Confirmation4);
    }

    public  void  EnterPIN ( String PIN) {
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation5);
    }

    public void  print ()
    {
        ClickButton(Print);
    }
}
