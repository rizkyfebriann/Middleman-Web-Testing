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

#  @user
#  Scenario Outline: Update user with all valid data on json file1
#    When user click button edit
#    And user can see pop up edit profile
#    And user input data name "<name>", email "<email>", phone number "<phone>", address "<address>"
#    And user click edit button
#    Then user can se sucsess edit profile and klik ok
#    Examples:
#      |name         |email              |phone       |address    |
#      |toko ernawt12|ernatoko1@gmail.com|081234566661|jalan cinta|


  @user
  Scenario: Update user with all valid data on json file1
    When user click button edit
    And user can see pop up edit profile
    And user input data name "toko ernawt123"
    And user input data email "ernatoko1@gmail.com"
    And user input data phone number "081234566661"
    And user input data address "jalan cinta"
    And user click edit button
    Then user can se sucsess edit profile and klik ok

#    BUG
  @user
  Scenario: Update user with phone number not valid
    When user click button edit
    And user can see pop up edit profile
    And user input data name "toko ernawt123"
    And user input data email "ernatoko1@gmail.com"
    And user input data phone number "081234"
    And user input data address "jalan cinta"
    And user click edit button
#    Then user stay in the pop up
    And user can see alert phone number less then ten digit & click OK
    Then user stay in the pop up edit profile

  @user
  Scenario: Update user with already registered email
    When user click button edit
    And user can see pop up edit profile
    And user input data name "toko coba2"
    And user input data email "tokocobalagi12@gmail.com"
    And user input data phone number "123457733343"
    And user input data address "jalan cinta"
    And user click edit button
    And user see alert your email or phone number already registered & click OK
    Then user stay in the pop up edit profile

  @user
  Scenario: Update user with email not valid
    When user click button edit
    And user can see pop up edit profile
    And user input data name "toko ernawt123"
    And user input data email "ernatoko1gmail.com"
    And user input data phone number "081234566661"
    And user input data address "jalan cinta"
    And user click edit button
    Then user see alert on email field for filling email

  @user
  Scenario: Update user with empty name
    When user click button edit
    And user can see pop up edit profile
    And user input data empty name " "
    And user click edit button
    Then user see alert name minimal format two character

  @user
  Scenario: Update user with empty email
    When user click button edit
    And user can see pop up edit profile
    And user input data empty email ""
    And user click edit button
    Then user can see pop up alert please fill out this field











#  @user
#  Scenario: Update user without properti name
#    When user click button edit
#    And user can see pop up edit profile
#    And user input name " "
#    And user input email "ernatoko1@gmail.com"
#    And user input phone number "081234566661"
#    And user input address "jalan cinta"
#    And user click edit button
#    Then user see required alert on username field
##    Examples:
##      |name    |email                |phone        |address     |
##      |toko ernawt12|ernatoko1@gmail.com|081234566661|jalan cinta|
#
#
#  @user
#  Scenario: Update user without empty phone
#    When user click button edit
#    And user can see pop up edit profile
#    And user input name "toko ernawt12"
#    And user input email "ernatoko1@gmail.com"
#    And user input phone number " "
#    And user input address "jalan cinta"
#    And user click edit button
#    Then user see required alert on username field