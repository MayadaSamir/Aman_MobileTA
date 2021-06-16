package Pages.Others;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class EasyCash_Page  extends PageBase {
    public EasyCash_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy (id = "service_name")
    MobileElement Df3 ; // cash in

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumber ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id = "info")
    public MobileElement  Parameters ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement AmountLable;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFLable ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmountLable ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 10.0']")
    public MobileElement AmountValueE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 5.70']")
    public MobileElement CAFValue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 15.7']")
    public MobileElement totalamountValue ;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;

    @FindBy (id = "back_ib")
    public  MobileElement Back ;

    public void Flow_Screen1 (String RefNumber)
    {
        ClickButton(Df3);
        SetTextElement(EnterMobileNumber , RefNumber );
        ClickButton(Confirmation);
    }

    public void  Flow_Screen2 (String  ConRefNumber)
    {
        SetTextElement(EnterConfirmationMob , ConRefNumber);
        ClickButton(Confirmation);
        System.out.println(Parameters.getText());
    }

    public  void  Flow ()
    {
        ClickButton(Confirmation);
        System.out.println(AmountLable.getText() + " =  " + AmountValueE.getText());
        System.out.println(CAFLable.getText() + "= " + CAFValue.getText());
        System.out.println(TotalAmountLable.getText() + " = " + totalamountValue.getText());
    }

    public  void  Flow2 ( String PIN)
    {
        ClickButton(Confirmation);
        SetTextElement(PINEntryScreen , PIN);
        ClickButton(Confirmation);
        System.out.println(Successfull_Message.getText());
    }

    public  void  print ()
    {
        ClickButton(Print);
        ClickButton(CancleButton);
        ClickButton(Back);
        ClickButton(Back);
    }
}
