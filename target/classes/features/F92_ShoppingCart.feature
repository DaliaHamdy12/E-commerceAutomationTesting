@Run
Feature: user should be able to add different products to Shopping cart
  Background:user could login with valid account
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user could add different products to shopping cart
    When user add Apple MacBook to the cart
    And user click on add to the cart button
    Then success message appear
    When user add Laptop Samsung to the cart
    And user click on add to the cart button_2
    Then success message appear_2
    When user add gift card to the cart
    And user fills the mandatory fields
    And user click on add to tha cart button_3
    Then success message appear_3