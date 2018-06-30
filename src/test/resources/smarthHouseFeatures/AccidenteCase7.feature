# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify 'Crear' button from 'Registrar Accidente' Modal Form is Disable when one requiered data is filled
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    When one required data is filled  on 'Registro Accidente' Modal Form
    Then 'Crear' button from 'Registro Accidente' Modal Form  should be disable