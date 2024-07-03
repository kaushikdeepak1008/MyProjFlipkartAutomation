package flipkartpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Login {
    private WebDriver driver;
    @Test
//System.out.println("Browser needs to be opened");
    /*private void abc() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.walmart.com/");
        System.out.println("Browser opened");
    }*/
    public void login() throws InterruptedException {
        // Driver open
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        System.out.println("Browser opened");
        sleep(2000);

        WebElement inputtext = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        inputtext.sendKeys("shirts for men");
        inputtext.submit();

        sleep(3000);

        WebElement shirt = driver.findElement(By.xpath("(//img[@class='_53J4C-'])[1]"));
        shirt.click();

        sleep(3000);


        //Driver close
        driver.quit();
        System.out.println("Browser closed");
    }
}
