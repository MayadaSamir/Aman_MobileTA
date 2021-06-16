package Pages.Al3ab_we_tarfeh;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class One_card_kart_facebook_10 extends PageBase {

    public One_card_kart_facebook_10(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='ون كارد']")
    public MobileElement oneCard;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='كارت فيس بوك 10 دولار']")
    public MobileElement kartFB; //slab

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'product_name_label') and @text='إسم المنتج:']")
    public MobileElement esm;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'product_name_value') and @text='كارت فيس بوك 10 دولار']")
    public MobileElement esmVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 157.53']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 157.53']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation4 ;

    @FindBy (id = "message")
    public MobileElement Successful_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public  void ClickOnOneCard()
    { ClickButton(oneCard); }

    public  void ClickOnFacebook10()
    { ClickButton(kartFB); }

    public  void  flow()
    {
        System.out.println(esm.getText());
        System.out.println(Amount.getText());
        System.out.println(TotalAmount.getText());
        System.out.println(esmVALUE.getText());
        System.out.println(totalValue.getText());
        System.out.println(AmountVALUE.getText());
        ClickButton(Confirmation3);
    }

    public  void  EnterPIN ( String PIN) {
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation4);
    }

    public void  print ()
    {
        ClickButton(Print);
    }

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancelButton;

    @FindBy ( id = "back_ib")
    public  MobileElement BackButton;

    public  void  BackToMainMenu ()
    {
        ClickButton(CancelButton);
        ClickButton(BackButton);
        ClickButton(BackButton);
    }
}

