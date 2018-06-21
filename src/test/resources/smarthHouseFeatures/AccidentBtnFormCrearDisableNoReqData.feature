# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: 'AccidenteFormModal is Displayed no required data is filled, 'Crear' button will not be enable
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Clicked on 'Accidentes' on TabNAv
    And Click on 'Registrar Accidente' on Accidente Page
    When AccidenteFormModal is Displayed
    Then 'Crear' button will be Disable


