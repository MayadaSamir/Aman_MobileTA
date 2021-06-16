package Pages.Others;
import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class ElCinema_Page extends PageBase {
    public ElCinema_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'service_name') and @text='السينما']")
    MobileElement El_Cinema;

    @FindBy (id = "user_input_edit")
    MobileElement RefNumber_1 ;

    @FindBy (id = "confirm_btn")
    MobileElement confirmation ;

    @FindBy (id = "user_input_edit")
    MobileElement RefNumber_confirmation ;

    @FindBy (id = "info")
    public MobileElement Info;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement AmountLable;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_label') and @text='تكلفة الخدمة بالجنيه']")
    public MobileElement CAFLable ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_label') and @text='المبلغ الكلى']")
    public MobileElement TotalAmountLable ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 108.0']")
    public MobileElement AmountValueE ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'fees_value') and @text='EGP 3.42']")
    public MobileElement CAFValue ;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'total_amount_value') and @text='EGP 111.42']")
    public MobileElement totalamountValue ;

    @FindBy (id = "user_input_edit")
    public MobileElement PINEntryScreen ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print ;

    public  void  ClickOnService ()
    {
        ClickButton(El_Cinema);
    }

    public void Flow_Screen1 (String RefNumber)
    {
        SetTextElement(RefNumber_1 , RefNumber );
        ClickButton(confirmation);
    }

    public void  Flow_Screen2 (String  ConRefNumber)
    {
        SetTextElement(RefNumber_confirmation, ConRefNumber);
        ClickButton(confirmation);
    }

    public  void  FLOW ()
    {
        ClickButton(confirmation);
    }

    public  void  FeesConfirmaion ()
    {
        ClickButton(confirmation);
    }

    public  void  EnterPIN (String PIN)
    {
        SetTextElement(PINEntryScreen , PIN );
        ClickButton(confirmation);
    }

    public  void  Print ()
    {
        ClickButton(Print);
    }
}
