package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(css = "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successFull;

    /**
     * This method will verify Add User Text
     */
    public String getAddUserText() {
        log.info("Add User Text :" + addUserText.toString());
        return getTextFromElement(addUserText);
    }

    /**
     * This method will select Role
     */
    public void selectRoleAdmin(String key) {
        mouseHoverToElementAndClick(selectRole);
        typeKeysAndEnter(key.split("")[0]);
        log.info("Select Role :" + selectRole.toString());
    }

    /**
     * This method will enter employee name
     */
    public void setEmployeeName(String eName) {
        sendTextToElement(employeeName, eName);
        log.info("Employee Name :" + employeeName.toString());
    }

    /**
     * This method will enter username
     */
    public void setUsername(String uName) {
        sendTextToElement(userName, uName);
        log.info("Enter Username :" + userName.toString());
    }

    /**
     * This method will select status
     */
    public void selectStatus(String key) {
        mouseHoverToElementAndClick(selectStatus);
        typeKeysAndEnter(key.split("")[0]);
        log.info("Select Status :" + selectStatus.toString());
    }

    /**
     * This method will enter password
     */
    public void setPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Enter password :" + password.toString());
    }


    /**
     * This method will enter confirm password
     */
    public void setConfirmPassword(String cPass) {
        sendTextToElement(confirmPassword, cPass);
        log.info("Enter confirm password :" + confirmPassword.toString());
    }

    /**
     * This method will click on save button
     */
    public void clickOnSaveButton() {
        clickOnElement(saveButton);
        log.info("Clicking on Save Button :" + saveButton.toString());
    }
    /**
     * This method will get successful message
     */
    public String getSuccessfulSavedMessage(){
        return getTextFromElement(successFull);
    }
}
