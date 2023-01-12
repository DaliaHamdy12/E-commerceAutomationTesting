@Run
Feature: user should be able to add different products to compare list
  Background:user could log in with valid account
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user add different products to compare list
    When user add Apple MacBook to compare list
    And user click on add to compare list button
    Then success message1
    When user add HP Spectre to compare list
    And user click on add to compare list button_2
    Then success message2
    When user add Lenovo laptop to compare list
    And user click on add to compare list button_3
    Then success message3
