# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify if edit modal 'Editar accidente' is opened when edit an accident
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    When required data is filled on 'Registro Accidente' Modal Form
    And click on 'Crear' button on modal 'Registro de Accidente'
    When I click on edit button on list of accidents
    Then verify 'Editar Accidente' form modal is present