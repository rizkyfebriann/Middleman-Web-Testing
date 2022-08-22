@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login


  @AddProductAdmin @Positive
  Scenario: Add product user to my product
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "beras pulennn"
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user can see success add product to my product page

  @AddProductAdmin @Positive
  Scenario: Add product user to my product page with invalid stock
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "beras pulennn"
    And user input unit "pcs"
    And user input stock "e"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user see required alert please enter a number on stock field

  @AddProductAdmin @Positive
  Scenario: Add product user to my product page with invalid price
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "beras pulennn"
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5,000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user see required alert please enter a number on price field

  @AddProductAdmin @Positive
  Scenario: Add product admin to dashboard with registered product name
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "beras pulennn"
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
    And user see reuired alert internal error add product & click OK
    Then user back to my product page

  @AddProductAdmin @Negative
  Scenario: Add product user on my product page with empty image product field


  @AddProductAdmin @Negative
  Scenario: Add product user on my product page with empty product name field

  @AddProductAdmin @Negative
  Scenario: Add product user on my product page with empty stock

  @UpdateProductAdmin @Positive
  Scenario: Update product user with valid data

  @UpdateProductAdmin @Positive
  Scenario: Update product user without product image

  @UpdateProductAdmin @Positive
  Scenario: Update product user without product name

  @UpdateProductAdmin @Positive
  Scenario: Update product user without stock

  @UpdateProductAdmin @Positive
  Scenario: Update product user without unit

  @UpdateProductAdmin @Negative
  Scenario: Update product user with invalid data stock

  @UpdateProductAdmin @Negative
  Scenario: Update product user with invalid data price




