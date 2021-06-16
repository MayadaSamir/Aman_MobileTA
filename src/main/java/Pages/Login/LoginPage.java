package Pages.Login;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(AndroidDriver driver) { super(driver); }

    public void TabtoLogin ()
    {
        ClickButton(loginTab);
    }

    public  void  UserLogin ( String mobileNum , String nationalId , String PIN , String ConfirmationPin )
    {
            SetTextElement(MobileNumber, mobileNum);
            SetTextElement(NationalId, nationalId);
            SetTextElement(EnterPin, PIN);
            SetTextElement(EnterConfirmationPin, ConfirmationPin);
            ClickButton(LoginButton);
    }

    public void EnterOTP (String Code_1 , String Code_2 , String code_3 , String code_4 )
    {
        try {
            SetTextElement(code1,Code_1);
            SetTextElement(code2,Code_2);
            SetTextElement(code3,code_3);
            SetTextElement(code4,code_4);
        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
            System.out.println(e);
        }
    }

    @FindBy( xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"تسجيل الدخول\"]")
    MobileElement loginTab ;

    @FindBy (id = "phone_num_et")
    MobileElement MobileNumber ;

    @FindBy (id = "id_num_etz")
    public MobileElement NationalId ;

    @FindBy (id = "pin_et")
    MobileElement EnterPin ;

    @FindBy (id = "confirm_pin_et")
    MobileElement EnterConfirmationPin ;

    @FindBy (id = "continue_button")
    MobileElement LoginButton ;

    @FindBy (id = "code_et1")
    MobileElement code1 ;

    @FindBy (id = "code_et")
    MobileElement code2 ;

    @FindBy (id = "code_et3")
    MobileElement code3 ;

    @FindBy (id = "code_et4")
    MobileElement code4 ;
}
