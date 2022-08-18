@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login
    And user click button profile
    And user choose button my profile
    Then user will be redirect to page my profile

  @user
  Scenario Outline: Update user with all valid data on json file1
    When user click button edit
    And user can see pop up edit profile
    And user input data name "<name>", email "<email>", phone number "<phone>", address "<address>"
    And user click edit button
    Then user can se sucsess edit profile and klik ok
    Examples:
      |name         |email              |phone       |address    |
      |toko ernawt12|ernatoko1@gmail.com|081234566661|jalan cinta|

  @user
  Scenario: Update user without properti name
    When user click button edit
    And user can see pop up edit profile
    And user input email "ernatoko1@gmail.com"
    And user input phone number "081234566661"
    And user input address "jalan cinta"
    And user click edit button
    Then user see required alert on username field
#    Examples:
#      |name    |email                |phone        |address     |
#      |toko ernawt12|ernatoko1@gmail.com|081234566661|jalan cinta|