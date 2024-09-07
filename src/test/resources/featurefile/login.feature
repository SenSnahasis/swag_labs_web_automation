@login
Feature: Login feature functionality
  
  
  Scenario: Verify successfully launch the Swag Labs
    Given I lunch the browser
    Then Verify the title as "Swag Labs"
 
  Scenario Outline: Verify the placeholders of Username and Password
    Given I lunch the browser
    Then Verify attribute "placeholder" in "<Locators>" is present
    Examples:
      | Locators        |
      | usernameLocator |
      | passwordLocator |

  Scenario: Successfully login
    Given I lunch the browser
    When I clear and enter the "usernameLocator" as "standard_user"
    And I clear and enter the "passwordLocator" as "secret_sauce"
    And I click on "loginBtn" button
    Then Locate and verify text equals "Products"
