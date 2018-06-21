# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: 'Once I fill ModalForm with one requiered data 'Crear' button will be disable
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Clicked on 'Accidentes' on TabNAv
    And Click on 'Registrar Accidente' on Accidente Page
    And AccidenteFormModal is Displayed
    When I fill ModalForm with one requiered data
    Then 'Crear' button will be Disable


