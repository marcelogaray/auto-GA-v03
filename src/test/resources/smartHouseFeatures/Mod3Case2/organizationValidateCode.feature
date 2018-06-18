# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Home page is displayed once set credential in login page
    Given 'SMARTHOUSE' page is loaded init
    And init admin credentials on 'Login' page
    And close 'Login' page
    And load form organization in 'SmartHouse'
    And load data organization in 'SmartHouse'
#    And load values in organization form for 'SmartHouse'