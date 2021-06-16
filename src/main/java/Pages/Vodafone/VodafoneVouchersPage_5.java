package Pages.Vodafone;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class VodafoneVouchersPage_5 extends PageBase {
    public VodafoneVouchersPage_5(AndroidDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='5']")
    MobileElement VFVoucher_5_00 ;

    @FindBy(id= "amount_label")
    public MobileElement VfVoucherAmount ;

    @FindBy (id = "fees_label")
    public MobileElement VfVoucherTotalAmount ;

    @FindBy(id = "amount_value")
    public MobileElement Amount5 ;

    @FindBy(id = "fees_value")
    public MobileElement TotalAmount5_00 ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation1 ;

    @FindBy (id= "user_input_edit")
    public MobileElement EnterMerchantPIN ;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    MobileElement Confirmation2 ;

    public void  VFVoucher_5_Select  ()
    {
        ClickButton(OneCard);
        ClickButton(VFVoucher_5_00);
        System.out.println(VfVoucherAmount.getText() + " = " + Amount5.getText());
        System.out.println(VfVoucherTotalAmount.getText()  + " = " + TotalAmount5_00.getText());
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='كارت واحد']")
    MobileElement OneCard;

    public void  EnterPIN (String PIN )
    {
        ClickButton(Confirmation1);
        SetTextElement(EnterMerchantPIN,PIN);
        ClickButton(Confirmation2);
    }

    @FindBy (id = "voucher_service_name")
    public  MobileElement Receipt_Title ;

    @FindBy (id = "total_cost_tv")
    public  MobileElement TotalAmountReceipt;

    @FindBy (id = "voucher_footer_tv")
    public MobileElement Footer ;

    @FindBy (id = "print_vouch_btn")
    MobileElement Print ;

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;

    public  void  Receipt ()
    {
        System.out.println(Receipt_Title.getText());
        System.out.println(TotalAmountReceipt.getText());
        System.out.println(Footer.getText());
        ClickButton(Print);
    }

    public  void  lastflow ()
    {
        ClickButton(CancleButton);
    }
}
