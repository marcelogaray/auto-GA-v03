Feature: SHViewModalVerAsignacion
  Background: There must be at least one registered assignment
    Scenario: Verify that it is possible to delete a registered assignment
      Given Given I loging to 'SMARTHOUSE' page
      And I fill properly credentials with admin user
      When Go to 'Asignacion de Equipos' on 'Header' page,assignments are listed
      And Click on the dumpster button to remove the assignment on 'Asignacion de equipos' page
      When The modal 'Editar Asignación' is displayed, with the list of assignments made to that employee
      And Click on the dumpster button to remove the assignment on the modal 'Editar Asignacion'
      When The modal 'Confirmar eliminacion' is displayed
      And Click on the 'Aceptar' button, on the modal 'Confirmar eliminacion'
      Then The message 'La asignacion se elimino correctamente' is displayed

