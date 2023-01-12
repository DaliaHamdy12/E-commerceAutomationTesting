@Run
Feature: user should be able to Create a successful Order
  Background: user login with valid data
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully


  Scenario: user create a successful Order
    And user click on shopping cart link
    And user choose to wrapped his order as a gift
    And user check on the agreement checkBox
    When user click on checkout button
    And user fills all mandatory fields
    Then user click on continue button
    And user select ground option and click continue button
    And user select money option and click continue
    And user click continue button4
    And user click confirm button
