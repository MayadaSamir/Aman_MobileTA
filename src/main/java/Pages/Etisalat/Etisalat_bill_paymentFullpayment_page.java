package Pages.Etisalat;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Etisalat_bill_paymentFullpayment_page extends PageBase {
    public Etisalat_bill_paymentFullpayment_page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(id = "cancel_btn")
    public MobileElement Cancel ;

    @FindBy (id = "user_input_edit")
    MobileElement EnterCode;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation;

    @FindBy(id ="user_input_edit")
    MobileElement EnterCodeConfirmation;

    @FindBy (id = "title")
    public MobileElement Title ;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع القيمة كاملة']")
    public MobileElement Fullpayment;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 80.0']")
    public MobileElement AmountVALUE ;

    @FindBy (id = "fees_label")
    public MobileElement TotalAmount ;

    @FindBy(id = "fees_value")
    public MobileElement Totalvalue;

    @FindBy (id = "fees_label")
    public  MobileElement CAF_lable ;

    @FindBy ( id = "fees_value")
    public  MobileElement Caf_Value ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public void Flow_Screen1 (String RefNumber)
    {
        SetTextElement(EnterCode , RefNumber );
        ClickButton(Confirmation);
    }

    public void  Flow_Screen2 (String  ConRefNumber)
    {
        SetTextElement(EnterCodeConfirmation , ConRefNumber);
        ClickButton(Confirmation);
        System.out.println(Title.getText());
        System.out.println(Fullpayment.getText());
    }

    public void  fullpayment ()
    {
        ClickButton(Fullpayment);
        System.out.println(Amount.getText() + " =  " + AmountVALUE.getText());
        System.out.println(CAF_lable.getText() + "= " + Caf_Value.getText());
        System.out.println(TotalAmount.getText() + " = " + Totalvalue.getText());
    }

    public  void  flow (String pin)
    {
        ClickButton(Confirmation);
        SetTextElement(PINEntryScreen , pin);
        ClickButton(Confirmation);
        System.out.println(Successfull_Message.getText());
    }

    public void Print ()
    {
        ClickButton(Print);
    }

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;
    public  void  lastflow ()
    {
        ClickButton(CancleButton);
    }
}
