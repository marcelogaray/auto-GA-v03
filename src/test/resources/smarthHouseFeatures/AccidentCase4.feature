# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: 'Once I fill ModalForm with full requiered data 'Crear' button will be enable
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Clicked on 'Accidentes' on TabNAv
    And Click on 'Registrar Accidente' on Accidente Page
    And AccidenteFormModal is Displayed
    And I fill ModalForm with full requiered data
    When I click on 'Crear' button
    Then New Register will be display into accident page


