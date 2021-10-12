package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;
    public SearchPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="input")
    public WebElement searchBox;
}
