package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='app19']")
    private WebElement searchBtnn;

}
