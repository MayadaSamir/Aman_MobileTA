package Pages.Offers_and_Gifts;
import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Vf_Prizes_orod_365_3la_elTayer_Page  extends PageBase {

    public Vf_Prizes_orod_365_3la_elTayer_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='جوائز فودافون']")
    MobileElement VodaFonePrizes;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='عروض 365 على الطاير']")
    MobileElement Orod3653laEltayer;

    public  void  ClickOnService ()
    {
        ClickButton(VodaFonePrizes);
        ClickButton(Orod3653laEltayer);
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

    @FindBy (id = "amount_text_view_card")
    MobileElement offer ;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/android.widget.TextView")
    public  MobileElement Details_offer ;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")
    MobileElement Eshtrak_Button ;

    @FindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/android.widget.TextView")
    public   MobileElement confirmation_For_Eshtrak ;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button")
    MobileElement Rgo3_Button ;

    public  void  FlowScreen1 ( String RefNum1 )
    {
        System.out.println(title_of_entry_code_screen.getText());
        SetTextElement(code, RefNum1);
        ClickButton(confirmation1);
    }

    public  void  FlowScreen2 (String RefConfirmationNum)
    {
        System.out.println(title_of_entry_codeConfirmation_screen.getText());
        SetTextElement(code_confirmation , RefConfirmationNum );
        ClickButton(confirmation2);
    }

    public  void  flow ()
    {
        ClickButton(offer);
    }

    public  void  flow2 ()
    {
        System.out.println(Details_offer.getText());
        ClickButton(Eshtrak_Button);
        System.out.println(confirmation_For_Eshtrak.getText());
    }

    public  void  flow3 ()
    {
        ClickButton(Rgo3_Button);
    }
}
