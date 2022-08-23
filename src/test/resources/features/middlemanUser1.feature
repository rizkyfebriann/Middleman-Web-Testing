@Web
Feature: Login

  Background: login user with registered valid email & valid password
    Given user input email "tokomom@gmail.com" and password "coba2123"
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
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data name "toko ernawt123"
    And user input data email "ernatoko1@gmail.com"
    And user input data phone number "081234566661"
    And user input data address "jalan cinta"
    And user click edit button
    Then user can see sucsess edit profile and klik ok

#    BUG
  @user
  Scenario: Update user with phone number not valid
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data name "toko ernawt123"
    And user input data email "ernatoko1@gmail.com"
    And user input data phone number "081234"
    And user input data address "jalan cinta"
    And user click edit button
    And user can see alert phone number less then ten digit & click OK
#    Then user stay in the pop up edit profile
    Then user should be redirect to page my profile

  @user
  Scenario: Update user with already registered email
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data name "toko coba2"
    And user input data email "tokomom@gmail.com"
    And user input data phone number "0812345666613"
    And user input data address "jalan cinta"
    And user click edit button
    And user see alert your email or phone number already registered & click OK
    Then user should be redirect to page my profile

  @user
  Scenario: Update user with email not valid
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data name "toko ernawt123"
    And user input data email "ernatoko1gmail.com"
    And user input data phone number "081234566661"
    And user input data address "jalan cinta"
    And user click edit button
    Then user see alert on email field for filling email

  @user
  Scenario: Update user with empty name
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data empty name ""
    And user click edit button
    Then user stay in the pop up edit profile

  @user
  Scenario: Update user with empty email
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data empty email ""
    And user click edit button
    Then user stay in the pop up edit profile

  @user
  Scenario: Update user with empty phone
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data empty phone number ""
    And user click edit button
    Then user stay in the pop up edit profile

  @user
    Scenario: Update user with empty address
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data empty address ""
    And user click edit button
    Then user stay in the pop up edit profile

  @user
  Scenario: Update user with name shop using one characters
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data name with one char "e"
    And user click edit button
    And user see alert name minimal format two character & click OK
#    Then user stay in the pop up edit profile

  @user
  Scenario: Update user with name shop using 2 characters or more
    When user open page my profile and click button edit
    And user can see pop up edit profile
    And user input data name with one char "eee"
    And user click edit button
    And user can see sucsess edit profile and klik ok

  @user
  Scenario: Cancel delete user
    When user open page my profile and click button delete
    And user can see pop up verifikasi delete
    And user choose button no
    Then user should be redirect to page my profile

#    Dijalankan Ganti Login
#  @user
#  Scenario: Delete user with already registed
#    When user open page my profile and click button delete
#    And user can see pop up verifikasi delete
#    And user choose button yes
#    And user see alert success delete data and klik ok
#    Then user can see redirect to login page









