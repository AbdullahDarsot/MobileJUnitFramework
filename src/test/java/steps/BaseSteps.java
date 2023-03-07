package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;
import utils.mobile.Driver;

public class BaseSteps{

    private BasePage basePage = new BasePage(Driver.getDriver());

    @Given("the user launches the emulator")
    public void user_enters_some_text(){
        basePage.skipSignUp();
    }


}
