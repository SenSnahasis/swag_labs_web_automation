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

  Scenario Outline: Verify unable to login with empty or wrong Username or Password
    Given I lunch the browser
    When I clear and enter the "usernameLocator" as "<Username>"
    And I clear and enter the "passwordLocator" as "<Password>"
    And I click on "loginBtn" button
    Then Locate and verify text equals "<Error Message>"
    Examples:
      | Username      | Password     | Error Message                                                             |
      |               |              | Epic sadface: Username is required                                        |
      | standard_user |              | Epic sadface: Password is required                                        |
      |               | secret_sauce | Epic sadface: Username is required                                        |
      | standard_use  | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user | secret_sauc  | Epic sadface: Username and password do not match any user in this service |

  Scenario Outline: Verify successfully login to Swag Labs
    Given I lunch the browser
    When I login to Swag Labs with username "<Username>" and password "<Password>"
    Then Locate and verify text equals "Products"
    Examples:
      | Username      | Password     |
      | standard_user | secret_sauce |

  Scenario: Verify logout from Swag Labs
    Given I lunch the browser
    When I login to Swag Labs with username "<Username>" and password "<Password>"
    Then I logout from Swag Labs

