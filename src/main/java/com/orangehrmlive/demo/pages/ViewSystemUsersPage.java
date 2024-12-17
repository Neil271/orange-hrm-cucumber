package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div[@role='row']/div[2]")
    WebElement resultList;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectUserRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(css = "div[class='oxd-table-card-cell-checkbox'] i[class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkbox;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(xpath = "//div[@role='document']")
    WebElement popUp;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement okAlert;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successFull;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement oneRecordFound;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    /**
     * This method will click on search button
     */
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
        log.info("Clicking on search button :"+searchButton.toString());
    }
    /**
     * This method will verify user in result list
     */
    public String getUserInResultList(){
        log.info("User in result list :"+resultList.toString());
       return getTextFromElement(resultList);
    }
    /**
     * This method will select Role
     */
    public void selectRole(String key){
        mouseHoverToElementAndClick(selectUserRole);
        typeKeysAndEnter(key.split("")[0]);
        log.info("Select Role :"+selectUserRole);
    }

    /**
     * This method will enter employee name
     */
    public void enterEmployeeName(String eName){
        sendTextToElement(employeeName,eName);
        log.info("Enter EmployeeName :"+employeeName.toString());
    }

    /**
     * This method will enter user name
     */
    public void setUserName(String uname){
        sendTextToElement(userName,uname);
        log.info("Enter User name :"+userName.toString());
    }

    /**
     * This method will select status
     */
    public void selectStatus(String key){
        mouseHoverToElementAndClick(selectStatus);
        typeKeysAndEnter(key.split("")[0]);
        log.info("Select Status :"+selectStatus.toString());
    }
    /**
     * This method will click on checkbox
     */
    public void clickOnCheckbox(){
        clickOnElement(checkbox);
        log.info("Clicking on checkbox :"+checkbox.toString());
    }
    /**
     * This method will click delete button
     */
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
        log.info("Clicking on delete button :"+deleteButton.toString());
    }
    /**
     * This method will display pop up
     */
    public void popUpDisplay(){
        verifyThatElementIsDisplayed(popUp);
        log.info("Pop will display :"+popUp.toString());
    }
    /**
     * This method will click ok on pop up
     */
    public void clickOkOnPopUP(){
        clickOnElement(okAlert);
        log.info("Clicking ok on the pop up :"+okAlert.toString());
    }
    /**
     * This method will get delete message
     */
    public String getDeleteMessageSuccessful(){
        return getTextFromElement(successFull);
    }
    /**
     * This method will click on reset button
     */
    public void clickOnResetButton(){
        clickOnElement(resetButton);
        log.info("Clicking on reset button");
    }
    /**
     * This method will get one record found message
     */
    public String getOneRecordFoundMessage(){
        log.info("One Record Found :"+oneRecordFound.toString());
        return getTextFromElement(oneRecordFound);
    }

}
