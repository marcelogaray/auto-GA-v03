# Login feature review the behavior in thie feature
Feature: EMP_Case1

  Scenario: Request confirmation before removing an employee
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And I click on 'Personal' option on 'Header' page
    And I click on 'Eliminar Empleado' button on 'Ruben Moscoso' item on 'Lista de Empleados' page
    Then I should see the Confirm alert with the next text: 'Estas Seguro que deseas eliminar al Empleado!'
    And I close the Confirm alert
    And  I logOut From 'SMARTHOUSE' Page
