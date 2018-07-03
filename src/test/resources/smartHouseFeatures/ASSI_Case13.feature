Feature: EquiType

  Scenario:
  Verify that when registering a type of equipment it appears in the list of equipment types
    Given I loging to 'SMARTHOUSE' page
    And fill properly credentials in 'Login' modal
    And Click on 'Equipos de Seguridad' button on Header page
    And Click on the button 'Ver tipos de equipos registrados'
    And Click on the button 'Nuevo registro'
    When required data is filled on 'Nuevo registro de tipo de equipo' modal form
      | EqTypeName | Description |
      | Guantes    | Guantes reforzados |
    And click on 'Crear' button on modal 'Nuevo registro de tipo de equipo'
    Then verify new registered equipment type is shown in equipment type page
      | EqTypeName |
      | Guantes    |
    And I logOut From 'SMARTHOUSE' Page
