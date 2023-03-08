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


public class BasePage {
    private AndroidDriver driver;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        Elements();
    }

    public MobileElements Logo;
    public MobileElements Skip;
    public MobileElements ClickSearch;
    public MobileElements SearchEntry;
    public MobileElements SearchResults;
    public MobileElements Home;
    public MobileElements Login;
    public MobileElements Username;
    public MobileElements Password;
    public MobileElements Submit;
    public MobileElements Navigation;
    public MobileElements NavigateBack;
    public MobileElements SettingsButton;
    public MobileElements ThemeDropdown;
    public MobileElements NightTheme;
    public MobileElements Reddit;
    public MobileElements AppsList;



    public void Elements (){

        AppsList = new MobileElements(driver, MobileBy.AccessibilityId("Apps list"));
        Reddit = new MobileElements(driver,MobileBy.AccessibilityId("Reddit"));
        Logo = new MobileElements(driver, By.id("com.reddit.frontpage:id/launch_logo"));
        Skip = new MobileElements(driver, MobileBy.id("com.reddit.frontpage:id/skip_text"));
        ClickSearch = new MobileElements(driver,By.id("com.reddit.frontpage:id/search_view"));
        SearchEntry = new MobileElements(driver, By.id("com.reddit.frontpage:id/search"));
        SearchResults = new MobileElements(driver, By.id("com.reddit.frontpage:id/community_results"));
        Home = new MobileElements(driver, By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView"));
        Login = new MobileElements(driver, By.id("com.reddit.frontpage:id/login_button"));
        Username = new MobileElements(driver, By.id(""));
        Password = new MobileElements(driver, By.id(""));
        Submit = new MobileElements(driver, By.id(""));
        Navigation = new MobileElements(driver, By.id("com.reddit.frontpage:id/nav_icon"));
        NavigateBack = new MobileElements(driver, By.id("Navigate up"));
        SettingsButton = new MobileElements(driver, By.id("com.reddit.frontpage:id/drawer_nav_settings"));
        ThemeDropdown = new MobileElements(driver, By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]"));
        NightTheme = new MobileElements(driver, By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]"));

        ///////////////////////Web Elements///////////////////////

    }


    public void clickReddit(){
        AppsList.click();
        Reddit.click();
    }

    public void search(String text){
        ClickSearch.click();
        SearchEntry.SendKeys(text);
    }

    public void searchResults(){
        SearchResults.click();
    }

    public void clickHome(){
        Home.click();
    }

    public void clickSettings(){
        Navigation.click();
        SettingsButton.click();
    }

    public void changeTheme(){
        ThemeDropdown.click();
        NightTheme.click();
    }
}
