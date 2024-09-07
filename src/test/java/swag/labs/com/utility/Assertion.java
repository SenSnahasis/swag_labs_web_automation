package swag.labs.com.utility;

import org.junit.Assert;

import java.util.List;

public class Assertion {

    public static void validateActualText(String expectedText, String actualText) {
        System.out.println(expectedText + " +++++ " + actualText);
        Assert.assertTrue(expectedText.equalsIgnoreCase(actualText));
    }

    public static void validateContainText(String expectedText, String actualText) {
        System.out.println(expectedText + " +++++ " + actualText);
        Assert.assertTrue(actualText.contains(expectedText));
    }

    public static void validateTrue(boolean flag) {
        Assert.assertTrue(flag);
    }

    public static void validateFalse(boolean flag) {
        Assert.assertFalse(flag);
    }
}
