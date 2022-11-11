package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BaseElements {

    public void clickButton(String buttonText){
        $(By.xpath(".//*[text()='" + buttonText + "']")).click();
    }

    public void clickSubmitButtonWithText(String buttonText){
        $(By.xpath("//*[@type='submit' and text()='" + buttonText + "']")).click();
    }

    public void contentIsVisibleByText(String text) {
        $(By.xpath(".//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}
