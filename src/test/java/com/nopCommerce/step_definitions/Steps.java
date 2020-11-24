package com.nopCommerce.step_definitions;


import com.nopCommerce.pages.AddCustomerPage;
import com.nopCommerce.pages.LoginPage;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Steps extends  BaseClass{

    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {
    //  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver");driver= new ChromeDriver();
        driver = new ChromeDriver();
        lp =new LoginPage(driver);
    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) throws InterruptedException {
    lp.setUserName(email);
    lp.setPassword(password);

    }
    @When("User clicks on Login")
    public void user_clicks_on_login() {
    lp.clickLogin();

    }
    @Then("Page Title should be {string}")
    public void page_title_should_be_dashboard_nop_commerce_administration(String titleAfterLogin) {
            Assert.assertEquals(titleAfterLogin, driver.getTitle());
        }
    @When("User clicks on Log out link")
    public void user_clicks_on_log_out_link()  {
        lp.clickLogout();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be (String titleAfterLogout) {

            Assert.assertEquals(titleAfterLogout, driver.getTitle());
        }

    @Then("closes browser")
    public void closes_browser() {
        lp.closeBrowser();


    }
    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        addCustomer = new AddCustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCustomer.getPageTitle());
    }

    //Steps for Adding a new Customer:

    @When("User clicks on customers Menu")
    public void user_clicks_on_customers_menu() throws InterruptedException {
        Thread.sleep(3000);
        addCustomer.clickOnCustomersMenu();

    }
    @And("clicks on customers Menu item")
    public void clicks_on_customers_menu_item() throws InterruptedException{
        Thread.sleep(2000);
        addCustomer.clickOnCustomersMenuItem();
    }
    @And("clicks on Add new button")
    public void clicks_on_add_new_button() throws InterruptedException{
        addCustomer.clickOnAddNew();
        Thread.sleep(2000);
    }
    @Then("User can view Add new customer page")
    public void user_can_view_add_new_customer_page() {
        Assert.assertEquals("Add a new customer / nopCommerce administration",addCustomer.getPageTitle());
    }
    @When("User enters customer info")
    public void user_enters_customer_info() throws InterruptedException{
        String email= randomstring()+"@gmail.com";
        addCustomer.setEmail(email);
        addCustomer.setPassword("test123");
        //Registered - default
        //The customer cannot be in both 'Guests' and 'Registered' customer roles
            //Add the customer to 'Guests' or 'Registered' customer role
        addCustomer.setCustomerRoles("Guests");

        Thread.sleep(3000);

        addCustomer.setManagerOfVendor("Vendor 2");
        addCustomer.setGender("Male");
        addCustomer.setFirstName("Ibrahim");
        addCustomer.setLastName("Demir");
        addCustomer.setDOB("12/14/1986"); //Format: M/DD/YYY
        addCustomer.setCompanyName("BusySDET");
        addCustomer.setAdminContent("This is an automated test...");

    }
    @And("user clicks on Save button")
    public void user_clicks_on_save_button() throws InterruptedException {
        addCustomer.clickOnSave();
        Thread.sleep(2000);
    }
    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String messageContent) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
                .contains("The new customer has been added successfully."));
    }

    //Step for searching an existing Customer using EmailID:
    @When("Enters customer Email")
    public void enters_customer_email() {

    }

    @And("clicks on search button")
    public void clicks_on_search_button() {

    }
    @Then("User should find Email in the search table")
    public void user_should_find_email_in_the_search_table() {

    }


}



