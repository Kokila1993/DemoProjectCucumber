Feature: To validate the Luma E-Commerce Site

  Scenario Outline: To validate the Luma site
    Given User shuold be in HomePage of the Luma E-Commerce Site
    When User should click the SignIn and Login using valid "<userName>" and "<passWord>"
    And User should click the SignIn Button
    And User should Click the link on the homepage
    And User should add the product in the cart
    Then User should Take a screenshot of the cart page
    When User should Empty the cart 
    Then Take a screenshot of the Empty cart

    Examples: 
      | userName               | passWord | 
      | koki.nataraj@gmail.com | Sam@2020 | 
