package Pages.Wallets;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Vodafone_Transaction_Inquiry_Page extends PageBase {
    public Vodafone_Transaction_Inquiry_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'service_name') and @text='محفظة فودافون كاش']")
    MobileElement VFcash ;

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'service_name') and @text='إستعلام عن عملية']")
    MobileElement VFTrnsactionInquiry;

    @FindBy(id = "user_input_edit")
    MobileElement EnterMobileNumber ;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1  ;

    @FindBy(id ="user_input_edit")
    MobileElement EnterConfirmationMob ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2 ;

    @FindBy (id = "message")
    public MobileElement ScreenTitle ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;


    public  void  ClickOnService ()
    {
        ClickButton(VFcash);
        ClickButton(VFTrnsactionInquiry);
    }


    public void Flow_Screen1 (String RefNumber)
    {
        SetTextElement(EnterMobileNumber , RefNumber );
        ClickButton(Confirmation1);
    }

    public void  Flow_Screen2 (String  ConRefNumber)
    {
        SetTextElement(EnterConfirmationMob , ConRefNumber);
        ClickButton(Confirmation2);
        System.out.println(ScreenTitle.getText());
    }

    public  void  Print ()
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
        ClickButton(Back);
        ClickButton(Back);
    }
}
