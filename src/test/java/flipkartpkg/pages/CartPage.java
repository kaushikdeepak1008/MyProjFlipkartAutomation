package flipkartpkg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "") private WebElement resultText;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    //public void
}
