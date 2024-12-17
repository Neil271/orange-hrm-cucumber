package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashboardStep {
    @Then("I should see the Logo is Displayed")
    public void iShouldSeeTheLogoIsDisplayed() {
        new DashboardPage().verifyLogoIsDisplayed();
    }

    @And("I click on the User Profile logo")
    public void iClickOnTheUserProfileLogo() {
        new DashboardPage().userProfileLogo();
    }


    @And("I mouse hover on Logout and click")
    public void iMouseHoverOnLogoutAndClick() {
        new DashboardPage().clickOnLogout();
    }

    @And("I Click on the Admin Tab")
    public void iClickOnTheAdminTab() {
        new DashboardPage().clickOnAdminTab();
    }

}
