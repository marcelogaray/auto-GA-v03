# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Set admin credentials on SMARTHOUSE
    Given 'SMARTHOUSE' page is loaded
    And open 'Login' page
    And set admin credentials on 'Login' page
    And accept credentials on 'Login' page
