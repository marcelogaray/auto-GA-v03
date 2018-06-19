# Login feature review the behavior in thie feature
Feature: Organization

  Scenario: The new Organization form is enables in active Area
    Given 'SMARTHOUSE' page is loaded
    And open 'Login' page
    And set admin credentials on 'Login' page
    And accept credentials on 'Login' page
    And close 'Login' page
    And open 'Organization' page
    And open 'Organization' detail
    And open new 'Organization' form
