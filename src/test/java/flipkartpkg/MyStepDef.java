package flipkartpkg;

import flipkartpkg.factory.DriverFactory;
import flipkartpkg.pages.HomePage;
import flipkartpkg.pages.SearchPage;
import flipkartpkg.utils.ConfigLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyStepDef {
    private WebDriver driver;

    @Given("user is on flipkart website homepage")
    public void user_is_on_flipkart_website_homepage(){
        // Driver open
        driver = DriverFactory.getDriver();
        new HomePage(driver).load();
    }

    @When("user enter \"shirts for men\" on global search")
    public void user_enter_shirts_for_men_on_global_search()  {
        new HomePage(driver).searchProduct("shirts for men");
    }

    @Then("page should display results")
    public void page_should_display_results() {
        SearchPage searchpage = new SearchPage(driver);
        Assert.assertTrue(searchpage.search().contains("shirts for men"),"Assertion failed");
    }

    @Given("user is on result page")
    public void user_is_on_result_page() {
        SearchPage searchpage = new SearchPage(driver);
        Assert.assertTrue(searchpage.search().contains("shirts for men"),"Assertion failed");
    }

    @When("user clicks on first result")
    public void user_clicks_on_first_result() {}

    @Then("page should be redirected to product page")
    public void page_should_be_redirected_to_product_page() {}

    @Given("user is on product page")
    public void user_is_on_product_page() {}

    @When("user clicks on ADD TO CART button")
    public void user_clicks_on_add_to_cart_button() {}

    @Then("page should be redirected to cart page")
    public void page_should_be_redirected_to_cart_page() {}

    @And("selected shirt should be added in the cart")
    public void selected_shirt_should_be_added_in_the_cart() {}

    @Given("user is on cart page")
    public void user_is_on_cart_page() {}

    @When("user clicks on PLACE ORDER button")
    public void user_clicks_on_place_order_button() {}

    @Then("page should be redirected to Login or Signup page")
    public void page_should_be_redirected_to_Login_or_Signup_page() {}

}
