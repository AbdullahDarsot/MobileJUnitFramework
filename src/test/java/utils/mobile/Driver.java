package utils.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.WindowsDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

    private static AndroidDriver driver;




    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("avd", "TestAppiumInspect"); //set the AVD (Android Virtual Device) to be launched
        desiredCapabilities.setCapability("deviceName", "Abdullah"); //set the name of the device to be launched (should be same as AVD)
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\abdullah.darsot\\OneDrive - ROQ IT\\Documents\\reddit-official-app-3-12-0.apk");
        desiredCapabilities.setCapability("appium:autoDismissAlerts", true);
        desiredCapabilities.setCapability("appium:autoGrantPermissions", true);
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        return getDriver();
    }

    public static synchronized AndroidDriver getDriver(){

        return driver;
    }

//    @Test
//    public void sampleTest() {
//
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}