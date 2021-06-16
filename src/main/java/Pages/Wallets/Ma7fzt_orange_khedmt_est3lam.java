package Pages.Wallets;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Ma7fzt_orange_khedmt_est3lam extends PageBase {

    public Ma7fzt_orange_khedmt_est3lam(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='محفظة اورانج كاش']")
    public MobileElement ma7fztorangeCash; //inside screen

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='استعلام عن عملية']")
    public MobileElement khedmtEst3lam; //inside screen

    @FindBy (id = "popup_name")
    public MobileElement ScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    MobileElement telephoneNo;

    @FindBy(id ="confirm_btn")
    MobileElement telephonebtn;    // code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement telephoneScreenConfirmation;

    @FindBy(id ="user_input_edit")
    MobileElement telephoneNoConfirm;

    @FindBy (id ="confirm_btn")
    MobileElement raqmtelbtn2;    // code Confirmation Screen تأكيد 2

    @FindBy (id = "message")
    public MobileElement Successful_Message;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public void  ClickOnma7fztOrangeCash()
    {
        ClickButton(ma7fztorangeCash);
    }

    public  void  ClickOneest3lam()
    {
        ClickButton(khedmtEst3lam);
    }

    public void  customerteleEntry (String telNumber)
    {
        System.out.println(ScreenTitle.getText());
        SetTextElement(telephoneNo , telNumber );
        ClickButton(telephonebtn);
    }

    public void  customerteleEntry1 (String  ConfirmationtelNumber)
    {
        System.out.println(telephoneScreenConfirmation.getText());
        SetTextElement(telephoneNoConfirm, ConfirmationtelNumber);
        ClickButton(raqmtelbtn2);
    }

    public void  print ()
    {
        System.out.println(Successful_Message.getText());
        ClickButton(Print);
    }
}
