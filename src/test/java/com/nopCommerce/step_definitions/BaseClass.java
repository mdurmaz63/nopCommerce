package com.nopCommerce.step_definitions;

import com.nopCommerce.pages.AddCustomerPage;
import com.nopCommerce.pages.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    public WebDriver driver;
    public LoginPage lp;
    public AddCustomerPage addCustomer;

    public static String randomstring(){
        String generatedString1= RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }

}
