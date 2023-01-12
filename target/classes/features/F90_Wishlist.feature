@Run
Feature: user should be able to add different products to Wishlist
  Background:user could log in with valid credentials
    Given user navigate to home page
    And user click on login link
    When user enter valid email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user could add different products to wishlist
    When user add Apple MacBook to wishlist
    And user click on add to wishlist button
    Then success message_1
    When user add Laptop Samsung to wishlist
    And user click on add to wishlist button_2
    Then success message_2
    When user add HP laptop to wishlist
    And user click on add to tha wishlist button_3
    Then success message_3