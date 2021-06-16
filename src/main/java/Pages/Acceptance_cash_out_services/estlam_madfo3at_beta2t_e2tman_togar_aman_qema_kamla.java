package Pages.Acceptance_cash_out_services;

import Pages.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class estlam_madfo3at_beta2t_e2tman_togar_aman_qema_kamla extends PageBase {

    public estlam_madfo3at_beta2t_e2tman_togar_aman_qema_kamla(AndroidDriver driver) { super(driver); }  //Constructor

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='استلام مدفوعات بطاقة الائتمان لتجار أمان']")
    public MobileElement beta2a;

    @FindBy(id = "popup_name")
    public MobileElement mobileTitle;

    @FindBy (id = "user_input_edit")
    MobileElement EnterNumber;

    @FindBy(id ="confirm_btn")
    MobileElement Confirmation1;

    @FindBy (id = "popup_name")
    public MobileElement mobileConfirmationTitle;

    @FindBy(id ="user_input_edit")
    MobileElement EnterNumberConfirmation;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation2;

    @FindBy(id ="fees_title")
    public MobileElement TitleScreen ;

    @FindBy (id = "info")
    public  MobileElement CustomerData ;

    @FindBy (id ="confirm_btn")
    MobileElement Confirmation3;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'amount_text_view_card') and @text='رقم الفاتورة 01017208008 القيمة 0.0']")
    public MobileElement raqmFatora; //first slab

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'service_name') and @text='سحب القيمة كاملة']")
    public MobileElement fatoraKamla;
}

