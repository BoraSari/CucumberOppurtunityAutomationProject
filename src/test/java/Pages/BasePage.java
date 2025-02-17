package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    protected String baseUrl = "https://www.n11.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getPageSourcesOfN11(){
        return driver.getPageSource();
    }
    public void navigateN11(){
        driver.get(baseUrl);
    }
}
