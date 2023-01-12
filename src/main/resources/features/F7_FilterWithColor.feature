@Run
Feature: user should be able to filter with color
  Background:user could log in with valid credentials
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user could filter with color

    When user select a Apparel category then hover to Shoes subcategory
    And user select shoes subCategory
    Then filter by blue color
