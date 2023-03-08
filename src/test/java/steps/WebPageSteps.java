package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import pages.BasePage;
import utils.mobile.Driver;

public class WebPageSteps{

    private BasePage basePage = new BasePage(Driver.getDriver());


    @Given("the user is on Reddit")
    public void theUserIsOnReddit(){
        basePage.clickReddit();
    }




}
