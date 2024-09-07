package swag.labs.com.locatorsInterface;

import org.openqa.selenium.By;

public interface LoginLocator {
    By usernameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By loginBtn = By.id("login-button");
}
