@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

#sukses
  @AddProductUser @Positive
  Scenario: Add product user to my product
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input new product name "beras pulennn" with random suffix
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user can see success add product to my product page

 #Sukses
  @AddProductUser @Positive
  Scenario: Add product user to my product page with invalid stock
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input new product name "beras pulennn" with random suffix
    And user input unit "pcs"
    And user input stock "e"
    And user input price "5000"
    And user click on button add product
    Then user should stay in the Add Product pop up

#Sukses, tapi harusnya error?
  @AddProductUser @Positive
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
  @AddProductUser @Negative
  Scenario: Add product user on my product page with empty image product field
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input new product name "beras pulennn" with random suffix
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
      # check alert text
    And user can see alert with message "failed to get file" & click OK
    Then user back to my product page

#Sukses
  @AddProductUser @Negative
  Scenario: Add product user with empty product name
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
    And user can see alert with message "wrong input" & click OK
    Then user back to my product page

#Sukses
  @AddProductUser @Negative
  Scenario: Add product user with empty stock
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input new product name "beras pulennn" with random suffix
    And user input unit "pcs"
    And user input price "5000"
    And user click on button add product
    And user can see alert with message "wrong input" & click OK
    Then user back to my product page

#Sukses, tapi harusnya error?
  @AddProductUser @Negatif
  Scenario: Add product user with name product using one character
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input new product name "a" with random suffix
    And user input unit "pcs"
    And user input stock "4"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user back to my product page

#Sukses, tapi harusnya error?
  @AddProductUser @Positive
  Scenario: Add product user with name product numeric
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input new product name "12345" with random suffix
    And user input unit "pcs"
    And user input stock "4"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user back to my product page

#Sukses, tapi harusnya error?
  @AddProductUser @Positive
  Scenario: Add product user with name product using special character
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user input new product name "beras@!" with random suffix
    And user input unit "pcs"
    And user input stock "4"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user back to my product page

# Sukses
  @AddProductUser @Positive
  Scenario: Update product user with valid data
    Given user go to page my product
    And user will see my product page
    When user click on button edit in a product list index 1
    And user input product image
    And user edit new product name "beras pulennn" with random suffix
    And user edit unit "pcs"
    And user edit stock "4"
    And user edit price "5000"
    And user click on button edit
    And user can see alert with message "success update data" & click OK
    Then user success update product to my product page

  @AddProductUser @Positive
  Scenario: Update product user without product image

  @AddProductUser @Positive
  Scenario: Update product user without product name

  @AddProductUser @Positive
  Scenario: Update product user without stock

  @AddProductUser @Positive
  Scenario: Update product user without unit
    Given user go to page my product
    And user will see my product page
    When user click on button edit in a product list index 1
    And user input product image
    And user edit new product name "beras pulennn" with random suffix
    And user clear unit
    And user edit stock "4"
    And user edit price "5000"
    And user click on button edit
    # Ini belom di implementasi, harus check XPath buat dialog boxnya
    Then user should stay in the Edit Product pop up

  @AddProductUser @Negative
  Scenario: Update product user with invalid data stock

  @AddProductUser @Negative
  Scenario: Update product user with invalid data price

  @SearchProductUser @Positive
  Scenario: Search product user with valid name

  @SearchProductUser @Positive
  Scenario: Search product on name field with any alphabet

  @SearchProductUser @Negative
  Scenario: Search product with one character

  @SearchProductUser @Positive
  Scenario: Search product on name field with any alphabet

  @SearchProductUser @Negative
  Scenario: Search product with any special chart

  @SearchProductUser @Negative
  Scenario: Search product with any numeric

  @DeleteProductUser @Positive
  Scenario: Delete cancel product success




