Feature: Login
  As a user, I want to be able to login with valid username and password
  @scenario_1
  Scenario: Login as a store manager
    Given user is on the login page
    When user logs in as a store manager
    Then user should be able to see the Dashboard page title
  @scenario_2
  Scenario: Login as a sales manager
  Given user is on the login page
  When user logs in as a sales manager
  Then user should be able to see the Dashboard page title
    @scenario_3
    Scenario: Login as a driver
      Given user is on the login page
      When user logs in as a driver
      Then user should be able to see the Dashboard page title
@scenario_outline
      Scenario Outline: Login with different credentials as <username>
       When user enters "<username>" and "<password>"
       Then user should be able to see the Dashboard page title
        Examples:
          |username  |password  |
          |user10    |UserUser123|
          |user15    |UserUser123|
          |user22    |UserUser123|
          |user110   |UserUser123|
          |storemanager85|UserUser123|
          |storemanager120|UserUser123|
          |storemanager56|UserUser123|










