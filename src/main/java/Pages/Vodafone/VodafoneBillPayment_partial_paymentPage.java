package Pages.Vodafone;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.PushesFiles;
import org.openqa.selenium.support.FindBy;

public class VodafoneBillPayment_partial_paymentPage extends PageBase {
    public VodafoneBillPayment_partial_paymentPage(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='فواتير محمول']")
    MobileElement VfBillpaymentService;

    public void VfBillPayment() {
        ClickButton(VfBillpaymentService);
    }

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumberVF;

    @FindBy(id = "confirm_btn")
    MobileElement Confirmation1;

    @FindBy(id = "title")
    public MobileElement Title;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='دفع قيمة مختلفة']")
    public MobileElement Partial_payment_option;

    @FindBy(id = "popup_name")
    public MobileElement pop_msg;

    @FindBy(id = "user_input_edit")
    public MobileElement EnterRangeAmount;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement AmountLable;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFLable;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmountLable;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 2.0']")
    public MobileElement AmountValueE;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 2.00']")
    public MobileElement CAFValue;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 4.0']")
    public MobileElement totalamountValue;

    @FindBy(id = "user_input_edit")
    MobileElement PINEntryScreen;

    @FindBy(id = "message")
    public MobileElement Successfull_Message;

    @FindBy(id = "confirm_btn")
    MobileElement Print;

    public void Flow_Screen1(String RefNumber) {
        SetTextElement(EnterMobileNumberVF, RefNumber);
        ClickButton(Confirmation1);
    }

    public void Flow_Screen2(String ConRefNumber) {
        SetTextElement(EnterMobileNumberVF, ConRefNumber);
        ClickButton(Confirmation1);
        System.out.println(Title.getText());
        System.out.println(Partial_payment_option.getText());
    }

    public void Partialpayment() {
        ClickButton(Partial_payment_option);
        System.out.println(pop_msg.getText());

    }

    public void flow1(String Amount) {
        SetTextElement(EnterRangeAmount, Amount);
        ClickButton(Confirmation1);
        System.out.println(AmountLable.getText() + " =  " + AmountValueE.getText());
        System.out.println(CAFLable.getText() + "= " + CAFValue.getText());
        System.out.println(TotalAmountLable.getText() + " = " + totalamountValue.getText());
    }

    public void flow2(String pin) {
        ClickButton(Confirmation1);
        SetTextElement(PINEntryScreen, pin);
        ClickButton(Confirmation1);
        System.out.println(Successfull_Message.getText());
    }

    public void Print() {
        ClickButton(Print);
    }

    @FindBy(id = "cancel_btn")
    public MobileElement CancleButton;

    @FindBy(id = "back_ib")
    public MobileElement Back;

    public void lastflow() {
        ClickButton(CancleButton);
    }
}
