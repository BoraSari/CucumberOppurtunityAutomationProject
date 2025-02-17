package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
    public static WebDriver driver;

    public  static WebDriver setupDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
return driver;






    }

    public  static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }

}
