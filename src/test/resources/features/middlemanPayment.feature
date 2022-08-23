@Web
Feature: Payment

  Background: login user with registered valid email & valid password
    Given user input email "rizkydemons5@gmail.com" and password "testing123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

  Scenario: Payment order with Credit Card
    When user scroll down little bit on dashboard page
    And click button add one product
    Then user go to my cart
    And user can see product added on cart
    And user click Next for create order and go to payment page
    And user see payment page
    And user click Credit Card for payment method
    And user input credit card number "4811111111111114"
    And user input exp card "0225"
    And user input CVV "123"
    And user click Pay Now button
    Then user see payment successful
    And user can see transactions on history order page

  Scenario: Payment order with BCA Klikpay
    When user scroll down little bit on dashboard page
    And click button add one product
    Then user go to my cart
    And user can see product added on cart
    And user click Next for create order and go to payment page
    And user see payment page
    And user click BCA Klikpay for payment method
    And user click Pay Now
    Then user go to simulator payment page
    And user click Bayar button
    And user can see payment transaction is success

#  Scenario: Payment order with Shopeepay
#    When user scroll down little bit on dashboard page
#    And click button add product on Super Bubur
#    Then user go to my cart
#    And user can see product added on cart
#    And user click Next for create order and go to payment page
##    And user see payment page
##    And user scroll for see more payment method
##    And user choose Shopeepay


