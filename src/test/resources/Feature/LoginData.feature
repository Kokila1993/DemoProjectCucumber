Feature: To verify the Luma site Login Credential

  Scenario: To verify the Login webpage with Invalid Credential
    Given User should be in Login page of Luma
    When User should Enter the Username and Password
      | koki.nataraj@gmail.com |
      | Sam@2020               |
    And User should click the Sign-in Button
    Then User should verify the Error Message
