# Login feature review the behavior in thie feature
Feature: SHRemoveOrganization

  Scenario: Home page is displayed once set credential in login page
    Given 'SMARTHOUSE' page is loaded
    And set admin credentials on 'Login' page
    And open organization detail and remove child on 'SmartHouse'
