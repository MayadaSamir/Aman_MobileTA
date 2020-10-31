package Pages.TamwelMotnahyElseghr;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Mobadra_daf3_qema_mokhtlfa extends PageBase {

    public Mobadra_daf3_qema_mokhtlfa(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='مبادرة']")
    public MobileElement mobadra;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='دفع أقساط التمويل']")
    public MobileElement daf3tamwel;

    @FindBy (id = "popup_name")
    public MobileElement IdNo; //beta2a

    @FindBy (id = "user_input_edit")
    MobileElement EnterNumber;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;

    @FindBy (id = "popup_name")
    public MobileElement IdConfirmationTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterNumberConfirmation;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2;

    @FindBy(id ="fees_title")
    public MobileElement TitleScreen ;

    @FindBy (id = "info")
    public  MobileElement CustomerData ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع قيمة مختلفة']")
    public MobileElement qemaMokhtlfa;

    @FindBy (id = "title")
    MobileElement Title ;

    @FindBy (id = "popup_name")
    public MobileElement screenAmountTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterMoney;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 36.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 5.70']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 41.7']")
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

    public  void ClickOnMobadra()
    { ClickButton(mobadra); }

    public  void  ClickOnDaf3 ()
    { ClickButton(daf3tamwel); }

    public void  raqmElID (String idNumber)
    {
        System.out.println(IdNo.getText());
        SetTextElement(EnterNumber , idNumber );
        ClickButton(Confirmation1);
    }

    public void  raqmElID1 (String ConfirmationMobNumber)
    {
        System.out.println(IdConfirmationTitle.getText());
        SetTextElement(EnterNumberConfirmation , ConfirmationMobNumber);
        ClickButton(Confirmation2);
    }

    public  void  CustomerData  () {
        System.out.println(TitleScreen.getText());
        System.out.println(CustomerData.getText());
        ClickButton(Confirmation3);
    }

    public  void ClickOndaf3qemaMokthlfa ()
    { ClickButton(qemaMokhtlfa); }

    public void  amountEntry (String money)
    {
        System.out.println(screenAmountTitle.getText());
        SetTextElement(EnterMoney , money );
        ClickButton(Confirmation4);
    }

    public  void  flow()
    {
        System.out.println(Amount.getText());
        System.out.println(CAFAmount.getText());
        System.out.println(TotalAmount.getText());
        System.out.println(totalValue.getText());
        System.out.println(CAFvalue.getText());
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

