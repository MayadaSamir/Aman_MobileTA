package Pages.Gam3at_7okmya;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Gam3t_portsaid extends PageBase {
    public Gam3t_portsaid(AndroidDriver driver) { super(driver); }  //Constructor

    // @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'normal_service_tv') and @text='الجامعات الحكومية']")   //choose gam3at 7okmya screen
    //public MobileElement gam3at7okmya;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='الجامعات الحكومية']")
    public MobileElement gam3at7okmyaScreen; //inside screen

    // @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='جامعة بورسعيد']")
    //public MobileElement gam3tportsaid; //  3en shams uni slab

    @FindBy (id = "popup_name")
    public MobileElement ScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    MobileElement raqmGloos;

    @FindBy(id ="confirm_btn")
    MobileElement raqmGlosbtn;    // code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement Gam3at7okmyaScreenConfirmation;

    @FindBy(id ="user_input_edit")
    MobileElement getRaqmGloosConfirmation;

    @FindBy (id ="confirm_btn")
    MobileElement raqmGlosbtn2;    // code Confirmation Screen تأكيد 2

    @FindBy(id ="fees_title")
    public MobileElement gam3atitle ;  //title of student data

    @FindBy (id = "info")
    public  MobileElement student ;  //student info

    @FindBy (id ="confirm_btn")
    MobileElement studentinfobtnconfirm;    // button Confirmation Screen تأكيد 3 for student data

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 300.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 5.70']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 305.7']")
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
    /////////////////////////////////////////////////////

   /* public  void  ClickOnGam3at7okmya ()
    {
        ClickButton(gam3at7okmya);
    }*/

    public void  ClickOnGam3at7okmya1()
    {

        ClickButton(gam3at7okmyaScreen);
    }

    /*public  void  ClickOnGam3tPortSaid ()
    {

        ClickButton(gam3tPortsaid);
    }*/

    public void  studentCodeEntry (String CodeNumber)
    {
        System.out.println(ScreenTitle.getText());
        SetTextElement(raqmGloos , CodeNumber );
        ClickButton(raqmGlosbtn);
    }

    public void  studentCodeEntry1 (String  ConfirmationCodeNumber)
    {
        System.out.println(Gam3at7okmyaScreenConfirmation.getText());
        SetTextElement(getRaqmGloosConfirmation, ConfirmationCodeNumber);
        ClickButton(raqmGlosbtn2);
    }

    public  void  studentInfo  () {

        System.out.println(gam3atitle.getText());
        System.out.println(student.getText());
        ClickButton(studentinfobtnconfirm);
    }

    public  void  studentInfo2()
    {
        System.out.println(Amount.getText());
        System.out.println(CAFAmount.getText());
        System.out.println(TotalAmount.getText());
        System.out.println(totalValue.getText());
        System.out.println(CAFvalue.getText());
        System.out.println(AmountVALUE.getText());
        ClickButton(confirmAmountbtn);
    }

    public  void  EnterPIN ( String PIN) {
        SetTextElement(PINEntry, PIN);
        ClickButton(PinConfirmationBtn);
    }

    public void  print ()
    {
        ClickButton(Print);
    }
}
