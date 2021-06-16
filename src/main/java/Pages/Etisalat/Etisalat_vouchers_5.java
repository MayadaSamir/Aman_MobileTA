package Pages.Etisalat;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Etisalat_vouchers_5 extends PageBase {
    public Etisalat_vouchers_5(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='كارت واحد']")
    MobileElement OneCard;

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='5']")
    MobileElement Kart_5;

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

    @FindBy (id = "fees_title")
    public MobileElement Title_screen ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy (id = "voucher_service_name")
    public  MobileElement Receipt_Title ;

    @FindBy (id = "voucher_pin_tv")
    public  MobileElement PINvOUCHER ;

    @FindBy (id = "total_cost_tv")
    public  MobileElement TotalAmountReceipt;

    @FindBy (id = "voucher_footer_tv")
    public MobileElement Footer ;

    @FindBy (id = "print_vouch_btn")
    MobileElement Print ;

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;

    public  void  Flow1 (){
        ClickButton(OneCard);
        ClickButton(Kart_5);
        System.out.println(AmountLable.getText()  + " = " + AmountValueE.getText());
        System.out.println(TotalAmountLable.getText()  + " = " + totalamountValue.getText());
    }

    public  void  flow2 (String PIN) {
        ClickButton(Confirmation);
        SetTextElement(PINEntryScreen, PIN);
        ClickButton(Confirmation);
        System.out.println( "receipt title is " + Receipt_Title.getText());
        System.out.println(" Voucher pin is " + PINvOUCHER.getText());
        System.out.println( "Total is " + TotalAmountReceipt.getText());
        System.out.println( "Footer is " + Footer.getText());
    }

    public void flow3 ()
    {
        ClickButton(Print);
    }

    public  void  lastflow ()
    {
        ClickButton(CancleButton);
    }
}
