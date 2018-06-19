# Login feature review the behavior in thie feature
Feature: Mod3Case3

  Scenario: Validate CODE for New Employee
    Given 'SMARTHOUSE' page is loaded
    And open 'Login' page
    And set admin credentials on 'Login' page
    And accept credentials on 'Login' page
    And close 'Login' page
    And open 'Employee' page
    And open new 'Employee' form
    And complete new 'Employee' form
    And accept new 'Employee' form
    And 'SMARTHOUSE' page is closed
