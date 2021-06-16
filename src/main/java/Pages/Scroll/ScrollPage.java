package Pages.Scroll;

import Pages.PageBase;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import java.time.Duration;

public class ScrollPage extends PageBase {

    public ScrollPage(AndroidDriver driver) {
        super(driver);
    }

        public void swipe() {
            Dimension size = driver.manage().window().getSize();
            int anchor = (int) (size.height * 2 );
            int startPoint = (int) (size.width * 33);
            int endPoint = (int) (size.width * 2);
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startPoint, anchor))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(endPoint, anchor))
                    .release()
                    .perform();
        }
    }


