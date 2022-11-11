import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    SoftAssert softAssert = new SoftAssert();

    @Test(groups = {"textNGGroup"})
    void loginTest(){
        open("https://google.com");
        $(By.name("q")).val("Search for selenide").sendKeys(Keys.ENTER);
        softAssert.assertTrue(title().contains("Search for selenide"),"Page title is not correct");
        open("https://google.com");
        $(By.name("q")).val("Automation").shouldNotBe(Condition.empty).sendKeys(Keys.ENTER);
        softAssert.assertTrue(title().contains("Automation"), "Page title is not correct");
        softAssert.assertAll();
    }
}
