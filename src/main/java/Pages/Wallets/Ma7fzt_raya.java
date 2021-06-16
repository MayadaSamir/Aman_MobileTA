package Pages.Wallets;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Ma7fzt_raya extends PageBase {
    public Ma7fzt_raya(AndroidDriver driver) {
        super(driver);
    }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='محفظة راية القابضة']")
    public MobileElement ma7fztRaya; //inside screen

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='سحب']")
    public MobileElement sa7b; //  sa7b slab

    @FindBy (id = "popup_name")
    public MobileElement ScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    MobileElement raqmID;   // raqm el beta2a

    @FindBy(id ="confirm_btn")
    MobileElement raqmIDtn;    // code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement raqmIDConfirm;

    @FindBy(id ="user_input_edit")
    MobileElement enterRaqmIDConfirmation;

    @FindBy (id ="confirm_btn")
    MobileElement raqmID2;    // code Confirmation Screen تأكيد 2
}

