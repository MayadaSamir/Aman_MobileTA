package Pages.NaqlweSeya7a;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class BlueBus extends PageBase {
    public BlueBus(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='بلوباص']")
    public MobileElement goBus; //inside screen

    @FindBy (id = "popup_name")
    public MobileElement ScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    MobileElement raqmDaf3;

    @FindBy(id ="confirm_btn")
    MobileElement raqmDaf3btn;    // code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement raqmDaf3Confirmation;  //screen title

    @FindBy(id ="user_input_edit")
    MobileElement getraqmDaf3Confirmation;

    @FindBy (id ="confirm_btn")
    MobileElement raqmDaf3btn2;    // code Confirmation Screen تأكيد 2

    @FindBy(id ="fees_title")
    public MobileElement goBustitle ;  //title of student data

    @FindBy (id = "info")
    public  MobileElement customer ;  //student info

    @FindBy (id ="confirm_btn")
    MobileElement customerinfobtnconfirm;    // button Confirmation Screen تأكيد 3 for student data

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 100.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 4.00']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 104.0']")
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

    public void  ClickOnGoBus()
    {

        ClickButton(goBus);
    }

    public void  raqmDaf3Entry (String raqm)
    {
        System.out.println(ScreenTitle.getText());
        SetTextElement(raqmDaf3 , raqm );
        ClickButton(raqmDaf3btn);
    }

    public void  raqmDaf3Entry1 (String  raqmConfirmation)
    {
        System.out.println(raqmDaf3Confirmation.getText());
        SetTextElement(getraqmDaf3Confirmation,  raqmConfirmation);
        ClickButton(raqmDaf3btn2);
    }

    public  void  customerInfo  () {

        System.out.println(goBustitle.getText());
        System.out.println(customer.getText());
        ClickButton(customerinfobtnconfirm);
    }

    public  void  customerInfo2()
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
