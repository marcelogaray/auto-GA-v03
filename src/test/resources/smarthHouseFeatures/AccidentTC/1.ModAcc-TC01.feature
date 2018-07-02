# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: 'Registro Accidente' Modal Form is Displayed once I Clicked on 'Registrar Accidente'
    Given I loging to 'SMARTHOUSE' page
    And fill properly credentials in 'Login' modal
    And click on 'Accidentes' button on navigation NavigationBar
    When click on 'Registrar Accidente' button on Accident Page
    Then verify that 'Registro Accidente'Form Modal is Displayed
    And I close de 'Registro Accidente'Form Modal
    And  I logOut From 'SMARTHOUSE' Page