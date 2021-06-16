package Pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PageBase {
    public JavascriptExecutor java ;
    public AndroidDriver driver ;
    public PageBase(AndroidDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }
    protected  static  void ClickButton (MobileElement Button)


    {
         Button.click();
    }
    protected  static  void  SetTextElement (MobileElement TextElement ,String Value)

    {
        TextElement.sendKeys(Value);
    }
}
