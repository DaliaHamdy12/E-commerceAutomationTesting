@Run
Feature: User should be able to switch between currencies US-Euro
  Background:user could log in with valid credentials
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: logged user could switch between currencies

    When logged user choose Euro from dropdown menu
    Then user choose Euro successfully
    And user choose US Dollar from dropdown menu
    Then user choose US Dollar successfully