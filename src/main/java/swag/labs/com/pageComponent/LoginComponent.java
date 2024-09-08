package swag.labs.com.pageComponent;

import com.webFramework.helper.*;
import swag.labs.com.locatorsInterface.HomePageLocator;
import swag.labs.com.locatorsInterface.LoginLocator;

public class LoginComponent implements LoginLocator, HomePageLocator {

    public void login(String username, String password) {
        if(ElementInfo.isElementPresent(loginBtn)) {
            KeyBoard.clearText(usernameLocator);
            TextBox.clearAndSendKeys(usernameLocator, username);
            KeyBoard.clearText(passwordLocator);
            TextBox.clearAndSendKeys(passwordLocator, password);
            Button.click(loginBtn);
            ElementInfo.isElementPresent(cartButton);
        }
    }

    public void logout() {
        Button.click(menuButton);
        ExplicitWait.hardWait(500);
        Button.click(logoutButton);
        ElementInfo.isElementPresent(loginBtn);
    }
}
