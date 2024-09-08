package swag.labs.com.pageObject;

import swag.labs.com.pageComponent.LoginComponent;

public class HomePageObject {
    public LoginComponent loginComponent() {
        return new LoginComponent();
    }
}
