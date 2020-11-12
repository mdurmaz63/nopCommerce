package com.vytrack.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
    }
    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        System.out.println("Trying to login as a store manager");
    }
    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() { System.out.println("Trying to log in as a sales manager"); }
    @When("user logs in as a driver")
    public void user_logs_in_as_a_driver() { System.out.println("Trying to log in as a driver"); }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.printf("Enter username %s, and password %s to login\n", username, password);
    }
    @Then("user should be able to see the Dashboard page title")
    public void user_should_be_able_to_see_the_dashboard_page_title() {
        System.out.println("I am able to see that page title is on Dashboard");}

}
