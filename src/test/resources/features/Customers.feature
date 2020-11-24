Feature: Customers

  Scenario: Add new customer
    Given User launches Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User clicks on Login
    Then User can view Dashboard
    When User clicks on customers Menu
    And clicks on customers Menu item
    And clicks on Add new button
    Then User can view Add new customer page
    When User enters customer info
    And user clicks on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And closes browser

    Scenario: Search Customer by EmailID
      Given User launches Chrome browser
      When User opens URL "http://admin-demo.nopcommerce.com/login"
      And User enters Email as "admin@yourstore.com" and Password as "admin"
      And User clicks on Login
      Then User can view Dashboard
      When User clicks on customers Menu
      And clicks on customers Menu item
      And Enters customer Email
      When clicks on search button
      Then User should find Email in the search table
      And closes browser


