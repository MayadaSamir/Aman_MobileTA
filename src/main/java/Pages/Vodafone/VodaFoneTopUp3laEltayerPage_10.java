package Pages.Vodafone;
import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class VodaFoneTopUp3laEltayerPage_10 extends PageBase {

    public VodaFoneTopUp3laEltayerPage_10(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='شحن علي الطاير']")
   public MobileElement VF4ahn3laTayer ;

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumberVF ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='10']")
    MobileElement Slab10 ;

    @FindBy(id= "amount_label")
    public MobileElement VfTopUpAmount ;

    @FindBy (id = "fees_label")
   public MobileElement VfTopUpTotalAmount ;

    @FindBy(id = "amount_value")
    public MobileElement Amount10 ;

    @FindBy(id = "fees_value")
    public MobileElement TotalAmount14_29 ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation3 ;

    @FindBy (id= "user_input_edit")
    public MobileElement EnterMerchantPIN ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    MobileElement Confirmation4 ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'button3') and @text='إلغاء']")
    MobileElement CancelGift ;

    @FindBy (id = "message")
    public MobileElement SuccessMSG ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='طباعة']")
    MobileElement Print ;

    public void sha7n3laEltayerscreen1 (String Mobile) {
        SetTextElement(EnterMobileNumberVF, Mobile);
        ClickButton(Confirmation1);
    }

    @FindBy (id = "fees_title")
    public MobileElement Title ;

    public  void  ConfirmationMobileNumberScreen2 (String ConfirmationMob)
    {
        SetTextElement(EnterConfirmationMob, ConfirmationMob);
        ClickButton(Confirmation2);
        ClickButton(Slab10);
        System.out.println(Title.getText());
        System.out.println(VfTopUpAmount.getText() + " = " + Amount10.getText());
        System.out.println(VfTopUpTotalAmount.getText() + " = " + TotalAmount14_29.getText());
    }

    public void  SlabsVFscreen(String PIN) {
        ClickButton(Confirmation3);
        SetTextElement(EnterMerchantPIN,PIN);
        ClickButton(Confirmation4);
        ClickButton(CancelGift);
        //ClickButton(Print);
    }

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;

    @FindBy (id = "back_ib")
    public  MobileElement Back ;

    public  void  lastflow ()
    {
        ClickButton(CancleButton);
    }
}
