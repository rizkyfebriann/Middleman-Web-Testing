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

 #Sukses
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
    Then user should stay in the Add Product pop up

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
    And user see alert success add product & click OK
    Then user back to my product page

 #sukses
  @AddProductAdmin @Negative
  Scenario: Add product user on my product page with empty image product field
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product name "beras pulennn"
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
      # check alert text
    And user can see alert internal error with alert "failed to get file" add product & click OK
    Then user back to my product page

  @AddProductAdmin @Negative
  Scenario: Add product user with empty product name
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name ""
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
    And user can see alert error & click OK
    Then user back to my product page

  @AddProductAdmin @Negative
  Scenario: Add product user with empty stock
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "beras pulennn"
    And user input unit "pcs"
    And user input stock "3"
    And user input price "5000"
    And user click on button add product
    And user can see alert error & click OK
    Then user back to my product page

  @AddProductAdmin @Negatif
  Scenario: Add product user with name product using one character
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "a"
    And user input unit "pcs"
    And user input stock "4"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user back to my product page

  @AddProductAdmin @Positive
  Scenario: Add product user with name product numeric
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "12345"
    And user input unit "pcs"
    And user input stock "4"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user back to my product page

  @AddProductAdmin @Positive
  Scenario: Add product user with name product using special character
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "beras@!"
    And user input unit "pcs"
    And user input stock "4"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user back to my product page


  @UpdateProductAdmin @Positive
  Scenario: Update product user with valid data
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input product name "beras pulen"
    And user input unit "pcs"
    And user input stock "4"
    And user input price "5000"
    And user click on button edit
    And user see alert success add product & click OK
    Then user success update product to my product page

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

  @SearchProductAdmin @Positive
  Scenario: Search product user with valid name

  @SearchProductAdmin @Positive
  Scenario: Search product on name field with any alphabet

  @SearchProductAdmin @Negative
  Scenario: Search product with one character

  @SearchProductAdmin @Positive
  Scenario: Search product on name field with any alphabet

  @SearchProductAdmin @Negative
  Scenario: Search product with any special chart

  @SearchProductAdmin @Negative
  Scenario: Search product with any numeric

  @DeleteProductAdmin @Positive
  Scenario: Delete cancel product success




