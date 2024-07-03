package flipkartpkg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//span[@class='BUOuZu']") private WebElement searchBox;

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public String search() {
        return wait.until(ExpectedConditions.visibilityOf(searchBox)).getText();
    }
}
