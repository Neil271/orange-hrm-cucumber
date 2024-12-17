package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AdminStep {
    @And("I should see the {string} Text")
    public void iShouldSeeTheText(String expected) {
        Assert.assertEquals(new AdminPage().getSystemUsersText(), expected, "System Users text not displayed");
    }

    @And("I Click on the Add button")
    public void iClickOnTheAddButton() {
        new AdminPage().clickOnAddButton();
    }

    @And("I should see the Add User Text")
    public void iShouldSeeTheAddUserText() {
        String expectedText = "Add User";
        Assert.assertEquals(new AddUserPage().getAddUserText(), expectedText, "User not added");
    }


    @And("I Select User Role {string}")
    public void iSelectUserRole(String userRole) {
        new AddUserPage().selectRoleAdmin(userRole);
    }

    @And("I Enter the Employee Name {string}")
    public void iEnterTheEmployeeName(String eName) {
        new AddUserPage().setEmployeeName(eName);
    }

    /*@And("I Enter the new Username")
    public void iEnterTheNewUsername() {
        new AddUserPage().setUsername("Payal1");
    }*/

    @And("I Select the status {string}")
    public void iSelectTheStatus(String role) {
        new AddUserPage().selectStatus(role);
    }

    @And("I Enter new password")
    public void iEnterNewPassword() {
        new AddUserPage().setPassword("Ppp1234@");
    }

    @And("I Enter the new Confirm Password")
    public void iEnterTheNewConfirmPassword() {
        new AddUserPage().setConfirmPassword("Ppp1234@");
    }

    @And("I Click on the Save Button")
    public void iClickOnTheSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        Assert.assertEquals(new AddUserPage().getSuccessfulSavedMessage(), expectedMessage, "Message is not displayed");
    }

    @And("I Enter the new Username {string}")
    public void iEnterTheNewUsername(String u) {
        new ViewSystemUsersPage().setUserName(u);
    }

    @And("I click on the Search Button")
    public void iClickOnTheButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("I should see the User should be in the Result list.")
    public void iShouldSeeTheUserShouldBeInTheResultList(String expectedResult) {
        Assert.assertEquals(new ViewSystemUsersPage().getUserInResultList(), expectedResult, "User not found");

    }

    @And("I Select the User Role {string}")
    public void iSelectTheUserRole(String r) {
        new ViewSystemUsersPage().selectRole(r);
    }

    @And("I Select status {string}")
    public void iSelectStatus(String s) {
        new ViewSystemUsersPage().selectStatus(s);
    }

    @And("I click on Check box")
    public void iClickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckbox();
    }

    @And("I click on Delete Button")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("I should see Popup will display")
    public void iShouldSeePopupWillDisplay() {
        new ViewSystemUsersPage().popUpDisplay();
    }

    @And("I click on the Ok Button on the Popup")
    public void iClickOnTheOkButtonOnThePopup() {
        new ViewSystemUsersPage().clickOkOnPopUP();
    }

    @Then("I shoud see the message {string}")
    public void iShoudSeeTheMessage(String expected) {
        Assert.assertEquals(new ViewSystemUsersPage().getDeleteMessageSuccessful(), expected, "Message is not displayed");
    }

    @And("I Enter EmployeeName {string}")
    public void iEnterEmployeeName(String e) {

    }

    @And("I should see the username {string}")
    public void iShouldSeeTheUsername(String u) {
        new ViewSystemUsersPage().setUserName(u);

    }

    @Then("I click on the Reset Tab")
    public void iClickOnTheResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }

    @And("I should see new the message {string}")
    public void iShouldSeeNewTheMessage(String expected) {
        Assert.assertEquals(new ViewSystemUsersPage().getOneRecordFoundMessage(), expected, "Message not displayed");
    }
}
