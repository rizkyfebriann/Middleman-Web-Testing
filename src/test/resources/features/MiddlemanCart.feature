@Web
Feature: Login
  Background: login user with registered valid email & valid password
    Given user input email "ernatoko1@gmail.com" and password "erna123"
    And user click on login button
    And user see alert login success & click OK
    Then user success login

# success
  @AddToCart
  Scenario: Add one product to the cart from the dashboard
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added

# success
  @AddToCart
  Scenario: Add two product to the cart from the dashbord
    # menggunakan loop untuk menambah beberapa kali dari dashboard
    # step ini sudah menghandle alertnya dalam loop jadi tidak perlu mengecheck untuk alert
    When user click button add on the dashboard page by 2
    And user click My Cart
    Then user can see the product cart added


# sucsees
  @AddToCart
  Scenario: Add one product to the cart from button plus in page My Cart
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user clicks button plus
    Then user can see the number of item updated

# success
  @AddToCart
  Scenario: Add multyple product from page my cart page
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    # bikin dengan parameter dan looping
    And user clicks button plus by 2
    Then user can see the number of item updated

#    Belum tau cek kondisi biar deteksi stock product karna jmlah stok ga stabil?
  @AddToCart
  Scenario: Add product to cart until exceeds stock product from my cart page
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user clik button plus threed time
    Then user can see the number of item updated

# sucsees
  @AddToCart
  Scenario: Update reduce one product quantity in my cart
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    And user click button minus to decrease the product by 1
    Then user can see the number of item updated


# Success
# Kurangi product dengan dua quantity
  @AddToCart
  Scenario: Update reduce the quantity in cart with two product
    # ditambah 2 karena akan di kurangi 2 pula nanti
    When user click button add on the dashboard page by 2
    And user click My Cart
    Then user can see the product cart added
    And user click button minus to decrease the product by 2
    Then user can see the number of item updated

#  Belom jalan 100%, check kalo dah di satu bisa di click lagi atau tidak
  # Di UI tidak akan pernah sampai 0
  @AddToCart
#  Scenario: Update Reduce the quantity in cart to zero
#    When user click button add on the dashboard page
#    And user see alert success add to cart & click OK
#    And user click My Cart
#    Then user can see the product cart added
#    # ini implementasi untuk menginginkan jumlah tertentu
#    And user click button minus to decrease the product to 1
#    # kalau sudah 1, tidak akan bisa di click lagi, ini masih gagal dikit
#    Then user should not be able to click minus at quantity one


 # success
  @AddToCart
  Scenario: Remove 1 product(s) from the cart
    When user click button add on the dashboard page
    And user see alert success add to cart & click OK
    And user click My Cart
    Then user can see the product cart added
    # di dalam step ini di assert apakah title yang di index yang didelete tetap ada
    # setelah productnya di hilangkan
    And user click button delete product at index 1
    Then user can see the product is removed

#    Belum success
#  @AddToCart
#  Scenario: Remove 2 product(s) from the cart
#    When user click button add on the dashboard page
#    And user see alert success add to cart & click OK
#    And user click My Cart
#    Then user can see the product cart added
#    And user click button delete product at index 1
#    Then user can see the product is removed








