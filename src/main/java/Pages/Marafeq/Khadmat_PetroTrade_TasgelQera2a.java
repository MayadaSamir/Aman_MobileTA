package Pages.Marafeq;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;


public class Khadmat_PetroTrade_TasgelQera2a extends PageBase {
    public Khadmat_PetroTrade_TasgelQera2a(AndroidDriver driver) {
        super(driver);
    }  //Constructor

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='خدمات بترو تريد']")
    MobileElement petroTrade;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='تسجيل قراءة']")
    MobileElement tasgelQera2a; //last insider screen

    @FindBy (id = "title")
    public MobileElement ScreenTitle; //tasgel qera2a

    @FindBy (id = "user_input")
    MobileElement enterRaqm3adad;

    @FindBy(id ="user_input2")
    MobileElement enterQera2a;

    @FindBy (id ="continue_btn")
    MobileElement estmrar;

    @FindBy (id = "title")
    public MobileElement ScreenConfirmationTitle; //tasgel qera2a

    @FindBy (id = "user_input")
    MobileElement enterRaqm3adadConfirmation;

    @FindBy(id ="user_input2")
    MobileElement enterQera2aConfirmation;

    @FindBy (id ="continue_btn")
    MobileElement estmrarConfirm;

    @FindBy(id ="fees_title")
    public MobileElement TitleScreen ; //taklft el khedma

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 0.29']")
    public MobileElement CAFvalue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2;

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

    public  void ClickOnKhadmatPetroTrade ()
    {

        ClickButton(petroTrade);
    }

    public  void  ClickOnTasgelQera2a ()
    {

        ClickButton(tasgelQera2a);
    }

    public void  tasgelQera2aScreen1 (String adad, String qera2a)
    {
        System.out.println(ScreenTitle.getText());
        SetTextElement(enterRaqm3adad, adad );
        SetTextElement(enterQera2a , qera2a );
        ClickButton(estmrar);
    }

    public void  tasgelQera2aScreen2 (String adadConfirm, String qera2aConfirm)
    {
        System.out.println(ScreenConfirmationTitle.getText());
        SetTextElement(enterRaqm3adadConfirmation, adadConfirm );
        SetTextElement(enterQera2aConfirmation, qera2aConfirm );
        ClickButton(estmrarConfirm);
    }

    public  void  flow()
    {
        System.out.println(CAFAmount.getText());
        System.out.println(CAFvalue.getText());
        ClickButton(Confirmation2);

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
