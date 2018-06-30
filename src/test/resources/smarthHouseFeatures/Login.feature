# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify 'Crear' button from 'Registrar Accidente' Modal Form is Enable when requiered data is filled
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And  I logOut Form 'SMARTHOUSE' Page