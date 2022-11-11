package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageDef {

    LoginPage loginPage = new LoginPage();

    @Then("Input email")
    public void inputEmail(){
        loginPage.inputEmail(UserConfig.USER_EMAIL);
    }

    @Then("Input password")
    public void inputPassw(){
        loginPage.inputPassw(UserConfig.USER_PASSW);
    }

    @Then("Click {string} submit button")
    public void clickSubmit(String buttonText){
        loginPage.clickSubmit(buttonText);
    }
}
