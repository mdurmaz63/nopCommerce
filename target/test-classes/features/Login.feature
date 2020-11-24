

Feature: Login on nopCommerce
  As a user, I want to be able to login with valid username and password

  Scenario: Successful Login with Valid Credentials
    Given User launches Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User clicks on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User clicks on Log out link
    Then Page title should be "Your store. Login"
    And closes browser

Scenario Outline: Login Data Driven
  Given User launches Chrome browser
  When User opens URL "http://admin-demo.nopcommerce.com/login"
  And User enters Email as "<email>" and Password as "<password>"
  And User clicks on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  When User clicks on Log out link
  Then Page title should be "Your store. Login"
  And closes browser
  Examples:
  |email|password|
  |admin@yourstore.com| admin|
  |admin1@yourstore.com| admin123|
 |admin1@yourstore.com| admin12 |
