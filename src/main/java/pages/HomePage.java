package pages;

public class HomePage {

    BaseElements baseElements = new BaseElements();

    public void clickButton(String buttonText){
        baseElements.clickButton(buttonText);
    }

    public void contentIsVisibleByText(String text) {
        baseElements.contentIsVisibleByText(text);
    }
}
