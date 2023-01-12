@Run
Feature: user should be able to select different tags
  Background:user could log in with valid credentials
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user select different tags
    Given user click on Electronics
    When user select cool from popular tags
    And  user select digital from popular tags
    And user select game from popular tags
    And user select computer from popular tags