package swag.labs.com.locatorsInterface;

import org.openqa.selenium.By;

import java.lang.reflect.Field;

public class LocatorSelector implements LoginLocator {
    private static Object LocatorSelector;

    public static By select(String value) {
        Field field;
        try {
            field = LocatorSelector.class.getField(value);
            return (By) field.get(LocatorSelector);
        } catch (Exception e) {
            return null;
        }
    }
}
