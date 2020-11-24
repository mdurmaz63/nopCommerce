package com.nopCommerce.pages;

import com.utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class SearchCustomerPage {

    public WebDriver ldriver;
    WaitHelper waitHelper;
    public SearchCustomerPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper=new WaitHelper(ldriver);

    }

    @FindBy(how = How.ID, using= "SearchEmail")
    @CacheLookup
    WebElement txtEmail;

    @FindBy (how = How.ID, using = "SearchFirstName")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy (how = How.ID, using = "SearchLastName")
    @CacheLookup
    WebElement txtLastName;

    @FindBy(how = How.ID, using = "SearchMonthOfBirth")
    @CacheLookup
    WebElement drpdobMonth;

    @FindBy(how = How.ID, using = "SearchDayOfBirth")
    @CacheLookup
    WebElement getDrpdobDay;

    @FindBy(how = How.ID, using = "SearchCompany")
    @CacheLookup
    WebElement txtCompany;

    @FindBy(how = How.XPATH, using = "//div[@class= 'k-multiselect-wrap k-floatwrap']")
    @CacheLookup
    WebElement txtCustomerRoles;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Administrators')]")
    @CacheLookup
    WebElement lstitemAdmin;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Registered')]")
    @CacheLookup
    WebElement lstitemRegistered;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Guests')]")
    @CacheLookup
    WebElement lslstitemGuests;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Vendors')]")
    @CacheLookup
    WebElement lslstitemVendors;

    @FindBy(how = How.XPATH, using = "search-customers")
    @CacheLookup
    WebElement btnSearch;

    @FindBy(how = How.XPATH, using = "//table[@role='grid']")
    @CacheLookup
    WebElement tableSearchResults;

    @FindBy(how = How.XPATH, using = "//table[@role='customer-grid']")
    WebElement table;

    @FindBy(how = How.XPATH, using = "//table[@role='customer-grid']//tbody/tr")
    List<WebElement> tableRows;

    @FindBy(how = How.XPATH, using = "//table[@role='customer-grid']//tbody/td")
    List<WebElement> tableColumns;


    public void setEmail(String email){

        waitHelper.WaitForElement(txtEmail,30);
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void setFirstName(String fName){
        waitHelper.WaitForElement(txtFirstName, 30);
        txtFirstName.clear();
        txtFirstName.sendKeys(fName);
    }

    public void setLastname(String lName){

        waitHelper.WaitForElement(txtLastName, 30);
        txtLastName.clear();
        txtLastName.sendKeys(lName);
    }

    public void clickSearch(){
        btnSearch.click();
        waitHelper.WaitForElement(btnSearch, 30);
    }

    public int getNoOfRows(){
        return (tableRows.size());
    }

    public int getNoOfColumns(){
        return(tableColumns.size());
    }

    public boolean searchCustomerByEmail(String email){

        boolean flag = false;

        for(int i= 1; i<=getNoOfRows(); i++){
            WebElement emailid= table.findElement(By.xpath("//table[@role='customer-grid']//tbody/tr"));
            System.out.println(emailid);
            if(emailid.equals("victoria_victoria@nopCommerce.com")){
                flag=true;
            }
        }
        return flag;
    }


}
