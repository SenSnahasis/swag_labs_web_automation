package swag.labs.com.base;

import com.webFramework.helper.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BaseClass {
    public static WebDriver webDriver;
    public void initialiseBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-infobars");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
// 👇 Disable the password leak detection popup
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://www.saucedemo.com/");
        webDriver.manage().window().maximize();
        new CommonHelper(webDriver);
    }
}
