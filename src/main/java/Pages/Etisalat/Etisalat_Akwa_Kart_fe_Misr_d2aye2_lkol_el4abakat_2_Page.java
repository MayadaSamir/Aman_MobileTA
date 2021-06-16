package Pages.Etisalat;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class Etisalat_Akwa_Kart_fe_Misr_d2aye2_lkol_el4abakat_2_Page extends PageBase {
    public Etisalat_Akwa_Kart_fe_Misr_d2aye2_lkol_el4abakat_2_Page(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'sub_service_name_tv') and @text='أقوي كارت فى مصر دقائق لكل الشبكات']")
    public MobileElement EtisalatMinutes;

    public  void  ClickonService ()
    {
        ClickButton(EtisalatMinutes);
    }

    @FindBy (id = "user_input_edit")
    MobileElement EnterCode;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;

    @FindBy(id ="user_input_edit")
    MobileElement EnterCodeConfirmation;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='2']")
    public MobileElement Slab_2;

    @FindBy (id = "fees_title")
    public MobileElement Title ;

    @FindBy(xpath= "//android.widget.TextView[contains(@resource-id,'amount_label') and @text='القيمة']")
    public MobileElement Amount;

    @FindBy (xpath = "//android.widget.TextView[contains(@resource-id,'amount_value') and @text='EGP 2.0']")
    public MobileElement AmountVALUE ;

    @FindBy (id = "fees_label")
    public MobileElement TotalAmount ;

    @FindBy(id = "fees_value")
    public MobileElement Totalvalue;

    @FindBy (id = "user_input_edit")
    MobileElement PINEntryScreen ;

    @FindBy (id = "message")
    public MobileElement Successfull_Message ;

    @FindBy(id ="confirm_btn")
    MobileElement Print;

    public void  Screen1 ( String  MobileNumber)
    {
        SetTextElement(EnterCode , MobileNumber );
        ClickButton(Confirmation1);
    }

    public void Screen2 ( String  ConfirmationMobileNumber)
    {
        SetTextElement(EnterCodeConfirmation , ConfirmationMobileNumber);
        ClickButton(Confirmation1);
    }

    public  void  SelectSlab ()
    {
        ClickButton(Slab_2);
        System.out.println(Title.getText());
        System.out.println(Amount.getText() + " = " + AmountVALUE.getText());
        System.out.println(TotalAmount.getText() + " = " + Totalvalue.getText());
    }

    public void flow (String PIN)
    {
        ClickButton(Confirmation1);
        SetTextElement(PINEntryScreen , PIN);
        ClickButton(Confirmation1);
        System.out.println(Successfull_Message.getText());
    }
    public  void  print ()
    {
        ClickButton(Print);
    }

    @FindBy ( id = "cancel_btn")
    public  MobileElement CancleButton ;
    public  void  lastflow ()
    {
        ClickButton(CancleButton);
    }
}
