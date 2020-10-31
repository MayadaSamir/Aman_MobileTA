package Pages.WE;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class WE_KrotSha7n_kartGomla_75 extends PageBase {

    public WE_KrotSha7n_kartGomla_75(AndroidDriver driver) {
        super(driver);
    }  //Constructor

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='كروت شحن وي']")
    MobileElement WeVoucherService;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='كارت واحد']")   //Kart Wahed screen
            MobileElement WeVoucherKartGomla;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='75']")
    MobileElement WeVoucher_75; //slab 75

    @FindBy(id= "amount_label")
    public MobileElement WeVoucherAmount;

    @FindBy (id = "fees_label")
    public MobileElement WeVoucherTotalAmount;

    @FindBy(id = "amount_value")
    public MobileElement Amount75_0;

    @FindBy(id = "fees_value")
    public MobileElement TotalAmount75_0;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation1;  //User confirmation on amount+total

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle;

    @FindBy (id= "user_input_edit")
    public MobileElement EnterMerchantPIN;

    @FindBy (xpath = "//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    MobileElement Confirmation2;    //Merchant confirmation on his pin

    @FindBy (id= "print_vouch_btn")    //receipt
    public MobileElement Print;

    @FindBy(id = "retry_btn" )
    public MobileElement ConnectWithPrinter ;


    public  void ClickOnWEVouchersService ()
    {

        ClickButton(WeVoucherService);
    }

    public  void  ClickOnWE_kartGomla ()
    {

        ClickButton(WeVoucherKartGomla);
    }

    public void  WEVoucher_slab_75() {

        ClickButton(WeVoucher_75);
    }

    public void  WEKrotFlow (String PIN )
    {
        System.out.println(WeVoucherAmount.getText());
        System.out.println(WeVoucherTotalAmount.getText());
        System.out.println(Amount75_0.getText());
        System.out.println(TotalAmount75_0.getText());
        ClickButton(Confirmation1);
        SetTextElement(EnterMerchantPIN,PIN);
        ClickButton(Confirmation2);
    }

    public  void  Print()
    {

        ClickButton(Print);
    }

}  // End Class


