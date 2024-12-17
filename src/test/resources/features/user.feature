Feature:User Feature
  In Order to perform successful login
  As a User
  I can perform add, search,delete

  Background: I am on homepage

  @smoke @author_Payal
  Scenario: Admin Should Add User SuccessFully
    When I Enter the Username
    And I Enter the password
    And I click on the Login Button
    And I Click on the Admin Tab
    And I should see the System Users Text
    And I Click on the Add button
    And I should see the Add User Text
    And I Select User Role "Admin"
    And I Enter the Employee Name "Ananya Dash"
    And I Enter the new Username
    And I Select the status "Disable"
    And I Enter new password
    And I Enter the new Confirm Password
    And I Click on the Save Button
    Then I should see the message "Successfully Saved"

  @sanity
  Scenario: Search The User Created And Verify It
    When I Enter the Username
    And I Enter the password
    And I click on the Login Button
    And I Click on the Admin Tab
    And I should see the System Users Text
    And I Enter the new Username "<username>"
    And I Select the User Role "<userrole>"
    And I Select status "<Status>"
    And I click on the Search Button
    Then I should see the User should be in the Result list.

  @regression
  Scenario: Verify That Admin Should Delete The User SuccessFully
    When I Enter the Username
    And I Enter the password
    And I click on the Login Button
    And I Click on the Admin Tab
    And I should see the System Users Text
    And I Enter the new Username "<username>"
    And I Select the User Role "<userrole>"
    And I Select status "<Status>"
    And I click on the Search Button
    And I should see the User should be in the Result list.
    And I click on Check box
    And I click on Delete Button
    And I should see Popup will display
    And I click on the Ok Button on the Popup
    Then I shoud see the message "Successfully Deleted"

  @regression
  Scenario Outline: Search The User And Verify The Message RecordFound
    When I Enter the Username
    And I Enter the password
    And I click on the Login Button
    And I Click on the Admin Tab
    And I should see the System Users Text
    And I Enter the new Username "<username>"
    And I Select the User Role "<userrole>"
    And I Enter EmployeeName "<employeeName>"
    And I Select status "<Status>"
    And I click on the Search Button
    And I should see new the message "(1) Record Found"
    And I should see the username "<username>"
    Then I click on the Reset Tab

    Examples:
      | username     | userrole | employeeName  | Status |
      | Admin        | Admin    | Paul Collings | Enable |
      | Cassidy.Hope | ESS      | Cassidy Hope  | Enable |
      | Nina.Patel   | ESS      | Nina Patel    | Enable |
      | Odis.Adalwin | Admin    | Odis Adalwin  | Enable |

