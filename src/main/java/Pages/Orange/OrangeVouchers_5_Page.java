package Pages.Orange;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class OrangeVouchers_5_Page extends PageBase {
    public OrangeVouchers_5_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='كروت شحن أورنچ']")
    MobileElement OrangeVouchersService ;

    public void Orangevouchers ()


    {
        ClickButton(OrangeVouchersService);
    }

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='كارت واحد']")
    MobileElement Onecard ;

    @FindBy (xpath= "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='5']")
    MobileElement voucher5 ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath ="//android.widget.TextView[contains(@resource-id,'fees_label') and @text='المبلغ الكلي']")
    public MobileElement TotalAmount ;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text= 'EGP 5.0']")
    public MobileElement Voucher_5 ;

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 5.0']")
    public MobileElement TotalValue_5 ;

    @FindBy(id ="confirm_btn")
    public MobileElement Confirmation1 ;

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation2 ;

    @FindBy (className =  "ImageView")
    public  MobileElement Receipt_AmanLogo ;

    @FindBy (id= "voucher_service_name")
    public  MobileElement Receipt_Title ;

    @FindBy (id= "voucher_pin_tv")
    public  MobileElement Voucher_Pin ;

    @FindBy (id= "voucher_serial_num_tv")
    public  MobileElement Voucher_SerialNumber ;

    @FindBy (id= "total_cost_tv")
    public  MobileElement Receipt_total_cost ;

    @FindBy (id="voucher_footer_tv")
    public  MobileElement Receipt_footer ;

    @FindBy (id ="print_vouch_btn")
    public  MobileElement print_vouch ;

    public  void  OrangeVouchers_flow1 ()
    {
        ClickButton(Onecard);
        ClickButton(voucher5);
        System.out.println(Amount.getText() + " = " + Voucher_5.getText());
        System.out.println(TotalAmount.getText() + " = " + TotalValue_5.getText());
    }

    public  void  orangeVouchers_flow2 (String PIN)
    {
        ClickButton(Confirmation1);
        SetTextElement(PINEntryScreen,PIN);
        ClickButton(Confirmation2);
        System.out.println("Aman Logo" + Receipt_AmanLogo);
        System.out.println("Receitp Title " + Receipt_Title.getText());
        System.out.println("Voucher pin = " + Voucher_Pin.getText());
        System.out.println("Serial Number = " + Voucher_SerialNumber.getText() );
        System.out.println("Total Amount = " + Receipt_total_cost.getText());
        System.out.println("Receipt footer for voucher 5 " + Receipt_footer.getText());
    }

  public void Print ()
  {
      ClickButton(print_vouch);
  }
}
