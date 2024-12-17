package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminTab;

    /**
     * This method will get Dashboard message
     */
    public String verifyDashboardMessage() {
        log.info("Dashboard Text :" + dashboard.toString());
        return getTextFromElement(dashboard);
    }

    /**
     * This method will verify logo is display
     */
    public void verifyLogoIsDisplayed() {
        verifyThatElementIsDisplayed(logo);
        log.info("Logo is display :" + logo.toString());
    }

    /**
     * This method will click on user profile logo
     */
    public void userProfileLogo() {
        clickOnElement(userProfileLogo);
        log.info("Clicking on user profile logo :" + userProfileLogo.toString());
    }

    /**
     * This method will mouse hover and click on logout
     */
    public void clickOnLogout() {
        mouseHoverToElementAndClick(logoutButton);
        log.info("Mouse hover and click on logout :" + logoutButton.toString());
    }

    /**
     * This method will click on Admin Tab
     */
    public void clickOnAdminTab() {
        clickOnElement(adminTab);
        log.info("Clicking on admin tab :" + adminTab.toString());
    }
}
