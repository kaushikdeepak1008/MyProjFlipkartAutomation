package flipkartpkg.hooks;

import flipkartpkg.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class MyHooks {
    private WebDriver driver;

    @Before
    public void before(Scenario scenario) {
        System.out.println("Before: Thread ID: " + Thread.currentThread().getId() + "," + "Scenario Name: " + scenario.getName());
        driver = DriverFactory.initializeDriver();

    }
    @After
    public void after(Scenario scenario) {
        driver.quit();
        System.out.println("After: Thread ID: " + Thread.currentThread().getId() + "," + "Scenario Name: " + scenario.getName());
    }
}
