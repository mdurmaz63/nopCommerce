package com.nopCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {


    public WebDriver ldriver;
    public AddCustomerPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    By lnkCustomers_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
    By lnkCustomers_menuitem = By.xpath("//span[@class= 'menu-item-title'][contains(text(), 'Customers')]");
    By btnAddNew = By.xpath("//a[@class= 'btn bg-blue']");

    By txtEmail = By.xpath("//input[@id='Email']");
    By txtPassword = By.xpath("//input[@id= 'Password']");

    By btnLogin = By.xpath( "//input[@value='Log in']");

    By txtCustomerRoles= By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");

    By lsItemAdministrators = By.xpath("//li[contains(text(),'Administrators')]");
    By lsItemRegistered = By.xpath("//li[contains(text(), 'Registered')]");

    By lsItemGuests = By.xpath("//li[contains(text(),'Guests')]");
    By lsItemVendors= By.xpath("//li[contains(text(),'Vendors')]");

    By drpmgrOfVendor=By.xpath("//*[@id='VendorId']");
    By rdMaleGender=By.id("Gender_Male");
    By rdFemaleGender=By.id("Gender_Female");


    By txtFirstName=By.xpath("//*[@id='FirstName']");
    By txtLastName=By.xpath("//*[@id='LastName']");

    By textDob=By.xpath("//input[@id='DateOfBirth']");

    By txtCompanyName=By.xpath("//input[@id='Company']");

    By txAdminContent=By.xpath("//textarea[@id='AdminComment']");

    By btnSave=By.xpath("//button[@name='save']");

    // Action Methods:
    public String getPageTitle(){
        return ldriver.getTitle();
    }
    public void clickOnCustomersMenu(){
        ldriver.findElement(lnkCustomers_menu).click();
    }
    public void clickOnCustomersMenuItem(){
        ldriver.findElement(lnkCustomers_menuitem).click();
    }
    public void clickOnAddNew(){
        ldriver.findElement(btnAddNew).click();
    }
    public void setEmail(String email){
        ldriver.findElement(txtEmail).sendKeys(email);
    }
    public void setPassword(String password){
        ldriver.findElement(txtPassword).sendKeys(password);
    }
    public void clickLogin(){
      ldriver.findElement(btnLogin).click();
    }
    public void setCustomerRoles(String role) throws InterruptedException{
        if(!role.equals("Vendors")){
            ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
        }
        ldriver.findElement(txtCustomerRoles).click();

        WebElement listItem;

        Thread.sleep(3000);

       // ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]/span")).click();
        Thread.sleep(2000);
        if(role.equals("Administrators")){
            listItem=ldriver.findElement(lsItemAdministrators);
        }else if(role.equals("Guests")){
            listItem=ldriver.findElement(lsItemGuests);
        }else if(role.equals("Registered")){
            listItem=ldriver.findElement(lsItemRegistered);
        }else if (role.equals("Vendors")){
            listItem=ldriver.findElement(lsItemVendors);
        }else{
            listItem=ldriver.findElement(lsItemGuests);
        }
        //listItem.click();
        //Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)ldriver;
        js.executeScript("arguments[0].click();",listItem);

    }
    public void setManagerOfVendor(String value){
        Select drp = new Select(ldriver.findElement(drpmgrOfVendor));
        drp.selectByVisibleText(value);
    }
    public void setGender(String gender){
        if(gender.equals("Male")){
            ldriver.findElement(rdMaleGender).click();
        }else if(gender.equals("Female")){
            ldriver.findElement(rdFemaleGender);
        }else{
            ldriver.findElement(rdMaleGender).click(); //default
        }
    }
    public void setFirstName(String fname){
        ldriver.findElement(txtFirstName).sendKeys(fname);
    }
    public void setLastName(String lname){
        ldriver.findElement(txtLastName).sendKeys(lname);
    }
    public void setDOB(String dob){
        ldriver.findElement(textDob).sendKeys(dob);
    }
    public void setCompanyName(String comname){
        ldriver.findElement(txtCompanyName).sendKeys(comname);
    }
    public void setAdminContent(String content){
        ldriver.findElement(txAdminContent).sendKeys(content);
    }
    public void clickOnSave(){
        ldriver.findElement(btnSave).click();
    }


}
