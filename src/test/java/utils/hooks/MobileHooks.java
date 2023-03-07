package utils.hooks;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.mobile.Driver;

import java.net.MalformedURLException;

public class MobileHooks extends Driver {
    private AndroidDriver driver;


    @Before
    public void launch() throws MalformedURLException {
        driver = setUp();
    }

//       @After
//        public void tearDown(){
//                driver.quit();
//       }


    @After (order = 0)
    public void tearDown() {

        driver.quit();
    }

    @After (order = 1)
    public void TearDownGetScreenshots(Scenario scenario) {
        if (scenario.isFailed()){
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte [] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }

    }

}
