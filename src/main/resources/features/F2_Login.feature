@Run
Feature: User should be able to log in with valid email and password

  Scenario:  user login with valid data

    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully