Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Background: I am on homepage

  @smoke @author_Payal
  Scenario: Verify User Should Login SuccessFully
    When I Enter the Username
    And I Enter the password
    And I click on the Login Button
    Then I shoud see the "Dashboard" Message

  @sanity
  Scenario: Verify That The Logo Display On HomePage
    When I Enter the Username
    And I Enter the password
    And I click on the Login Button
    Then I should see the Logo is Displayed

  @regression
  Scenario: Verify User Should LogOut SuccessFully
    When I Enter the Username
    And I Enter the password
    And I click on the Login Button
    And I click on the User Profile logo
    And I mouse hover on Logout and click
    Then I should see the text Login Panel is displayed

  @regression
  Scenario Outline: Verify Error Message With Invalid Credentials
  When I Enter username "<username>"
  And I Enter password "<password>"
  And I click on the Login Button
  Then I should see the message "<errorMessage>"

  Examples:
    | username          | password | errorMessage        |
    |                   |          | Required            |
    | test123@gmail.com |          | Required            |
    |                   | test123  | Required            |
    | test123@gmail.com | test123  | Invalid credentials |
