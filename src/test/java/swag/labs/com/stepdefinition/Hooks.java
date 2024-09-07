package swag.labs.com.stepdefinition;

import com.webFramework.helper.CommonHelper;
import com.webFramework.helper.Navigate;
import io.cucumber.java.AfterAll;
import swag.labs.com.utility.CONSTANTS;

public class Hooks extends CommonHelper {
    @AfterAll()
    public static void quitBrowser() {
        CONSTANTS.BROWSER_ACTIVE = false;
        Navigate.quit();
    }
}
