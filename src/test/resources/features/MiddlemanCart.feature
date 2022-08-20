@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

#    ini udah success
  @AddToCart
  Scenario: Add one product to the cart from the dashboard
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added

#    ini tidak mengerti ngulangnya gimana kalo dari dashboard
  @AddToCart
  Scenario: Add two product to the cart from the dashbord
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user add product2 to cart
    And user see alert sucsess add to cart & click OK
    And user click My Cart
    Then user can see the product cart added

#  @AddToCart
#  Scenario: Add multyple product To Cart from the dashbord page
#    When user click button add on the dashboard page
#    And user see alert sucsess add to cart & click OK
#    And user click My Cart
#    Then user can see the product cart added
#    And user clik button plus to add more item
#    Then user can see the number of item increase

# ini udah sucsees
  @AddToCart
  Scenario: Add one product to the cart from button plus in page My Cart
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user clicks button plus
    Then user can see the number of item updated

# ini udah success
  @AddToCart
  Scenario: Add multyple product from page my cart page
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    # bikin dengan parameter dan looping
    And user clicks button plus by 2
    Then user can see the number of item updated

#    Ini Gimana cek kondisinya biar deteksi stock productnya?
  @AddToCart
  Scenario: Add product to cart until exceeds stock product from my cart page
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user clik button plus threed time
    Then user can see the number of item updated

    # ini udah sucsees
  @AddToCart
  Scenario: Reduce one product quantity in my cart
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user click button minus to decrease the product by 1
    Then user can see the number of item updated


# Success
# Kurangi product dengan dua quantity
  @AddToCart
  Scenario: Reduce the quantity in cart with two product
    # ditambah 2 karena akan di kurangi 2 pula
    When user click button add on the dashboard page by 2
    And user click My Cart
    Then user can see the product cart added
    And user click button minus to decrease the product by 2
    Then user can see the number of item updated

# ini belom sucsees
  @AddToCart
  Scenario: Reduce the quantity in cart to zero
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user click button minus to decrease the product
    Then user can see the number of item updated

#    ini juga tidak tahu gimana kalo elemennya udah kedelete assertnya apa
  @AddToCart
  Scenario: Remove 1 product(s) from the cart with the name <Product Name>
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user click button delete product
    Then user can see the product is removed

  @AddToCart
  Scenario: Remove 2 product(s) from the cart with index <index>

  @AddToCart
    Scenario: Remove product in the cart to 0







