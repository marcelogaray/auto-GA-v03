Feature: SHAccident

  Scenario: Verify ' Crear ' button from 'Nuevo Registro de Equipos' Modal Form is Disable when non requiered data is filled
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Equipos de Seguridad' button on navigation NavigationBar
    When click on 'Nuevo registro de equipos' button on Accident Page
    Then 'Crear' button from 'Registro de equipos' Modal Form  should be disable
    And I logOut From 'SMARTHOUSE' Page