# Login feature review the behavior in thie feature
Feature: EMP_Case4

  Scenario: verify that Drop Down List of items is loaded with items
    Given Given I loging to 'SMARTHOUSE' page
    When I fill properly credentials with admin user
    And I click on 'Personal' option on 'Header' page
    And I click on 'Asignar nuevo item' for employee 'Ruben Moscoso' in the list employe page
    When I click in the 'Item' drop down list
    Then I should see the 'Items' available to assign the employee
    And I click on cancel button of form of item assignment
    And  I logOut Form 'SMARTHOUSE' Page