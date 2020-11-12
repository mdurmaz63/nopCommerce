package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class CreateVehicleStepDefinitions {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("User is on  the landing page");
    }

    @When("user logs in with {string} and {string} credentials")
    public void user_logs_in_with_and_credentials(String string, String string2) {
        System.out.printf("User enters %s username and %s password\n", string, string2);

    }
    @Then("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        System.out.printf("User navigates to %s tab and %s module\n", string, string2);
    }
    @Then("user clicks on the create car button")
    public void user_clicks_on_the_create_car_button() {
        System.out.println("User clicks on the create car button");
    }
    @Then("user enters vehicles' information:")
    public void user_enters_vehicles_information(List<Map<String, String>> dataTable) {
//dataTable.forEach(p-> System.out.println(p));
        System.out.println("Driver: "+dataTable.get(0).get("Driver"));
        System.out.println("Location: "+dataTable.get(0).get("Location"));

    }
}
