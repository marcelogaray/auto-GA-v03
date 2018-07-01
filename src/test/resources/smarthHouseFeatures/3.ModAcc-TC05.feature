# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify 'Crear' button from 'Registrar Accidente' Modal Form is Disable when non requiered data is filled
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    When click on 'Registrar Accidente' button on Accident Page
    Then 'Crear' button from 'Registro Accidente' Modal Form  should be disable
    And I close de 'Registro Accidente'Form Modal
    And  I logOut Form 'SMARTHOUSE' Page