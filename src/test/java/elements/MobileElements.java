package elements;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

public class MobileElements {

    private AndroidDriver driver;

    private By locator;
    public MobileElements(AndroidDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

    public void click() {
        driver.findElement(this.locator).click();
    }

    public void accessbilityIdclick(String text) {
        driver.findElementByAccessibilityId(text).click();
    }


    public void SendKeys(String text) {
        driver.findElement(this.locator).sendKeys(text);
    }


    public void clear(){
        driver.findElement(this.locator).clear();
    }
}
