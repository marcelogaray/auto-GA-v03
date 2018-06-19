# Login feature review the behavior in thie feature
Feature: Organization

  Scenario: The new Organization form is enables in active Area
    Given M3C1: 'SMARTHOUSE' page is loaded
    And M3C1: open 'Login' page
    And M3C1: set admin credentials on 'Login' page
    And M3C1: accept credentials on 'Login' page
    And M3C1: close 'Login' page
    And M3C1: open 'Organization' page
    And M3C1: open 'Organization' detail
    And M3C1: open new 'Organization' form
    And M3C1: 'SMARTHOUSE' page is closed