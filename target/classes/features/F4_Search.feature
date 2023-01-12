@Run
Feature: User should be able to search for any product
  Background:user could log in with valid credentials
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user search for any product

    When user click on search field
    And user search with name of product
    Then user find relative results