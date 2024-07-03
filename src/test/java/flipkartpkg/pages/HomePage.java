package flipkartpkg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']") private WebElement searchField;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String product) {
       /* WebElement inputtext = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        inputtext.sendKeys("shirts for men");
        inputtext.submit();*/

        searchField.sendKeys(product);
        searchField.submit();
    }
}
