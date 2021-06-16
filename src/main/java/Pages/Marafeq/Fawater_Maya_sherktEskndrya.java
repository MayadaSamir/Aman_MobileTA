package Pages.Marafeq;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Fawater_Maya_sherktEskndrya extends PageBase {
    public Fawater_Maya_sherktEskndrya(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='فواتير المياه']")
    public MobileElement fawaterMaya;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='شركه مياه الاسكندريه']")
    public MobileElement maytAlex;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='شركه مياه الاسكندريه']")
    public MobileElement sherktMayaAlex;

    @FindBy (id = "popup_name")
    public MobileElement ScreenCodeTitle; //code el daf3

    @FindBy (id = "user_input_edit")
    MobileElement EnterCodeNumber;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;

    @FindBy (id = "popup_name")
    public MobileElement ScreenConfirmationCodeTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationCode;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2;

    @FindBy(id ="fees_title")
    public MobileElement TitleScreen ;

    @FindBy (id = "info")
    public  MobileElement CustomerData ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 108.5']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 4.56']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 113.06']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4 ;

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation5 ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    public  void ClickOnFawaterMaya()
    {
        ClickButton(fawaterMaya);
    }

    public  void  ClickOnMaytEskndrya()
    {
        ClickButton(maytAlex);
    }

    public  void  ClickOnSherktMaytEskndrya()
    {
        ClickButton(sherktMayaAlex);
    }

    public void  CodeEntry (String CodeNumber)
    {
        System.out.println(ScreenCodeTitle.getText());
        SetTextElement(EnterCodeNumber , CodeNumber );
        ClickButton(Confirmation1);
    }

    public void  CodeEntry1 (String ConfirmationCodeNumber)
    {
        System.out.println(ScreenConfirmationCodeTitle.getText());
        SetTextElement(EnterConfirmationCode , ConfirmationCodeNumber);
        ClickButton(Confirmation2);
    }

    public  void  CustomerData  () {
        System.out.println(TitleScreen.getText());
        System.out.println(CustomerData.getText());
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

