package Pages.Khadmat_taqset;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Khadmat_taqset_Aqsat_Aman extends PageBase {
    public Khadmat_taqset_Aqsat_Aman(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='خدمات تقسيط']")
    public MobileElement khadmatTaqset; //inside screen

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='اقساط امان']")
    public MobileElement aqsatAman; //inside screen

    @FindBy (id = "popup_name")
    public MobileElement ScreenTitle;  //assert

    @FindBy (id = "user_input_edit")
    MobileElement mobile;

    @FindBy(id ="confirm_btn")
    MobileElement mobilebtn;    // code Confirmation Screen تأكيد 1

    @FindBy (id = "popup_name")
    public MobileElement mobileConfirmation;  //screen title

    @FindBy(id ="user_input_edit")
    MobileElement getmobileConfirmation;

    @FindBy (id ="confirm_btn")
    MobileElement mobilebtn2;    // code Confirmation Screen تأكيد 2

    // missing script
}

