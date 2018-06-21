# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Home page is displayed once set credential in login page
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Clicked on 'Accidentes' on TabNAv
    When Click on 'Registrar Accidente' on Accidente Page
    Then AccidenteFormModal is Displayed
