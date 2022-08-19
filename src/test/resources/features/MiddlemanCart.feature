@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

  @AddToCart
  Scenario: Add Product To Cart
    When user click button add
    And user see alert sucsess add to cart & click OK
    And user click My Cart
    Then user can see the shopping cart added
