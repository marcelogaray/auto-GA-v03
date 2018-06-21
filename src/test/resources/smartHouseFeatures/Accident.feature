# Login feature review the behavior in thie feature
Feature: SHAccident

  Scenario: The user close the dialog to register accidents
    Given 'SMARTHOUSE' page is loaded
    And Select Accident Menu
    And Click on 'Registrar accidente'
    And Close modal 'Registro de Accidente''
    And Click on 'Registrar accidente'
    And Close modal 'Registro de Accidente' from cancel
