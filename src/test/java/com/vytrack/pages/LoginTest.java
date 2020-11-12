package com.vytrack.pages;

import com.vytrack.utils.ConfigurationReader;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginTest extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Test
    public void login(){
        String url = ConfigurationReader.getProperty("url");
        String username = ConfigurationReader.getProperty("storemanager.username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(url,username,password);

    }

}
