package swag.labs.com.locatorsInterface;

import org.openqa.selenium.By;

public interface HomePageLocator {
    By menuButton = By.id("react-burger-menu-btn");
    By menuCrossButton = By.id("react-burger-cross-btn");
    By allItemsButton = By.id("inventory_sidebar_link");
    By aboutButton = By.id("about_sidebar_link");
    By logoutButton = By.id("logout_sidebar_link");
    By resetAppStateButton = By.id("reset_sidebar_link");
    By cartButton = By.id("shopping_cart_container");
    By filterButton = By.className("product_sort_container");

}
