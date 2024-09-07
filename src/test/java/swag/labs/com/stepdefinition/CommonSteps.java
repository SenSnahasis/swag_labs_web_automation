package swag.labs.com.stepdefinition;

import com.webFramework.helper.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import swag.labs.com.base.BaseClass;
import swag.labs.com.locatorsInterface.LocatorSelector;
import swag.labs.com.utility.Assertion;
import swag.labs.com.utility.CONSTANTS;

public class CommonSteps extends BaseClass {

    @Given("I lunch the browser")
    public void lunchApplication() {
        if (!CONSTANTS.BROWSER_ACTIVE) {
            initialiseBrowser();
            CONSTANTS.BROWSER_ACTIVE = true;
        }
    }
    @When("Verify the title as {string}")
    public void getTitle(String expectedTitleValue) {
        String actualTitleValue = Navigate.getTitle();
        Assertion.validateActualText(expectedTitleValue, actualTitleValue);
    }
    @When("I click on {string} button")
    public void clickOnButton(String locatorSelect) {
        By locator = LocatorSelector.select(locatorSelect);
        try {
            Button.click(locator);
        } catch (ElementClickInterceptedException exception) {
            throw exception;
        }
    }
    @When("Locate and click on {string}")
    public void locateAndClickElement(String arg) {
        By locator = LocatorGenerator.dynamicLocator(arg);
        Button.click(locator);
    }
    @Then("Verify attribute {string} in {string} is present")
    public void verifyAttributePresent(String attribute, String locatorSelect) {
        By locator = LocatorSelector.select(locatorSelect);
        boolean flag = ElementInfo.isAttributePresent(locator,attribute);
        Assertion.validateTrue(flag);
    }
    @When("I enter the {string} as {string}")
    public void enterTheDataInTextField(String locatorSelect, String value) {
        By locator = LocatorSelector.select(locatorSelect);
        TextBox.sendKeys(locator, value);
    }
    @When("Locate and wait for visibility of {string}")
    public void waitForVisibility(String locatorString) {
        By locator = LocatorGenerator.dynamicLocator(locatorString);
        try {
            ExplicitWait.waitForVisibility(locator);
        } catch (Exception e) {
            ExplicitWait.waitForVisibility(locator);
        }
    }
    @When("I clear and enter the {string} as {string}")
    public void clearAndEnterDataInTextField(String locatorSelect, String value) {
        By locator = LocatorSelector.select(locatorSelect);
        ExplicitWait.waitForVisibility(locator);
        TextBox.clearText(locator);
        try {
            TextBox.clearAndSendKeys(locator, value);
        }catch (ElementNotInteractableException e) {
            TextBox.clearAndSendKeys(locator, value);
        }
    }
    @Then("Locate and verify text equals {string}")
    public void locateAndVerifyText(String arg) {
        By locator = LocatorGenerator.dynamicLocator(arg);
        String actualValue = TextBox.getText(locator);
        Assertion.validateActualText(arg, actualValue);
    }
    @Then("Locate and verify text contains {string}")
    public void locateAndVerifyContainsText(String expectedValue) {
        By locator = LocatorGenerator.dynamicLocator(expectedValue);
        ExplicitWait.waitForVisibility(locator);
        String actualValue = TextBox.getText(locator);
        System.out.println(actualValue +" ************** "+ expectedValue);
        boolean flag = actualValue.contains(expectedValue);
        Assertion.validateTrue(flag);
    }
    @Then("Locate and verify {string} button is present")
    public void verifyButtonPresent(String locatorSelect) {
        By locator = LocatorSelector.select(locatorSelect);
        ExplicitWait.waitForClickable(locator);
        boolean flag = ElementInfo.isElementPresent(locator);
        Assertion.validateTrue(flag);
    }
    @Then("Locate and verify {string} button is not present")
    public void verifyButtonNotPresent(String locatorSelect) {
        By locator = LocatorSelector.select(locatorSelect);
        boolean flag = true;
        try {
            ExplicitWait.waitForClickable(locator);
        } catch (Exception exception) {
            flag = ElementInfo.isElementPresent(locator);
        }
        Assertion.validateFalse(flag);
    }
    @Then("Locate and verify {string} field is present")
    public void verifyFieldPresent(String locatorSelect) {
        By locator = LocatorSelector.select(locatorSelect);
        ExplicitWait.waitForVisibility(locator);
        boolean flag = ElementInfo.isElementPresent(locator);
        Assertion.validateTrue(flag);
    }
    @Then("Locate and verify {string} field is not present")
    public void verifyFieldIsNotPresent(String locatorSelect) {
        By locator = LocatorSelector.select(locatorSelect);
        boolean flag = true;
        try {
            ExplicitWait.waitForVisibility(locator);
        }catch (NoSuchElementException e){
            flag = ElementInfo.isElementPresent(locator);
        }
        Assertion.validateFalse(flag);
    }
    @Then("Locate and Verify {string} text is Removed")
    public void locateAndVerifyTextRemoved(String arg) {
        By locator = LocatorGenerator.dynamicLocator(arg);
        boolean flag = true;
        try {
            ExplicitWait.waitForVisibility(locator);
        } catch (Exception e) {
            flag = ElementInfo.isElementPresent(locator);
        }
        Assertion.validateFalse(flag);
    }
}
