package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement errorMessage;

    //create appropriate methods

    /**
     * This method will enter user name
     */
    public void enterUserName(String uName) {
        sendTextToElement(userName, uName);
        log.info("Enter User Name :" + userName.toString());
    }

    /**
     * This method will enter password
     */
    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Enter Password :" + password.toString());
    }

    /**
     * This method will click on login button
     */
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on the login button");
    }

    /**
     * This method will get error message
     */
    public String getErrorMessage() {
        log.info("Error Message :" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
