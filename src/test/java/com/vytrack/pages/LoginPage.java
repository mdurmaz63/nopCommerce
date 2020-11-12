package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver = Driver.getDriver();

    @FindBy(id = "prependedInput")
    public WebElement userNameElement;
    @FindBy(id = "prependedInput2")
    public WebElement passwordElement;
    @FindBy (id = "_submit")
    public WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    public void login(String url, String username, String password){
        driver.get(url);
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginBtn.click();
    }
}
