package swag.labs.com.stepdefinition;

import io.cucumber.java.en.Given;
import swag.labs.com.base.BaseClass;

public class CommonSteps extends BaseClass {

    @Given("^I lunch the browser")
    public void lunchApplication() {
        try {
            initialiseBrowser();
        } catch (Exception e) {

        }
    }
}
