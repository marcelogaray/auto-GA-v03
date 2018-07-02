Feature: SHViewModalVerAsignacion

  Background: There must be at least one registered assignment

  Scenario: Verify that the 'Create' button is not enabled, when the required fields are not filled in the 'Assign team' form
    Given I loging to 'SMARTHOUSE' page
    And fill properly credentials in 'Login' modal
    When Go to 'Asignacion de Equipos' on 'Header' page
    And Click on the 'Nueva asignación' button on 'Asignacion de equipos' page
    And The modal 'Asignar equipo' is displayed
    And Just enter data in the 'Observaciones' field on the 'Asignar equipo' modal
    Then The 'Crear' button is not enabled on the 'Asignar equipo' modal
    And Close the 'Asignar equipo' modal
    And  I logOut From 'SMARTHOUSE' Page