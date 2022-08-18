@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

  @user
  Scenario Outline: Update user with all valid data on json file
    Given user click button profile
#    And user can see pop up menu
    And user choose button my profile
    Then user will be redirect to page my profile
    And user click button edit
    And user can see pop up edit profile
    And user input name "<name>"
    And user input email1 "<email>"
    And user input phone number1 "<phone>"
#    And user input password1 "<password>"
    And user input address1 "<address>"
    And user click edit button
    Then user can se sucsess edit profile and klik ok
#    Then user will be redirect to page my profile
    Examples:
      |name    |email                |phone        |address     |
      |toko ernawt12|ernatoko1@gmail.com|081234566661|jalan cinta|

  @user
  Scenario Outline: Update user without properti name
    Given user click button profile
#    And user can see pop up menu
    And user choose button my profile
    Then user will be redirect to page my profile
    And user click button edit
    And user can see pop up edit profile
    And user input name "<name>"
    And user input email1 "<email>"
    And user input phone number1 "<phone>"
#    And user input password1 "<password>"
    And user input address1 "<address>"
    And user click edit button
    Then user see required alert on username field
    Examples:
      |name    |email                |phone        |address     |
      |       |ernatoko1@gmail.com|081234566661|jalan cinta|










