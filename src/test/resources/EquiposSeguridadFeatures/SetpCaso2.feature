Feature: registrar un nuevo registro de 'tipo de equipo'
  Scenario: cerar un nuevo registro de de tipo de equipo
    Given  I loging to 'SMARTHOUSE' page
    And I fill properly credentials with adminuser
    And click on 'Equipos de Seguridad' button on navigation NavigationBar
    And click on 'Ver Tipo De Equipos Registrados' button
    And click on 'Nuevo Registro' button
    When fill dates 'Nuevo Registro'
    And click on button 'Crear'
    Then click on button 'ok'
    When click on 'ver'
    And The modal 'Ver tipo equipo' is displayed
    Then Verify if the equipment name is correct
    And I logOut From 'SMARTHOUSE' Page


