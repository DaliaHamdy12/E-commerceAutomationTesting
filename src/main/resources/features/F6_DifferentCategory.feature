@Run
Feature: user should be able to select different Categories
  Background:user could log in with valid credentials
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user select different categories

    When user select Computer categories
    And user select a Electronics categories then hover to camera and photo subcategory
    And  user choose Gift Cards categories