package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private BaseElements baseElements = new BaseElements();
    private SelenideElement emailInput = $(By.cssSelector("#email"));
    private SelenideElement passwInput = $(By.cssSelector("#password"));

    public void inputEmail(String text){
        emailInput.val(text);
    }

    public void inputPassw(String text){
        passwInput.val(text);
    }

    public void clickSubmit(String buttonText){
        baseElements.clickSubmitButtonWithText(buttonText);
    }

}
