package pages;

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


public class BasePage {
    private AndroidDriver driver;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        Elements();
    }

    public MobileElements Skip;
    public MobileElements Search;
    public MobileElements Navigation;
    public MobileElements CloseSave;
    public MobileElements DontSave;



    public void Elements (){

        Skip = new MobileElements(driver, MobileBy.id("com.reddit.frontpage:id/skip_text"));
        Search = new MobileElements(driver,By.id("com.reddit.frontpage:id/search_view"));
        Navigation = new MobileElements(driver, By.id("com.reddit.frontpage:id/nav_icon"));
    }

    public void skipSignUp(){
        Skip.click();
    }
}
