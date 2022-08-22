@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login


  @AddProductAdmin @Positive
  Scenario: Add product user to my product
#    Given user go to page my product
    When click button add on page my product
    And user input product image
    And user input product name "susu ultramilk"
    And user input unit "pcs"
    And user input stock "20"
    And user input price "5000"
    And user click on button add product
    And user see alert success add product & click OK
    Then user can see success add product to my product page


