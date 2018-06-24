# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify 'Crear' button from 'Registrar Accidente' Modal Form is Enable when requiered data is filled
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    And required data is filled on 'Registro Accidente' Modal Form
    When click on 'Crear' button form 'Registrar Accidente' Modal Form
    Then verify Alert of Success message for new accident register is shown