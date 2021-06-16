package Pages.Others;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class WeAcceptCashin_Page extends PageBase {
    public WeAcceptCashin_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'service_name') and @text='مدفوعات متنوعه - أكسبت']")
    MobileElement We_Accept;

    @FindBy (xpath ="//android.widget.TextView[contains(@resource-id,'service_name') and @text='دفع']")
    MobileElement  We_Accept_Cash_In ;

    @FindBy (id = "user_input_edit")
    MobileElement RefNumber_1 ;

    @FindBy (id = "confirm_btn")
    MobileElement confirmation;

    @FindBy (id = "user_input_edit")
    MobileElement RefNumber_confirmation;

    @FindBy (id = "info")
    public MobileElement Info;

    @FindBy (xpath ="//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع الفاتورة كاملة']")
    public  MobileElement  Full_Payment;

    @FindBy (xpath ="//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع قيمة مختلفة']")
    public MobileElement  Parial_Payment;

    @FindBy ( id = "fees_title")
    public MobileElement Fee_Title;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement AmountLable;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFLable ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmountLable ;

    @FindBy (id = "amount_value")
    public MobileElement AmountValueE ;

    @FindBy (id = "fees_value")
    public MobileElement CAFValue ;

    @FindBy (id = "total_amount_value")
    public MobileElement TotalamountValue ;

    @FindBy (id = "user_input_edit")
    public MobileElement PINEntryScreen ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    @FindBy (id = "popup_name")
     public  MobileElement  FeeEnterTitle ;

    @FindBy (id = "user_input_edit")
     MobileElement UserInput ;

    public void Click_On_Service ()
    {
       ClickButton(We_Accept);
       ClickButton(We_Accept_Cash_In);
    }

    public void Flow_Screen1 (String RefNumber)
    {
        SetTextElement(RefNumber_1 , RefNumber );
        ClickButton(confirmation);
    }

    public void  Flow_Screen2 (String  ConRefNumber)
    {
        SetTextElement(RefNumber_confirmation, ConRefNumber);
        ClickButton(confirmation);
    }

    public  void  Confirmation ()
    {
        ClickButton(confirmation);
    }

    public  void full_payment ()
    {
        ClickButton(Full_Payment);
    }

    public  void  Partial_Payment()
    {
        ClickButton(Parial_Payment);
    }

    public  void  EnterUserInput (String  Input)
    {
        SetTextElement(UserInput,Input );
    }

    public  void  EnterPIN (String PIN)
    {
        SetTextElement(PINEntryScreen , PIN );
        ClickButton(confirmation);
    }

    public  void  printing ()
    {
        ClickButton(Print);
    }
}
