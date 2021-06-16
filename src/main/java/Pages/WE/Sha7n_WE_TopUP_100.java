package Pages.WE;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;


public class Sha7n_WE_TopUP_100 extends PageBase {

    public Sha7n_WE_TopUP_100(AndroidDriver driver) { super(driver);}

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView")
    MobileElement WETopUp;

    @FindBy (id = "popup_name")
    public MobileElement ScreenMobileTitle;

    @FindBy (id = "user_input_edit")
    MobileElement EnterMobileNumber;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;    // Mobile Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement ScreenConfirmationMobileTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2;    // Mobile Confirmation Screen تأكيد 2

    @FindBy (xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='5-300']")
    MobileElement Slab100;

    @FindBy (id = "popup_name")
    public MobileElement AmountEntryScreenTitle;

    @FindBy (id = "user_input_edit")
    MobileElement EnterAmount;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;  // Confirm Amount button

    @FindBy(id= "amount_label")
    public MobileElement WETopUpAmount;

    @FindBy (id = "fees_label")
    public MobileElement WETopUpTotalAmount;

    @FindBy(id = "amount_value")
    public MobileElement Amount100_0;

    @FindBy(id = "fees_value")
    public MobileElement TotalAmount100;

    @FindBy(id ="confirm_btn")
    public MobileElement Confirmation4; // Total amount confirmation screen

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation5 ;   // Confirm Merchant Pin

    @FindBy (id = "message")
    public MobileElement Successful_Message;   //Successful transaction

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public  void ClickOnWETopUPService ()
    {
        ClickButton(WETopUp);
    }

    public void  WETopUPScreen1 (String MobileNumber)
    {
        System.out.println(ScreenMobileTitle.getText());
        SetTextElement(EnterMobileNumber , MobileNumber );
        ClickButton(Confirmation1);
    }

    public void  WETopUpScreen2 (String  ConfirmationMobileNumber)
    {
        System.out.println(ScreenConfirmationMobileTitle.getText());
        SetTextElement(EnterConfirmationMob , ConfirmationMobileNumber);
        ClickButton(Confirmation2);
    }

    public  void  WE_EnterSlab100 ()
    {
        ClickButton(Slab100);
    }

    public void  WETopUpScreen3 (String  EnterAmount100)
    {
        System.out.println(AmountEntryScreenTitle.getText());
        SetTextElement(EnterAmount , EnterAmount100);
        ClickButton(Confirmation3);
    }

    public void WEFlow (String PIN )
    {
        System.out.println(WETopUpAmount.getText());
        System.out.println(WETopUpTotalAmount.getText());
        System.out.println(Amount100_0.getText());
        System.out.println(TotalAmount100.getText());
        ClickButton(Confirmation4);
        System.out.println(PINEntryScreenTitle.getText());
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation5);
        System.out.println(Successful_Message.getText());
    }

    public  void  Print()
    {
        ClickButton(Print);
    }
}

