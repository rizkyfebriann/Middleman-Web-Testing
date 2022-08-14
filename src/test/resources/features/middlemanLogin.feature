@Web
Feature: Login

  @login
  Scenario: login with valid email & valid password
    Given user input "emailnotiftesting6@gomail.com" and "testing123"
    And user click on login button
    Then user success login
