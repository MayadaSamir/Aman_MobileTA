package Pages.WE;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class FatortWE extends PageBase {
    public FatortWE(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(id = "popup_name")
    public MobileElement ScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    MobileElement telephoneNo;

    @FindBy(id ="confirm_btn")
    MobileElement telephonebtn;    // code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement telephoneScreenConfirmation;  //screen title

    @FindBy(id ="user_input_edit")
    MobileElement telephoneNoConfirm;

    @FindBy (id ="confirm_btn")
    MobileElement raqmtelbtn2;    // code Confirmation Screen تأكيد 2

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 304.17']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 5.70']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 309.87']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement confirmAmountbtn;    // total amount and caf and amount Confirmation btn Screen تأكيد 4

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntry;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement PinConfirmationBtn;

    @FindBy (id = "message")
    public MobileElement Successful_Message;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public void  customerteleEntry (String telNumber)
    {
        System.out.println(ScreenTitle.getText());
        SetTextElement(telephoneNo , telNumber );
        ClickButton(telephonebtn);
    }

    public void  customerteleEntry1 (String  ConfirmationtelNumber)
    {
        System.out.println(telephoneScreenConfirmation.getText());
        SetTextElement(telephoneNoConfirm, ConfirmationtelNumber);
        ClickButton(raqmtelbtn2);
    }

    public  void  customerInfo()
    {
        System.out.println(Amount.getText());
        System.out.println(CAFAmount.getText());
        System.out.println(TotalAmount.getText());
        System.out.println(AmountVALUE.getText());
        System.out.println(CAFvalue.getText());
        System.out.println(totalValue.getText());
        ClickButton(confirmAmountbtn);
    }

    public  void  EnterPIN (String PIN) {
        SetTextElement(PINEntry, PIN);
        ClickButton(PinConfirmationBtn);
    }

    public void  print ()
    {
        System.out.println(Successful_Message.getText());
        ClickButton(Print);
    }
}

