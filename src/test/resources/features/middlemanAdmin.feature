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
    And user input data product name "susu ultramilk"
    And user input data unit "pcs"
    And user input data stock "20"
    And user input data price "5000"
    And user click on button add
    And user see alert success add product & click OK
    Then user can see success add product to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with invalid stock
    When user click button add product
    And user input data product image
    And user input data product name "susu ultramilk"
    And user input data unit "pcs"
    And user input data stock "e"
    And user input data price "5000"
    And user click on button add
    Then user see required alert on stock field "please enter a number"

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with invalid price
    When user click button add product
    And user input data product image
    And user input data product name "susu ultramilk"
    And user input data unit "pcs"
    And user input data stock "20"
    And user input data price "4,500"
    And user click on button add
    Then user see required alert on stock field "please enter a valid value"

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with registered product name
    When user click button add product
    And user input data product image
    And user input data registered product name "minyak telon"
    And user input data unit "pcs"
    And user input data stock "20"
    And user input data price "5000"
    And user click on button add
    And user see alert internal error add product & click OK
    Then user can back to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with empty image product field
    When user click button add product
    And user input data product name "susu ultramilk"
    And user input data unit "pcs"
    And user input data stock "20"
    And user input data price "5000"
    And user click on button add
    And user see alert error "failed get to file" & click OK
#    Then user can back to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with empty product name field
    When user click button add product
    And user input data product image
    And user input data product name ""
    And user input data unit "pcs"
    And user input data stock "20"
    And user input data price "5000"
    And user click on button add
    And user see alert alert error "wrong input" & click OK
#    Then user can back to dashboard

  @AddProductAdmin @Negative
  Scenario: Add product admin to dashboard with empty stock
    When user click button add product
    And user input data product image
    And user input data product name "susu ultramilk"
    And user input data unit "pcs"
    And user input data stock ""
    And user input data price "5000"
    And user click on button add
    And user see alert alert error "wrong input" & click OK
#    Then user can back to dashboard

 @UpdateProductAdmin @Positive
 Scenario: Update product admin with valid data
   When user click button edit product
   And user input data update product image
   And user input data update product name "susu indomilk"
   And user input data unit "pcs"
   And user input data stock "25"
   And user input data price "3500"
   And user click on button add
   And user see alert success add product & click OK
   Then user can see success add product to dashboard

















