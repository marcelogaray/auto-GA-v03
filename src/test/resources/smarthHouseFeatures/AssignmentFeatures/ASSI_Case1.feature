Feature: Register Assignment
  Background: The employee to whom the equipment is assigned is registered in the system
  The equipment to be assigned is registered in the system
  Scenario: Verify that a equipment can be assigned to an employee
    Given I loging to 'SMARTHOUSE' page
    And fill properly credentials in 'Login' modal
    When Go to 'Asignacion de Equipos' on 'Header' page, press the button 'Nueva Asignacion' on 'Asignacion de Equipos' page
    And user selects an employee, a equipment and enters observations of the assignment made on 'Asignar Equipo' modal
    And click over 'Crear' button on 'Asignar equipo' modal
    Then 'La asignacion fue registrada correctamente' information message should be displayed on 'Asignacion de Equipos' page
    And I logOut From 'SMARTHOUSE' Page