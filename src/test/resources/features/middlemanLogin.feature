@Web
Feature: Login

  @loginuser
  Scenario: login user with registered valid email & valid password
    Given user input email "tokotesting1@gomail.com" and password "testing123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

  @loginadmin
  Scenario: login admin with registered valid email & valid password
    Given user input email "adminqe@gomail.com" and password "qwe123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

  @login
  Scenario: login with registered valid email & invalid password
    Given user input email "tokotesting1@gomail.com" and password "testing"
    And user click on login button
    Then user see alert email or password is incorrect & click OK

  @login
  Scenario: login with invalid email & valid password
    Given user input email "tokotesting1.com" and password "testing"
    And user click on login button
    Then user see alert email or password is incorrect & click OK

  @login
  Scenario: login with invalid email & invalid password
    Given user input email "tokotesting1.com" and password "%@$%#"
    And user click on login button
    Then user see alert email or password is incorrect & click OK

  @login
  Scenario: login without email & input valid password
    Given user input email "" and password "testing123"
    And user click on login button
    Then user see required alert on email field

  @login
  Scenario: login with valid email & without password
    Given user input email "tokotesting1@gomail.com" and password ""
    And user click on login button
    Then user see required alert on password field

  @login
  Scenario: login without any data
    Given user already on login page
    And user click on login button
    Then user see required alert on email field

  @login
  Scenario: User want to register account
    Given user already on login page
    And user click on Register textlink
    Then user go to register page
