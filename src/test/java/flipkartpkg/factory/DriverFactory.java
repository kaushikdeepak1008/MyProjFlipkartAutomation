package flipkartpkg.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static final ThreadLocal <WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initializeDriver() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        DriverFactory.driver.set(driver);
        return driver;
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
