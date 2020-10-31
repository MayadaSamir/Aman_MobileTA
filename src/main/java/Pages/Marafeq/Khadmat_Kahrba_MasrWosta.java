package Pages.Marafeq;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Khadmat_Kahrba_MasrWosta extends PageBase {
    public Khadmat_Kahrba_MasrWosta(AndroidDriver driver) {
        super(driver);
    }  //Constructor

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'normal_service_tv') and @text='مرافق عامة']")
    MobileElement Marafeq3amaService;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='خدمات الكهرباء']")   //choose khadmat kahrba screen
            MobileElement khadmatKahrba;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='دفع فاتورة الكهرباء']")
    MobileElement Daf3Fatora; //last insider screen

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='شركة مصر الوسطي لتوزيع الكهرباء']")
    MobileElement daf3MasrWosta; // masr el wosta

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
    MobileElement Confirmation3;    // Code Confirmation Screen تأكيد 3

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 108.5']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 3.99']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 112.49']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4 ;    // Code Confirmation Screen تأكيد 4

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

    ////////////////////////////

    public  void ClickOnMarafeq3amaService ()
    {

        ClickButton(Marafeq3amaService);
    }

    public  void  ClickOnKhadmatKahrba ()
    {

        ClickButton(khadmatKahrba);
    }

    public void  ClickOnDaf3Kahrba() {

        ClickButton(Daf3Fatora);
    }

    public  void  ClickOnMasrWosta ()
    {

        ClickButton(daf3MasrWosta);
    }

    public void  MasrWostaUPScreen1 (String CodeNumber)
    {
        System.out.println(ScreenCodeTitle.getText());
        SetTextElement(EnterCodeNumber , CodeNumber );
        ClickButton(Confirmation1);
    }

    public void  MasrWostaScreen2 (String  ConfirmationCodeNumber)
    {
        System.out.println(ScreenConfirmationCodeTitle.getText());
        SetTextElement(EnterConfirmationCode , ConfirmationCodeNumber);
        ClickButton(Confirmation2);
    }

    public  void  ElectriciryFlow1  () {

        System.out.println(TitleScreen.getText());
        System.out.println(CustomerData.getText());
        ClickButton(Confirmation3);
    }
    public  void  Electricityflow2()
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

