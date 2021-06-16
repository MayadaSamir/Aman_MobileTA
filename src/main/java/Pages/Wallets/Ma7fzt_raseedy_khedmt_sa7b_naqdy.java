package Pages.Wallets;
import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Ma7fzt_raseedy_khedmt_sa7b_naqdy extends PageBase {
    public Ma7fzt_raseedy_khedmt_sa7b_naqdy(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='محفظة رصيدى']")
    public MobileElement ma7fztorangeCash; //inside screen

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='خدمة سحب نقدي']")
    public MobileElement khedmtsa7b; //inside screen

    @FindBy (id = "popup_name")
    public MobileElement ScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    MobileElement telephoneNo;

    @FindBy(id ="confirm_btn")
    MobileElement telephonebtn;    // code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement telephoneScreenConfirmation;

    @FindBy(id ="user_input_edit")
    MobileElement telephoneNoConfirm;

    @FindBy (id ="confirm_btn")
    MobileElement raqmtelbtn2;    // code Confirmation Screen تأكيد 2

    @FindBy (id = "popup_name")
    public MobileElement amountScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    public MobileElement enterAmount;

    @FindBy(id ="confirm_btn")
    public MobileElement amountbtn;    // amount Confirmation Screen تأكيد 1

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 12.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 0.0']")
    public MobileElement CAFvalue ;

    @FindBy (id ="confirm_btn")
    MobileElement confirmAmountbtn;    // total amount and caf and amount Confirmation btn Screen تأكيد 4

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntry;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement PinConfirmationBtn;

    @FindBy(id ="fees_title")
    public MobileElement feesTitle ;  //title of last customer data //otlob mn 3amelak

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='المبلغ الكلى']")
    public MobileElement Totalamountt;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='12.0']")
    public MobileElement amountVal ;

    @FindBy (id ="confirm_btn")
    MobileElement talbt2keedbtn;    // talb ta2ked amount Confirmation btn Screen تأكيد 4

    @FindBy (id = "message")
    public MobileElement Successful_Message;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public void  ClickOnma7fztOrangeCash()
    {
        ClickButton(ma7fztorangeCash);
    }

    public  void  ClickOnSa7b()
    {
        ClickButton(khedmtsa7b);
    }

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

    public void  customerAmountEntry(String amountEntry)
    {
        System.out.println(amountScreenTitle.getText());
        SetTextElement(enterAmount , amountEntry );
        ClickButton(amountbtn);
    }

    public  void  customerInfo()
    {
        System.out.println(Amount.getText());
        System.out.println(CAFAmount.getText());
        System.out.println(AmountVALUE.getText());
        System.out.println(CAFvalue.getText());
        ClickButton(confirmAmountbtn);
    }

    public  void  EnterPIN (String PIN) {
        SetTextElement(PINEntry, PIN);
        ClickButton(PinConfirmationBtn);
    }

    public  void  customerInfo2()
    {
        System.out.println(feesTitle.getText());
        System.out.println(Totalamountt.getText());
        System.out.println(amountVal.getText());
        ClickButton(talbt2keedbtn);
    }

    public void  print ()
    {
        System.out.println(Successful_Message.getText());
        ClickButton(Print);
    }
}


