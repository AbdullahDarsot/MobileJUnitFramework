package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import pages.BasePage;
import utils.mobile.Driver;

public class BaseSteps{

    private BasePage basePage = new BasePage(Driver.getDriver());

//    @Given("the user launches the emulator")
//    public void user_enters_some_text(){
//        basePage.skipSignUp();
//    }

    @Given("the user is on Reddit")
    public void theUserIsOnReddit(){
        basePage.clickReddit();
    }
    ///////////////////////////////The user searches/////////////////////////////////////////////
    @Then("they search for something")
    public void theySearchForSomething(){
        basePage.search("Calm");
    }

    @And("they view the search results")
    public void theyViewTheSearchResults(){
        basePage.searchResults();
    }

    ///////////////////////////////The user switches to Home tab/////////////////////////////////////////////

    @And("they click home")
    public void theyClickHome(){
        basePage.clickHome();
    }

    @Then("they need to sign in")
    public void theyNeedToSignIn(){

    }

    ///////////////////////////////the user enters incorrect login details/////////////////////////////////////////////

    @Then("they click login")
    public void theyClickLogin(){

    }

    @And("they enter incorrect details")
    public void theyEnterIncorrectDetails(){

    }


    ///////////////////////////////the user changes settings/////////////////////////////////////////////

    @Then("goes to settings")
    public void goesToSettings(){
        basePage.clickSettings();
    }

    @And("they change the theme")
    public void theyChangeTheTheme(){
        basePage.changeTheme();

    }



}
