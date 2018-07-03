
Feature: Register a equipment
  Scenario: 'Crear' button from 'Registrar Accidente' Modal Form
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Equipos de Seguridad' button on navigation NavigationBar
    And click on 'Nuevo registro de equipos' button on Accident Page
    When required data is filled witout one of them on 'nuevo registro' Modal Form
    Then cilck on 'Crear' button from 'Nuevo registro'
    And verify new registered equipment "casco duro" is shown in equipment type page
    And I logOut From 'SMARTHOUSE' Page