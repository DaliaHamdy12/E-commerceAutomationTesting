@Run
Feature: User should be able to reset password successfully

  Scenario: user reset his/her password successfully

    Given user navigate to login page
    And user click on forget password link
    When user fills his Email
    And user click on Recover button
    Then A message is Displayed to user