@smoke
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'SR@gmail.com' and password '123456789'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company    | website            | taxID | paymentMethod |
      | Tek-School | www.Tek-School.Com |   007 | Cheque        |
    And User fill the cheque payee name
    And User check on About us check box
    And User click on Continue button1
    Then User should see a success message1

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information' link1
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName      | abaNumber | swiftCode | accountName | accountNumber |
      | BankOFAmerica | aba00702  |    170000 | Sasan Rafi  |   44568923147 |
    And User click on Continue button2
    Then User should see a success message2

  Scenario: Edit your account Information
    When User click on 'Edit your account information' link2
    And User modify below information
      | firstname | lastName | email             | telephone   |
      | SasanR    | Rafiii   | sasan100@gmail.com | 07776666999 |
    And User click on continue button
    Then User should see a message4 'Success: Your account has been successfully updated.'
