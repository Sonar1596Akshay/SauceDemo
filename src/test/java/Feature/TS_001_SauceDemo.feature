Feature: Test SauceDemo Application

  Scenario Outline: Validate login functionality
    Given user open URL on browser
    When user enter userName and password
    Then click on LoginButton

   Scenario Outline: Validate Add to Cart Functionality
    When User click on filter and select price high to low
    And user add first 3 products to cart
    Then User click on add to cart container
    And User is checkout

  Scenario Outline: validate cart products
    Then user enter details
    Then click on continue button

  Scenario Outline: validate overview page
    Given user validate total price
    Then user click on finishButton
    Then capture order message
    Then click on HomePage button
    Then user click on logout button
    Then terminate the browser
    
   

 
