package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
  @Before
    public void setUp(Scenario scenario){
      System.out.println(scenario.getName());
      System.out.println("Before beginning executing the test scenario");
    }
    @Before("@scenario_1")
    public void specialSetUp(){
        System.out.println("Special hook before");
    }
    @After("@scenario_1")
    public void specialTearDown(){
        System.out.println("special hook after");
    }
    @After
    public void tearDown(){
        System.out.println("After executing the test scenario");
    }
}
