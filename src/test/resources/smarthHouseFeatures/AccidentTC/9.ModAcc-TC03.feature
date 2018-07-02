# Login feature review the behavior in thie feature
Feature: SHAccident

  Scenario: The user close the dialog to register accidents from header 'x' button and 'Cancelar' button
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And I select accident menu 'Accidentes'
    And I click on 'Registrar accidente' button
    And Close modal 'Registro de Accidente' from 'x' button
    And I click on 'Registrar accidente' button
    And Close modal 'Registro de Accidente' from 'Cancel' button
    Then I verify if the modal is not present
    And  I logOut From 'SMARTHOUSE' Page
