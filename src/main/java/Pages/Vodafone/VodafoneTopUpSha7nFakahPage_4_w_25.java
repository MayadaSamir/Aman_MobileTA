package Pages.Vodafone;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class VodafoneTopUpSha7nFakahPage_4_w_25 extends PageBase {
    public VodafoneTopUpSha7nFakahPage_4_w_25(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='شحن فودافون فكه']")
    MobileElement VFTopUpFakah  ;

    public  void VFSha7nTopUpFakahService ()
    {
        ClickButton(VFTopUpFakah);
    }

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumberVF ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='4.25']")
    MobileElement Slab4_w_25 ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement VfTopUpAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='المبلغ الكلى']")
    public MobileElement VfTopUpTotalAmount ;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text= 'EGP 4.25']")
    public MobileElement Amount4_w_25;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 4.25']")
    public MobileElement TotalAmount4_w_25 ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation3 ;

    @FindBy (id= "user_input_edit")
    public MobileElement EnterMerchantPIN ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    MobileElement Confirmation4 ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'message') and @text='عملية ناجحة']")
    public MobileElement SuccessMSG ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='طباعة']")
    MobileElement Print ;

    public  void VFSha4nFakaheEntryScreenMobile ( String Mobile)
    {
        SetTextElement(EnterMobileNumberVF, Mobile);
        ClickButton(Confirmation1);
    }

    public  void  VFSha7nFakahConfirmationMobileNumberScreen2 (String ConfirmationMob)
    {
        SetTextElement(EnterConfirmationMob, ConfirmationMob);
        ClickButton(Confirmation2);
        ClickButton(Slab4_w_25);
        System.out.println(Title.getText());
        System.out.println(VfTopUpAmount.getText() + " = " + Amount4_w_25.getText());
        System.out.println(VfTopUpTotalAmount.getText() + " = " + TotalAmount4_w_25.getText());
    }

    public void SlabsVFscreen(String PIN) {
        ClickButton(Confirmation3);
        SetTextElement(EnterMerchantPIN,PIN);
        ClickButton(Confirmation4);
        ClickButton(Print);
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
}
