package Pages.Offers_and_Gifts;
import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class OrodKolYoumOrange_page extends PageBase {
    public OrodKolYoumOrange_page(AndroidDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='عروض كل يوم - أورنج']")
    public MobileElement Orod_Kol_Youm_Orange_Service;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='إستبدال كود أورنج']")
    public MobileElement estbdal_code_orange_Service;

    public void ClickOnOrodKolYoumOrangeService() {
        ClickButton(Orod_Kol_Youm_Orange_Service);
        ClickButton(estbdal_code_orange_Service);
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
    public MobileElement estbdal_code_title;

    @FindBy(id = "amount_label")
    public MobileElement AmountParameter;

    @FindBy(id = "amount_value")
    public MobileElement AmountValue;

    @FindBy(id = "confirm_btn")
    MobileElement confirmation3;

    @FindBy(id = "popup_name")
    public MobileElement title_of_entry_code_screen2;

    @FindBy(id = "user_input_edit")
    MobileElement code2;

    @FindBy(id = "confirm_btn")
    MobileElement confirmation4;

    @FindBy(id = "user_input_edit")
    MobileElement code_confirmation3;

    @FindBy(id = "popup_name")
    public MobileElement title_of_entry_codeConfirmation_screen2;

    @FindBy(id = "confirm_btn")
    MobileElement confirmation5;

    @FindBy(id = "user_input_edit")
    MobileElement PINEntryScreen;

    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation6;

    public void FlowScreen1(String RefNum1) {

        System.out.println(title_of_entry_code_screen.getText());
        SetTextElement(code, RefNum1);
        ClickButton(confirmation1);
    }

    public void FlowScreen2(String RefConfirmationNum) {
        System.out.println(title_of_entry_codeConfirmation_screen.getText());
        SetTextElement(code_confirmation, RefConfirmationNum);
        ClickButton(confirmation2);
    }

    public void Flow1() {
        System.out.println(estbdal_code_title.getText());
        System.out.println(AmountParameter.getText());
        System.out.println(AmountValue.getText());
        ClickButton(confirmation3);
    }

    public void Flow2(String code) {
        System.out.println(title_of_entry_code_screen2.getText());
        SetTextElement(code2, code);
        ClickButton(confirmation4);
    }

    public void Flow3( String Codeconfirmation)
    {
        System.out.println(title_of_entry_codeConfirmation_screen2.getText());
        SetTextElement(code_confirmation3 ,  Codeconfirmation);
        ClickButton(confirmation5);
    }

    public  void  EnterPIN ( String PIN)
    {
        SetTextElement(PINEntryScreen , PIN);
        ClickButton(Confirmation6);
    }
}
