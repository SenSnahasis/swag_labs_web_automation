package swag.labs.com.stepdefinition;

import io.cucumber.java.en.Then;
import swag.labs.com.pageObject.HomePageObject;

public class LoginSteps {

    HomePageObject homePageObject = new HomePageObject();

    @Then("I login to Swag Labs with username {string} and password {string}")
    public void loginToSwagLabs(String username, String password) {
        homePageObject.loginComponent().login(username, password);
    }

    @Then("I logout from Swag Labs")
    public void logoutFromSwagLabs() {
        homePageObject.loginComponent().logout();
    }
}
