Feature: registrar un nuevo registro de 'tipo de equipo'
  Scenario: cerar un nuevo registro de de tipo de equipo
    Given  I loging to ' SMARTHOUSE ' page
    And I fill properly credentials with admin users
    And click on 'Equipos de Seguridad' button on  NavigationBar
    And click on 'Ver Tipo De Equipos Registrados' button
    And click on 'Nuevo Registro' button
    When fill dates 'Nuevo Registro'
    And click on button 'Crear'
    Then click on button 'ok'
    When click on edit
    And modif desciption
    Then click on 'actualizar'


