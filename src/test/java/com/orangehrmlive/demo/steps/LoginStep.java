package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStep {
    @When("I Enter the Username")
    public void iEnterTheUsername() {
        new LoginPage().enterUserName("Admin");
    }

    @And("I Enter the password")
    public void iEnterThePassword() {
        new LoginPage().enterPassword("admin123");
    }

    @And("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I shoud see the {string} Message")
    public void iShoudSeeTheMessage(String expected) {
        Assert.assertEquals(new DashboardPage().verifyDashboardMessage(), expected, "Dashboard message not displayed");
    }


    @Then("I should see the text Login Panel is displayed")
    public void iShouldSeeTheTextLoginPanelIsDisplayed() {

    }

    @When("I Enter username {string}")
    public void iEnterUsername(String uName) {
        new LoginPage().enterUserName(uName);
    }

    @And("I Enter password {string}")
    public void iEnterPassword(String p) {
        new LoginPage().enterPassword(p);
    }

    @Then("I should see the System Users Text")
    public void iShouldSeeTheErrorMessage() {
        String expectedMessage="System Users";
        Assert.assertEquals(new AdminPage().getSystemUsersText(), expectedMessage, "User not logged In");
    }
}
