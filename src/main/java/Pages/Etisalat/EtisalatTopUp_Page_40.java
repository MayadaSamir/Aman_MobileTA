package Pages.Etisalat;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class EtisalatTopUp_Page_40 extends PageBase {
    public EtisalatTopUp_Page_40(AndroidDriver driver) {
        super(driver);
    }

    @FindBy (id = "cancel_btn")
    public MobileElement Cancel ;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView")
    MobileElement EtisalatTopup ;

    @FindBy (id = "popup_name")
    public MobileElement ScreenMobileTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement EnterMobileNumber ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy (id = "popup_name")
    public MobileElement ScreenconfirmationMobileTitle ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='40']")
    MobileElement Slab40;

    @FindBy(id= "amount_label")
    public MobileElement EtisalatTopUpAmount ;

    @FindBy (id = "fees_label")
    public MobileElement EtisalatTopUpTotalAmount ;

    @FindBy(id = "amount_value")
    public MobileElement Amount40;

    @FindBy(id = "fees_value")
    public MobileElement TotalAmount57_14 ;

    @FindBy(id ="confirm_btn")
    public MobileElement Confirmation3 ;

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation4 ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    public  void ClickOnEtisalatTopUPService ()
    {
        ClickButton(EtisalatTopup);
    }

    public void  EtisalatTopUPScreen1 ( String  MobileNumber)
    {
        System.out.println(ScreenMobileTitle.getText());
        SetTextElement(EnterMobileNumber , MobileNumber );
        ClickButton(Confirmation1);
    }

    public void  EtisalatTopUpScreen2 ( String  ConfirmationMobileNumber)
    {
        System.out.println(ScreenconfirmationMobileTitle.getText());
        SetTextElement(EnterConfirmationMob , ConfirmationMobileNumber);
        ClickButton(Confirmation2);
    }

    public  void  Etisalat_SelectSlab40 ()
    {
        ClickButton(Slab40);
    }

    public void EtislatFlow (String PIN ) {

        System.out.println(EtisalatTopUpAmount.getText());
        System.out.println(EtisalatTopUpTotalAmount.getText());
        System.out.println(Amount40.getText());
        System.out.println(TotalAmount57_14.getText());
        ClickButton(Confirmation3);
        System.out.println(PINEntryScreenTitle.getText());
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation4);
        System.out.println(Successfull_Message.getText());

    }
    public  void  Print()
    {
        ClickButton(Print);
    }

    @FindBy (id = "cancel_btn")
    public MobileElement CancleButton ;

    public  void  lastflow ()
    {
        ClickButton(CancleButton);
    }
}
