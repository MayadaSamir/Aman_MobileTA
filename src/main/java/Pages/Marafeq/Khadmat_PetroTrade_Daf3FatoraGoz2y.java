package Pages.Marafeq;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Khadmat_PetroTrade_Daf3FatoraGoz2y extends PageBase {

    public Khadmat_PetroTrade_Daf3FatoraGoz2y(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='خدمات بترو تريد']")   //choose khadmat kahrba screen
    public MobileElement khadmatPetroTrade;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='دفع فاتورة بتروتريد']")
    public MobileElement Daf3Fatora; //last insider screen

    @FindBy (id = "popup_name")
    public MobileElement ScreenCodeTitle; //code el daf3

    @FindBy (id = "user_input_edit")
    MobileElement EnterCodeNumber;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;    // Code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement ScreenConfirmationCodeTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationCode;  // t2ked code el daf3

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2;    // Code Confirmation Screen تأكيد 2

    @FindBy(id ="fees_title")
    public MobileElement TitleScreen ;

    @FindBy (id = "info")
    public  MobileElement CustomerData ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;    // Code Confirmation Screen  تأكيد 3

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع جزء من الفواتير']")
    public MobileElement daf3Goz2; // daf3 egmaly el fawater - option 2

    @FindBy (id = "popup_name")
    MobileElement PatialPayScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement EnterAmount;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4;  // Confirm Amount button

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 14.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 1.71']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 15.71']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation5 ;    // Code Confirmation Screen تأكيد 4

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation6 ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    public  void ClickOnPetroTrade ()
    {
        ClickButton(khadmatPetroTrade);
    }

    public  void  ClickOnKhadmatKahrba ()
    {
        ClickButton(Daf3Fatora);
    }

    public void  el3adadEntry1 (String CodeNumber)
    {
        System.out.println(ScreenCodeTitle.getText());
        SetTextElement(EnterCodeNumber , CodeNumber );
        ClickButton(Confirmation1);
    }

    public void el3adadEntry2 (String  ConfirmationCodeNumber)
    {
        System.out.println(ScreenConfirmationCodeTitle.getText());
        SetTextElement(EnterConfirmationCode , ConfirmationCodeNumber);
        ClickButton(Confirmation2);
    }

    public  void  CustomerData  ()
    {
        System.out.println(TitleScreen.getText());
        System.out.println(CustomerData.getText());
        ClickButton(Confirmation3);
    }

    public  void  ClickOnDaf3Goz2 ()
    {
        ClickButton(daf3Goz2);
    }

    public void  enterAmount (String  qema)
    {
        System.out.println(PatialPayScreenTitle.getText());
        SetTextElement(EnterAmount , qema);
        ClickButton(Confirmation4);
    }

    public  void  flow2()
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

