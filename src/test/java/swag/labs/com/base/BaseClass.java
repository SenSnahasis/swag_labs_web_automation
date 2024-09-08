package swag.labs.com.base;

import com.webFramework.helper.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver webDriver;
    public void initialiseBrowser(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
        webDriver.manage().window().maximize();
        new CommonHelper(webDriver);
    }
}
