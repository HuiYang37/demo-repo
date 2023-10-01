@demo @login
Feature: Login

  @ui @smoke @ut
  Scenario: Positive Test
    Given user is on the login page
    When user enters username and password
      | username | standard_user |
      | password | secret_sauce  |
    And user clicks on [Login] button
    Then user is on the inventory page
