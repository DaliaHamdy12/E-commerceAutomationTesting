@Run
Feature: User should be able to register with valid data

  Scenario: user sign up with new account

    Given user navigate to home page
    And user click on register link
    When user enter valid data
    And user click on register button
    Then success message is displayed
