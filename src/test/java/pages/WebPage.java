package pages;

import com.aventstack.extentreports.App;
import elements.MobileElements;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.hu.De;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Element;
import java.io.File;


public class WebPage {
    private AndroidDriver driver;

    public WebPage(AndroidDriver driver){
        this.driver = driver;
        Elements();
    }

    public MobileElements GoogleChrome;
    public MobileElements Skip;
    public MobileElements ClickSearch;




    public void Elements (){

        GoogleChrome = new MobileElements(driver, MobileBy.AccessibilityId("Chrome"));
        Skip = new MobileElements(driver, MobileBy.id("com.reddit.frontpage:id/skip_text"));
        ClickSearch = new MobileElements(driver,By.id("com.reddit.frontpage:id/search_view"));
    }

    public void clickReddit(){
        GoogleChrome.click();
    }



}
