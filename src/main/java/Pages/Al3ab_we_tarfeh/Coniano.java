package Pages.Al3ab_we_tarfeh;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Coniano extends PageBase {

    public Coniano(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='كونيانو']")
    public MobileElement coniano;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='كونيانو']")
    public MobileElement conianoo; //inside

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


    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value')]")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value')]")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value')]")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation4 ;

    @FindBy (id = "message")
    public MobileElement Successful_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public  void ClickOnConiano()
    { ClickButton(coniano); }

    public  void ClickOnConianoInside()
    { ClickButton(conianoo); }

    public void  raqmElMob (String mobNumber)
    {
        System.out.println(mobileTitle.getText());
        SetTextElement(EnterNumber , mobNumber );
        ClickButton(Confirmation1);
    }

    public void  raqmElMob1  (String ConfirmationMobNumber)
    {
        System.out.println(mobileConfirmationTitle.getText());
        SetTextElement(EnterNumberConfirmation , ConfirmationMobNumber);
        ClickButton(Confirmation2);
    }

    public  void  flow()
    {
        System.out.println(Amount.getText());
        System.out.println(CAFAmount.getText());
        System.out.println(TotalAmount.getText());
        System.out.println(totalValue.getText());
        System.out.println(CAFvalue.getText());
        System.out.println(AmountVALUE.getText());
        ClickButton(Confirmation3);
    }

    public  void  EnterPIN ( String PIN) {
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation4);
    }

    public void  print ()
    {
        ClickButton(Print);
    }

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancelButton;

    @FindBy ( id = "back_ib")
    public  MobileElement BackButton;

    public  void  BackToMainMenu ()
    {
        ClickButton(CancelButton);
        ClickButton(BackButton);
        ClickButton(BackButton);
    }
}

