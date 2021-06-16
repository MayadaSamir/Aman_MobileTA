package Pages.Offers_and_Gifts;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Mechline_Page extends PageBase {
    public Mechline_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='ميشلان']")
    MobileElement Mechiline;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='استبدال كود ميشلان']")
    MobileElement Mechiline_Estbdal_Code;

    public  void  ClickOnMechilineService ()
    {
        ClickButton(Mechiline);
        ClickButton(Mechiline_Estbdal_Code);
    }

    @FindBy(id = "popup_name")
    public MobileElement title_of_entry_code_screen;

    @FindBy(id = "user_input_edit")
    MobileElement code;

    @FindBy(id = "confirm_btn")
    MobileElement confirmation1;

    @FindBy(id = "user_input_edit")
    MobileElement code_confirmation;

    @FindBy(id = "popup_name")
    public MobileElement title_of_entry_codeConfirmation_screen;

    @FindBy(id = "confirm_btn")
    MobileElement confirmation2;

    @FindBy(id = "fees_title")
    public MobileElement Micheline_estbdal_code_title;

    @FindBy(id= "amount_label")
    public MobileElement AmountParameter ;

    @FindBy(id = "amount_value")
    public MobileElement AmountValue ;

    @FindBy (id = "fees_label")
    public MobileElement Message_For_Merchant ;

    @FindBy (id = "confirm_btn")
    MobileElement confirmation3;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation4 ;

    public  void  FlowScreen1 ( String RefNum1 ) {

        System.out.println(title_of_entry_code_screen.getText());
        SetTextElement(code, RefNum1);
        //ClickButton(confirmation1);
        confirmation1.click();
    }

    public  void  FlowScreen2 (String RefConfirmationNum)
    {
        System.out.println(title_of_entry_codeConfirmation_screen.getText());

        SetTextElement(code_confirmation , RefConfirmationNum );
        code_confirmation.sendKeys(RefConfirmationNum);
        ClickButton(confirmation2);
    }

    public  void  flow (String  PIN)
    {
        System.out.println(AmountParameter.getText() + " = " + AmountValue.getText());
        System.out.println(Message_For_Merchant.getText());
        ClickButton(confirmation3);
        SetTextElement(PINEntryScreen , PIN);
        ClickButton(Confirmation4);
    }
}