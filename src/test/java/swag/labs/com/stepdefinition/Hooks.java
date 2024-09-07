package swag.labs.com.stepdefinition;

import com.webFramework.helper.CommonHelper;
import io.cucumber.java.AfterAll;

public class Hooks extends CommonHelper {
    @AfterAll()
    public static void quitBrowser() {
        driver.quit();
    }
}
