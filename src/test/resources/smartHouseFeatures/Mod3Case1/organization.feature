# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Home page is displayed once set credential in login page
    Given 'SMARTHOUSE' page is loaded
    And set admin credentials on 'Login' page
    And open new organization form for 'SmartHouse'
