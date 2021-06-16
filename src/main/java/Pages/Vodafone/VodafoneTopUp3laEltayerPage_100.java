package Pages.Vodafone;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class VodafoneTopUp3laEltayerPage_100 extends PageBase {
    public VodafoneTopUp3laEltayerPage_100(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='شحن علي الطاير']")
    MobileElement VF4ahn3laTayer ;

    public  void TabOnSha7n3laELtayer ()
    {
        ClickButton(VF4ahn3laTayer);
    }

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumberVF ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='100']")
    MobileElement Slab100;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement VfTopUpAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='المبلغ الكلى']")
    public MobileElement VfTopUpTotalAmount ;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text= 'EGP 100.0']")
    public MobileElement Amount100 ;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 142.86']")
    public MobileElement TotalAmount142_86;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation3 ;

    @FindBy (id= "user_input_edit")
    public MobileElement EnterMerchantPIN ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    MobileElement Confirmation4 ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'button3') and @text='إلغاء']")
    MobileElement CancelGift ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'message') and @text='عملية ناجحة']")
    public MobileElement SuccessMSG ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='طباعة']")
    MobileElement Print ;

    public void sha7n3laEltayerscreen1 (String Mobile)
    {
        SetTextElement(EnterMobileNumberVF, Mobile);
        ClickButton(Confirmation1);
    }
    public  void  ConfirmationMobileNumberScreen2 (String ConfirmationMob)
    {
        SetTextElement(EnterConfirmationMob, ConfirmationMob);
        ClickButton(Confirmation2);
        ClickButton(Slab100);
        System.out.println(Title.getText());
        System.out.println(VfTopUpAmount.getText() + " = " + Amount100.getText());
        System.out.println(VfTopUpTotalAmount.getText() + " = " + TotalAmount142_86.getText());
    }

    @FindBy (id = "fees_title")
    public MobileElement Title ;

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;

    @FindBy (id = "back_ib")
    public  MobileElement Back ;

    public  void  lastflow ()
    {
        ClickButton(CancleButton);
    }

    public void  SlabsVFscreen(String PIN) {
        ClickButton(Confirmation3);
        SetTextElement(EnterMerchantPIN,PIN);
        ClickButton(Confirmation4);
        ClickButton(CancelGift);
        ClickButton(Print);
    }
}
