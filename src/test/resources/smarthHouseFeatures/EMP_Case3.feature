# Login feature review the behavior in thie feature
Feature: EMP_Case3

  Scenario: View employee details, general data, assigned item, current organization chart and others
    Given Given I loging to 'SMARTHOUSE' page
    When I fill properly credentials with admin user
    And I click on 'Personal' option on 'Header' page
    When I click on 'Ver detalles de empleado' button on 'Margotd Leticia Fernandez Garcia' item on 'Lista de Empleados' page
    Then I should see the detail of information of employee selected