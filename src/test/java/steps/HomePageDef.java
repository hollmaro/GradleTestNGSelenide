package steps;

import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomePageDef {

    HomePage homePage = new HomePage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        homePage.clickButton(arg0);
    }

    @Then("Button with text {string} is visible")
    public void buttonWithTextIsVisible(String text) {
        homePage.contentIsVisibleByText(text);
    }
}
