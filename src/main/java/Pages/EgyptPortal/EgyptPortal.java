package Pages.EgyptPortal;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class EgyptPortal extends PageBase {
    public EgyptPortal(AndroidDriver driver) {
        super(driver);
    }

        @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='خدمات مصر الرقمية']")
        public MobileElement egyPort;

        @FindBy (id = "popup_name")
        public MobileElement code;

        @FindBy (id = "user_input_edit")
        MobileElement EnterCode;

        @FindBy(id ="confirm_btn")
        MobileElement Confirmation1;

        @FindBy (id = "popup_name")
        public MobileElement codeConfirmationTitle;

        @FindBy(id ="user_input_edit")
        MobileElement EnterCodeConfirmation;

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

        @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 10.0']")
        public MobileElement AmountVALUE ;

        @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 6.27']")
        public MobileElement CAFvalue ;

        @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 16.27']")
        public MobileElement totalValue ;

        @FindBy (id ="confirm_btn")
        MobileElement Confirmation4;

        @FindBy (id = "user_input_edit")
        MobileElement PINEntryScreen ;

        @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
        public MobileElement Confirmation5 ;

        @FindBy (id = "message")
        public MobileElement Successfull_Message ;

        @FindBy(id ="confirm_btn")
        MobileElement Print;

        public  void ClickOnEgyptPortal()
        { ClickButton(egyPort); }


        public void  raqmElCode (String codeNo)
        {
            System.out.println(code.getText());
            SetTextElement(EnterCode , codeNo );
            ClickButton(Confirmation1);
        }

        public void  raqmElCode1(String ConfirmationCodeNumber)
        {
            System.out.println(codeConfirmationTitle.getText());
            SetTextElement(EnterCodeConfirmation , ConfirmationCodeNumber);
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

