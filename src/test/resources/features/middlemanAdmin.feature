@Web
Feature: admins
  Background: login admin with registered valid email & valid password
    Given user input email "adminqe@gmail.com" and password "qwe123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login


  @AddProductAdmin @Positive
   Scenario: Add product admin to dashboard
    When user click button add product
    And user input data product image
    And user input data product name "Aqua Gelas"
    And user input data unit "dus"
    And user input data stock "15"
    And user input data price "24000"
    And user click on button add
    And user see alert success add product & click OK
    Then user can see success add product to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with invalid stock
    When user click button add product
    And user input data product image
    And user input data product name "Aqua Gelas"
    And user input data unit "dus"
    And user input data stock "e"
    And user input data price "20000"
    And user click on button add
    Then user see required alert on stock field "please enter a number"

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with invalid price
    When user click button add product
    And user input data product image
    And user input data product name "Aqua Gelas"
    And user input data unit "dus"
    And user input data stock "25"
    And user input data price "4,500"
    And user click on button add
    Then user see required alert on stock field "please enter a valid value"

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with registered product name
    When user click button add product
    And user input data product image
    And user input data registered product name "Aqua Gelas"
    And user input data unit "dus"
    And user input data stock "20"
    And user input data price "20000"
    And user click on button add
    And user see alert internal error add product & click OK
    Then user can back to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with empty image product field
    When user click button add product
    And user input data product name "Aqua Gelas"
    And user input data unit "dus"
    And user input data stock "20"
    And user input data price "20000"
    And user click on button add
    And user see required alert on image product field "please select a file"
    Then user can back to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with empty product name field
    When user click button add product
    And user input data product image
    And user input data empty product name ""
    And user input data unit "dus"
    And user input data stock "20"
    And user input data price "20000"
    And user click on button add
    And user see required alert on product name field "please fill out this field"
    Then user can back to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with empty stock
    When user click button add product
    And user input data product image
    And user input data product name "minyak sunco"
    And user input data unit "pcs"
    And user input data stock ""
    And user input data price "5000"
    And user click on button add
    And user see required alert on stock field "please fill out this field"
    Then user can back to dashboard

 @UpdateProductAdmin @Positive
 Scenario: Update product admin with valid data
   When user click button edit product
   And user input data update product image
   And user input data update product name "Air mineral Aqua"
   And user input data update unit "dus"
   And user input data update stock "30"
   And user input data update price "35000"
   And user click on  button update
   And user see alert success update product & click OK
   Then user can see success edit product to dashboard

  @UpdateProductAdmin @Positive
  Scenario: Update product admin without product image
    Given user click button edit product
    And user input data update product name "Air mineral Aqua"
    And user input data update unit "dus"
    And user input data update stock "30"
    And user input data update price "35000"
    And user click on  button update
    And user see alert success update product & click OK
    Then user can see success edit product to dashboard

  @UpdateProductAdmin @Positive
  Scenario: Update product admin without product name
    Given user click button edit product
    And user input data update product image
    And user input data update unit "dus"
    And user input data update stock "30"
    And user input data update price "48000"
    And user click on  button update
    And user see alert success update product & click OK
    Then user can see success edit product to dashboard

  @UpdateProductAdmin @Positive
  Scenario: Update product admin without stock
    Given user click button edit product
    And user input data update product name "Air mineral aqua"
    And user input data update product image
    And user input data update unit "dus"
    And user input data update price "45000"
    And user click on  button update
    And user see alert success update product & click OK
    Then user can see success edit product to dashboard

  @UpdateProductAdmin @Positive
  Scenario: Update product admin without price
    Given user click button edit product
    And user input data update product name "Air mineral aqua"
    And user input data update product image
    And user input data update unit "dus"
    And user input data update stock "30"
    And user click on  button update
    And user see alert success update product & click OK
    Then user can see success edit product to dashboard

  @UpdateProductAdmin @Positive
  Scenario: Update product admin without unit
    Given user click button edit product
    And user input data update product image
    And user input data update product name "Air mineral aqua"
    And user input data update stock "25"
    And user input data update price "3500"
    And user click on  button update
    And user see alert success update product & click OK
    Then user can see success edit product to dashboard


  @UpdateProductAdmin @Positive
  Scenario: Update product admin with empty data
    Given user click button edit product
    And user input data update product image
    And user input data update product name ""
    And user input data update unit ""
    And user input data update stock ""
    And user input data update price ""
    And user click on  button update
    And user see required alert on stock field "please fill out this field"


  @UpdateProductAdmin @Negative
  Scenario: Update product admin with invalid data stock
    Given user click button edit product
    And user input data update product image
    And user input data update product name "Air mineral aqua"
    And user input data update unit "kilogram"
    And user input data update stock "2,5"
    And user input data update price "3500"
    And user click on  button update
    Then user see required alert on stock field "please enter a valid value"

  @UpdateProductAdmin @Negative
  Scenario: Update product admin with invalid data price
    Given user click button edit product
    And user input data update product image
    And user input data update product name "Air mineral aqua"
    And user input data update unit "dus"
    And user input data update stock "25"
    And user input data update price "e"
    And user click on  button update
    Then user see required alert on stock field "please enter a number"

  @DeleteProductAdmin @Positive
  Scenario: Delete cancel product admin
    Given user click button delete
    And user click "No" on button delete product
    Then user can back to dashboard

#  @DeleteProductAdmin @Positive
#  Scenario: Delete success product admin
#    Given user click button delete
#    And user click "Yes" on button delete
#    And user see alert success delete product & click OK
#    Then user can see success delete product to dashboard

  @SearchProductAdmin @Positive
  Scenario: Search product admin with full valid keyword from product name
    Given user input valid keyword "beras" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @SearchProductAdmin @Positive
  Scenario: Search product with one alphabet contains from product name
    Given user input valid keyword "t" on search field
    And user click on button search
    Then user can see all result search product on dashboard

  @SearchProductAdmin @Negative
  Scenario: Search product with invalid keyword
    Given user input invalid keyword "qwerty" on search field
    And user click on button search
    Then user can see page data not found



















