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
    And user input stock " "
    And user input price "5000"
    And user click on button add product
    And user can see alert with message "wrong input" & click OK
    Then user back to my product page

#Sukses, tapi harusnya error?
  @AddProductUser @Positive
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

#Sukses, tapi harusnya error?
  @AddProductUser @Positive
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

#Sukses
  @AddProductUser @Positive
  Scenario: Add product user with name product using special character
    Given user go to page my product
    And user will see my product page
    When user click button add on page my product
    And user input product image
    And user edit new product name "beras@!" with random suffix
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

# Sukses
  @AddProductUser @Positive
  Scenario: Update product user without product image
    Given user go to page my product
    And user will see my product page
    When user click on button edit in a product list index 1
    And user edit new product name "beras pulennn" with random suffix
    And user edit unit "pcs"
    And user edit stock "4"
    And user edit price "5000"
    And user click on button edit
    And user can see alert with message "success update data" & click OK
    Then user success update product to my product page

# success
  @AddProductUser @Positive
  Scenario: Update product user without stock
    Given user go to page my product
    And user will see my product page
    When user click on button edit in a product list index 1
    And user input product image
    And user edit new product name "beras pulennn" with random suffix
    And user edit unit "pcs"
    And user edit price "5000"
    And user click on button edit
    And user can see alert with message "success update data" & click OK
    Then user success update product to my product page

## belum success
#  @AddProductUser @Positive
#  Scenario: Update product user with empty name
#    Given user go to page my product
#    And user will see my product page
#    When user click on button edit in a product list index 1
#    And user edit product image
#    And user clear name
##    And user edit unit "pcs"
##    And user edit stock "4"
##    And user edit price "5000"
#    And user click on button edit
#    Then user should stay in the Edit Product pop up

## belum success
#  @AddProductUser @Positive
#  Scenario: Update product user with empty unit
#    Given user go to page my product
#    And user will see my product page
#    When user click on button edit in a product list index 1
#    And user edit product image
#    And user edit new product name "beras pulennn" with random suffix
#    And user clear unit
#    And user edit stock "4"
#    And user edit price "5000"
#    And user click on button edit
#    # Ini belom di implementasi, harus check XPath buat dialog boxnya
#    Then user should stay in the Edit Product pop up

#  success
  @AddProductUser @Negative
  Scenario: Update product user with invalid data stock
    Given user go to page my product
    And user will see my product page
    When user click on button edit in a product list index 1
    And user input product image
    And user edit new product name "beras pulennn" with random suffix
    And user edit unit "pcs"
    And user edit stock "1,000"
    And user edit price "5000"
    And user click on button edit
    And user can see alert with message "success update data" & click OK
    Then user see required alert on stock field "please enter a valid value"

#    success
  @AddProductUser @Negative
  Scenario: Update product user with invalid data price
    Given user go to page my product
    And user will see my product page
    When user click on button edit in a product list index 1
    And user input product image
    And user edit new product name "beras pulennn" with random suffix
    And user edit unit "pcs"
    And user edit stock "1,000"
    And user edit price "a"
    And user click on button edit
    Then user see required alert on stock field "please enter a valid value"

  @SearchProductUser @Positive
  Scenario: Search product user with valid name
    Given user go to page my product
    And user will see my product page
    And user input valid keyword "bubur" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @SearchProductUser @Positive
  Scenario: Search product on name field with any numeric
    Given user go to page my product
    And user will see my product page
    And user input valid keyword "912" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @SearchProductUser @Positive
  Scenario: Search product with one character
    Given user go to page my product
    And user will see my product page
    And user input valid keyword "k" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @SearchProductUser @Positive
  Scenario: Search product on name field with any alphabet
    Given user go to page my product
    And user will see my product page
    And user input valid keyword "gula" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @SearchProductUser @Positive
  Scenario: Search product with any special chart
    Given user go to page my product
    And user will see my product page
    And user input valid keyword "@" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @SearchProductUser @Negatif
  Scenario: Search product with not registered product name
    Given user go to page my product
    And user will see my product page
    And user input valid keyword "terasi" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @DeleteProductUser @Positive
  Scenario: Delete cancel product success
    Given user go to page my product
    And user will see my product page
    When user click button delete
    And user click "No" on button delete product
    Then user can back to dashboard

#  command dulu kalo mau run semua
#  @DeleteProductUser @Positive
#  Scenario: Delete success product user
#    Given user go to page my product
#    And user will see my product page
#    When user click button delete
#    And user click "Yes" on button delete
#    And user see alert success delete product & click OK
#    Then user can see success delete product to dashboard




