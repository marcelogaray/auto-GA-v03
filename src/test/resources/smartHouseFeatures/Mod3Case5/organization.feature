# Login feature review the behavior in thie feature
Feature: SHRemoveOrganization

  Scenario: Home page is displayed once set credential in login page
    Given M3C5: 'SMARTHOUSE' page is loaded
    And M3C5: open 'Login' page
    And M3C5: set admin credentials on 'Login' page
    And M3C5: accept credentials on 'Login' page
    And M3C5: close 'Login' page
    And M3C5: open 'Organization' page
    And M3C5: open 'Organization' detail
    And M3C5: remove child 'Organization'
    And M3C5: 'SMARTHOUSE' page is closed
