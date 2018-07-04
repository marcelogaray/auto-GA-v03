Feature: registrar un nuevo registro de 'tipo de equipo'
  Scenario: cerar un nuevo registro de de tipo de equipo y Verifiacr que el equipo sea el correcto
    Given  I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Equipos de Seguridad' button on navigation NavigationBar
    And click on 'Ver Tipo De Equipos Registrados' button
    And click on 'Nuevo Registro' button
    When fill dates 'Nuevo Registro'
    And click on button 'Crear'
    Then click on button 'ok'
    When click on 'ver'
    And The modal 'Ver tipo equipo' is displayed
    Then Verify if the equipment name is correct




