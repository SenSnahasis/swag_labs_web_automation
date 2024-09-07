package swag.labs.com.base;

import com.webFramework.helper.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    public void initialiseBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        new CommonHelper(driver);
    }
}
