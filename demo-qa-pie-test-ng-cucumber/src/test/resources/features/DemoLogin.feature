@demo @login
Feature: Login

  @ui @smoke
  Scenario: Positive Test
    Given user is on the login page
    When user enters username and password
    And user clicks on [Login] button
    Then user is on the inventory page

  @ui @smoke
  Scenario Outline: Negative Test
    Given user is on the login page
    When user attempts to enter username and password
      | username | <username> |
      | password | <password> |
    And user clicks on [Login] button
    Then users sees the error message
      | error | <error> |

    Examples: 
      | username        | password     | error                                                                     |
      |                 | invalid_pass | Epic sadface: Username is required                                        |
      | invalid_user    |              | Epic sadface: Password is required                                        |
      |                 |              | Epic sadface: Username is required                                        |
      | standard_user   | invalid_pass | Epic sadface: Username and password do not match any user in this service |
      | invalid_user    | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
