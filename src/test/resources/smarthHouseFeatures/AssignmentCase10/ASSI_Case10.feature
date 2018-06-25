Feature: SHViewModalVerAsignacion
  Background: There must be at least one registered assignment
    Scenario: Verify that the 'Editar asignación' form is displayed, by clicking on the 'Editar' icon
      Given Given I loging to 'SMARTHOUSE' page
      And I fill properly credentials with admin user
      When Go to 'Asignacion de Equipos' on 'Header' page
      And Click on the 'Nueva asignación' button on 'Asignacion de equipos' page
      And The modal 'Asignar equipo' is displayed
      And Just enter data in the 'Observaciones' field on the 'Asignar equipo' modal
      Then The 'Crear' button is not enabled on the 'Asignar equipo' modal