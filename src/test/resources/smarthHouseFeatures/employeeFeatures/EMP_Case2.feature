# Login feature review the behavior in thie feature
Feature: EMP_Case2

  Scenario: Verify if the employee does not have an item or equipment assignment
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And I click on 'Personal' option on 'Header' page
    And I click on 'Eliminar Empleado' button on 'Ruben Moscoso' item on 'Lista de Empleados' page
    And I Confirm alert  'Estas Seguro que deseas eliminar al Empleado!', click in "Si, Eliminar" button
    Then I should see the alert with the next text: 'No se pudo eliminar porque tiene algun equipo o item asignado'
    And I accept the Confirm alert
    And  I logOut From 'SMARTHOUSE' Page
