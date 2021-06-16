package Pages.Orange;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Orange_Bill_Payment_Page extends PageBase {
    public Orange_Bill_Payment_Page(AndroidDriver driver) {
        super(driver);
    }

   @FindBy (xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView\n")
   MobileElement OrangebillpaymentService ;

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumber ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (id = "title")
    MobileElement AmountTitleScreen ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع الفاتورة كاملة']")
    MobileElement Pay_Full_bill ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع قيمة مختلفة']")
    MobileElement Pay_Partial_bill ;

     @FindBy (id = "popup_name")
     MobileElement RangeForPay_TitleScreen ;

     @FindBy (id = "user_input_edit")
     MobileElement EnterPartialBill ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3 ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmount ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 500.0']")
    public MobileElement AmountVALUE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 4.00']")
    public MobileElement CAFvalue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 504.0']")
    public MobileElement totalValue ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation4 ;    // Code Confirmation Screen تأكيد 4

    @FindBy (id = "popup_name")
    MobileElement PINEntryScreenTitle ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy(xpath ="//android.widget.Button[contains(@resource-id,'confirm_btn') and @text='تأكيد']")
    public MobileElement Confirmation5 ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    public void  OrangeBillPaymentFlow_Screen1 (String RefNumber)
    {
        SetTextElement(EnterMobileNumber , RefNumber );
        ClickButton(Confirmation1);
    }

    public void  OrangeBillPaymentFlow_Screen2 (String  ConRefNumber)
    {
        SetTextElement(EnterConfirmationMob , ConRefNumber);
        ClickButton(Confirmation2);
    }

    public  void  PayFullBill ()
    {
        System.out.println(AmountTitleScreen.getText());
        ClickButton(Pay_Full_bill);
        System.out.println(Amount.getText() + " = " + AmountVALUE.getText() );
        System.out.println(CAFAmount.getText() + " = " + CAFvalue.getText() );
        System.out.println(TotalAmount.getText() + " = " + totalValue.getText() );
    }

    public  void  PayPartialBill ( String PartialAmount)
    {
        System.out.println(AmountTitleScreen.getText());
        ClickButton(Pay_Partial_bill);
        System.out.println(RangeForPay_TitleScreen.getText());
        SetTextElement(EnterPartialBill , PartialAmount );
    }

    public  void  orangeBillPaymentflow ( String pin )
    {
        ClickButton(Confirmation4);
        SetTextElement(PINEntryScreen , pin);
        ClickButton(Confirmation5);
    }
  public  void  printReceipt ()
  {
      ClickButton(Print);
  }
}
