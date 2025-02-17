package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResultsPage extends BasePage{
    private JavascriptExecutor js = ((JavascriptExecutor) driver);
    Actions actions = new Actions(driver);



    @FindBy(xpath = "//img[@src='https://n11scdn.akamaized.net/a1/org/24/08/09/56/54/60/90/38/45/42/57/19/26040334021026951284.png'][1]")
    private WebElement n11OfferImage;

    public ProductResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void scrollPage(){
        js.executeScript("window.scrollBy(0,100)");



    }

    public WebElement checkImage(){
        WebElement ımage = n11OfferImage;
        return ımage;
    }
}
