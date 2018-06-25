Feature: SHViewModalVerAsignacion
  Background: There must be at least one registered assignment
    Scenario: Verify that the modal 'Ver asignación' is displayed, when the 'ver' button is clicked
      Given Given I loging to 'SMARTHOUSE' page
      And I fill properly credentials with admin user
      When Go to 'Asignacion de Equipos' on 'Header' page
      And Click on the 'see' button of a registered assignment on 'Asignacion de Equipos' page
      Then The modal 'Ver asignacion' is displayed that lists all the equipment that was assigned to that employee
