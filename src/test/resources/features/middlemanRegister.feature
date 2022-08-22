@Web
Feature: Register

#Setelah running scenario ini, ganti email & passwordnya karena jika di run lagi.. sudah terdaftar
  @register
  Scenario Outline: Register with all valid data
    Given user open register page
    And user input name shop "<nameShop>"
    And user input email "<email>"
    And user input phone number "<phone>"
    And user input password "<password>"
    And user input address "<address>"
    Then user click sign up button
    And user see alert register success & click OK
    Then user redirect to login page for login account
  Examples:
    |nameShop    |email                |phone     |password     |address                  |
    |Toko Rizky 1|testingtoko3@mail.com|0808080808|test123      |Jalan Surabaya Nih No 100|
    |Toko Rizky 2|testingtoko4@mail.com|0811111222|test1234     |Jalan Surabaya Nih No 101|

  @register
  Scenario: Register with name shop using 1 characters
    Given user open register page
    And user input name shop "R"
    And user input email "testing01@mail.com"
    And user input phone number "08973839404"
    And user input password "test1234"
    And user input address "Jalan Surabaya Blok T"
    Then user click sign up button
    And user see alert name shop must be more than one characters & click OK

#Setelah running scenario ini, ganti email & passwordnya karena jika di run lagi.. sudah terdaftar
  @register
  Scenario: Register with name shop using 2 characters or more
    Given user open register page
    And user input name shop "Toko Rizky 3"
    And user input email "testing12@mail.com"
    And user input phone number "08973839567"
    And user input password "test1234"
    And user input address "Jalan Surabaya Blok T"
    Then user click sign up button
    And user see alert register success & click OK
    Then user redirect to login page for login account

  @register
  Scenario Outline: Register with non-formatted email
    Given user open register page
    And user input name shop "Toko Cuan"
    And user input email "<email>"
    And user input phone number "08574893829"
    And user input password "test123"
    And user input address "Jalan Surabaya Blok H Nomor 100"
    Then user click sign up button
    And user see alert on email field for filling valid format email
    Examples:
      |email        |
      |testing.co.id|
      |testing@.com |

#Setelah running scenario ini, ganti email & passwordnya karena jika di run lagi.. sudah terdaftar
  @register
  Scenario: Register with valid format email
    Given user open register page
    And user input name shop "Toko Rizky 4"
    And user input email "testing02@gmail.com"
    And user input phone number "08946538274"
    And user input password "test1234"
    And user input address "Jalan Surabaya Blok T"
    Then user click sign up button
    And user see alert register success & click OK
    Then user redirect to login page for login account

  @register
  Scenario Outline: Register with 1 digit until 9 digit for phone number
    Given user open register page
    And user input name shop "Toko Cuan"
    And user input email "testing04@gmail.com"
    And user input phone number "<phone>"
    And user input password "test123"
    And user input address "Jalan Surabaya Blok H Nomor 100"
    Then user click sign up button
    And user see alert minimum phone number digit is not enough and click OK
    Examples:
      |phone        |
      |081          |
      |081234567    |

#Setelah running scenario ini, ganti email & passwordnya karena jika di run lagi.. sudah terdaftar
  @register
  Scenario: Register with valid format phone number
    Given user open register page
    And user input name shop "Toko Rizky 4"
    And user input email "testing05@gmail.com"
    And user input phone number "089465382745"
    And user input password "test1234"
    And user input address "Jalan Surabaya Blok T"
    Then user click sign up button
    And user see alert register success & click OK
    Then user redirect to login page for login account

#Setelah running scenario ini, ganti email & passwordnya karena jika di run lagi.. sudah terdaftar
  @register
  Scenario Outline: Register with characters (just lowercase, uppercase), numerics, special char & combination
    Given user open register page
    And user input name shop "<nameshop>"
    And user input email "<email>"
    And user input phone number "<phone>"
    And user input password "<password>"
    And user input address "Jalan Surabaya Blok H Nomor 100"
    And user see alert register success & click OK
    Then user redirect to login page for login account
    Examples:
      |nameshop        |email           |phone       |password       |
      |Toko Cuan 2     |tester1@mail.com|089384983411|qqqqqq         |
      |Toko Cuan 3     |tester2@mail.com|089384983412|RRRRRR         |
      |Toko Cuan 4     |tester3@mail.com|089384983413|123456         |
      |Toko Cuan 5     |tester4@mail.com|089384983414|!@#$%^&*       |
      |Toko Cuan 6     |tester5@mail.com|089384983415|testing123!@#$%|

#Setelah running scenario ini, ganti email & passwordnya karena jika di run lagi.. sudah terdaftar
  @register
  Scenario Outline: Register with 1 characters or more even combination data on address
    Given user open register page
    And user input name shop "Toko Testing Cuan Bismillah"
    And user input email "<email>"
    And user input phone number "<phone>"
    And user input password "test12345"
    And user input address "<address>"
    Then user click sign up button
    And user see alert register success & click OK
    Then user redirect to login page for login account
    Examples:
    |email                 |phone            |address      |
    |tester001@mail.com    |083475869581     |F            |
    |tester002@mail.com    |083475869582     |Jalan        |
    |tester003@mail.com    |083475869583     |No 123!@#    |
    |tester004@mail.com    |083475869584     |!@#$%        |

  @register
  Scenario: Register without fill name shop
    Given user open register page
    And user input email "tester0001@mail.com"
    And user input phone number "08574893829"
    And user input password "test123"
    And user input address "Jalan Surabaya Blok H Nomor 100"
    Then user click sign up button
    And user see alert on name shop field for filling name shop

  @register
  Scenario: Register without fill email
    Given user open register page
    And user input name shop "Toko Testing Cuan Bismillah"
    And user input phone number "08574893829"
    And user input password "test123"
    And user input address "Jalan Surabaya Blok H Nomor 100"
    Then user click sign up button
    And user see alert on email field for filling valid format email

  @register
  Scenario: Register without fill phone number
    Given user open register page
    And user input name shop "Toko Testing Cuan Bismillah"
    And user input email "tester0001@mail.com"
    And user input password "test123"
    And user input address "Jalan Surabaya Blok H Nomor 100"
    Then user click sign up button
    And user see alert on phone number field for filling valid phone number

  @register
  Scenario: Register without fill password
    Given user open register page
    And user input name shop "Toko Testing Cuan Bismillah"
    And user input email "tester0001@mail.com"
    And user input phone number "08574893829"
    And user input address "Jalan Surabaya Blok H Nomor 100"
    Then user click sign up button
    And user see alert on password field for filling password

  @register
  Scenario: Register without fill address
    Given user open register page
    And user input name shop "Toko Testing Cuan Bismillah"
    And user input email "tester10000@mail.com"
    And user input phone number "08574893829"
    And user input password "test123"
    Then user click sign up button
    And user see alert on address field for filling address

  @register
  Scenario: Register with email already registered
    Given user open register page
    And user input name shop "Toko New User"
    And user input email "testingtoko1@mail.com"
    And user input phone number "08973839404"
    And user input password "test1234"
    And user input address "Jalan Surabaya Blok T"
    Then user click sign up button
    And user see alert your email or phone number already registered & click OK

  @register
  Scenario: User want go to Login page for login account
    Given user open register page
    And user already have account and go to login page
    Then user is on login page for login account



