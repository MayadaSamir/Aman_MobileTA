package Pages.Vodafone;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class VodafoneCouponesFakah_2_Page extends PageBase {
    public VodafoneCouponesFakah_2_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='كوبون فودافون فكه']")
    public MobileElement VfCouponesFakahService ;

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='كارت واحد']")
    MobileElement OneCard;

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='2']")
    MobileElement VoucherFakah_2;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement AmountLable;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='المبلغ الكلي']")
    public MobileElement TotalAmountLable ;

    @FindBy (id = "amount_value")
    public MobileElement AmountValueE;

    @FindBy (id = "fees_value")
    public MobileElement totalamountValue;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy (id = "voucher_service_name")
    public  MobileElement Receipt_Title ;

    @FindBy (id = "total_cost_tv")
    public  MobileElement TotalAmountReceipt;

    @FindBy (id = "voucher_footer_tv")
     public MobileElement Footer ;

    @FindBy (id = "print_vouch_btn")
    MobileElement Print ;

    public  void  Flow1 (){
        ClickButton(OneCard);
        ClickButton(VoucherFakah_2);
        System.out.println(AmountLable.getText()  + " = " + AmountValueE.getText());
        System.out.println(TotalAmountLable.getText()  + " = " + totalamountValue.getText());
    }

    public  void  flow2 (String PIN) {
        ClickButton(Confirmation);
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation);
        System.out.println(Receipt_Title.getText());
        System.out.println(TotalAmountReceipt.getText());
        System.out.println(Footer.getText());
    }

    public void flow3 ()
    {
        ClickButton(Print);
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
