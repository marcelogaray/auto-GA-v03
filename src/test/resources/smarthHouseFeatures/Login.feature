# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Home page is displayed once set credential in login page
    Given 'SMARTHOUSE s page is loaded
    And click on button 'Login' on the header
    And set username for 'admin'
    And set password for 'admin'
    And click on button 'Login'
    And click on button 'x' on header modal
