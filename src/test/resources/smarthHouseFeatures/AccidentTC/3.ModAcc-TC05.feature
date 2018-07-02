# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify 'Crear' button from 'Registrar Accidente' Modal Form is Disable when non requiered data is filled
    Given I loging to 'SMARTHOUSE' page
    And fill properly credentials in 'Login' modal
    And click on 'Accidentes' button on navigation NavigationBar
    When click on 'Registrar Accidente' button on Accident Page
    Then verify 'Crear' button from 'Registro Accidente' Modal Form is disable
    And I close de 'Registro Accidente'Form Modal
    And  I logOut From 'SMARTHOUSE' Page