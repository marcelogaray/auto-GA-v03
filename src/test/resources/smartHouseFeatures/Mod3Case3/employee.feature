# Login feature review the behavior in thie feature
Feature: Mod3Case3

  Scenario: Validate CODE for New Employee
    Given M3C3: 'SMARTHOUSE' page is loaded
    And M3C3: open 'Login' page
    And M3C3: set admin credentials on 'Login' page
    And M3C3: accept credentials on 'Login' page
    And M3C3: close 'Login' page
    And M3C3: open 'Employee' page
    And M3C3: open new 'Employee' form
    And M3C3: complete new 'Employee' form
    And M3C3: accept new 'Employee' form
    And M3C3: 'SMARTHOUSE' page is closed
