@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login


  Scenario: User create order without unwanted product on My cart
    Given user click My Cart
    And user delete unwanted product
    And user see alert login success delete product & click OK
    And user click on button next for checkout
    And user see alert login success create order & click OK
    Then user can direct on payment page

  Scenario: User create order all product on My cart
    Given user click My Cart
    And user click on button next for checkout
    And user see alert login success create order & click OK
    Then user can direct on payment page

  Scenario: User can see detail history order
    Given user click history order
    And user click detail history
    Then user can see the desired order history details