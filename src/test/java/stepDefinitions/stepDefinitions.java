package stepDefinitions;

import Pages.ProductResultsPage;
import Pages.TabBarPage;
import Utilities.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class stepDefinitions {

    public static WebDriver driver;
    TabBarPage tabBarPage;
    ProductResultsPage productDetailsPage;


    @Given("setup Driver")
    public void setupdriver() {
      driver =  MyDriver.setupDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
    }

    @Given("User navigate to N11 website")
    public void user_navigate_to_n11_website() {
        tabBarPage = new TabBarPage(driver);
      tabBarPage.navigateN11();
    }

    @Given("search product on searchbox")
    public void search_product_on_searchbox() {

        tabBarPage.searchProduct("Oyuncu Laptopu");

    }

    @When("User scroll the page")
    public void user_scroll_the_page() {
        productDetailsPage = new ProductResultsPage(driver);
        productDetailsPage.scrollPage();
    }

    @Then("User successfuly see oppurtunity image on product")
    public void user_successfuly_see_oppurtunity_image_on_product() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertTrue(productDetailsPage.checkImage().isDisplayed());
        MyDriver.closeDriver();
    }



}

