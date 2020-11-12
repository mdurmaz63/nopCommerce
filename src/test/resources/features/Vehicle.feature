@vehicle
Feature: Create vehicle
  As a user, I want to be able to create vehicles

  Scenario: Create a vehicle
    Given user is on the landing page
    When user logs in with "storemanager85" and "UserUser123" credentials
    Then user navigates to "Fleet" and "Vehicles"
    And user clicks on the create car button
    Then user enters vehicles' information:
       |License Plate|Driver|Location|Model Year|Color|
       | test_plate  | SDET | Tampa  | 2020     |Blue |
       |Java_is_fun  |Developer| Chicago|2015   |Black|





