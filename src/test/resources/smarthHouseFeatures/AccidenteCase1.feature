# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: 'Registro Accidente' Modal Form is Displayed once I Clicked on 'Registrar Accidente'
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Clicked on 'Accidentes' on TabNAv
    When Click on 'Registrar Accidente' on Accidente Page
    Then AccidenteFormModal is Displayed

