Feature: Login

  @loginPositive
  Scenario:Successful login
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And  User clicks on Login Link
    And User enters corect data
    And User clicks on Yalla button
    Then User verifies Success message is displayed
    And User closes browser

  @wrongPassword
  Scenario Outline:Login with correct email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And  User clicks on Login Link
    And User enters corect email and wrong password
      | email   | password    |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message is displayed
    And User closes browser
    Examples:
      | email | password |
  | maritest@gmail.com | Test1234 |
  | maritest@gmail.com | test1234$|
  | maritest@gmail.com | TEST1234$|
  | maritest@gmail.com | Еуые1234$|

