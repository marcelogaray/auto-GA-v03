
Feature: Register a equipment
Scenario: Verify 'Crear' button from 'Registrar Accidente' Modal Form is Disable when non requiered data is filled
      Given I loging to 'SMARTHOUSE' page
      And I fill properly credentials with adminuser
      And click on 'Equipos de Seguridad' button on navigation NavigationBar
      And click on 'Nuevo registro de equipos' button on Accident Page
      When required data is filled witout one of them on 'nuevo registro' Modal Form
      Then cilck on 'Crear' button from 'Nuevo registro'