Feature: SHViewModalVerAsignacion

  Background: There must be at least one registered assignment

  Scenario: Verify that the 'Edit Assignment' form is filled with the information of the selected assignment
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    When Go to 'Asignacion de Equipos' on 'Header' page,assignments are listed
    And Click on the edit button to the first assignment on 'Asignacion de equipos' page
    When The modal 'Editar Asignación' is displayed, with the list of assignments made to that employee
    And Click on the edit button of one of the equipments assigned to that employee
    Then Verify if the employee's name is correct
    Then Verify if the equipment assignment is correct