Feature: SHViewModalVerAsignacion

  Background: There must be at least one registered assignment

  Scenario: Verify that by clicking on the button ver asignacion, the information of the selected assignment is displayed
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    When Go to 'Asignacion de Equipos' on 'Header' page
    And Click on the button to see the first assignment in the list on 'Asignacion de Equipos' page
    And The modal 'Ver asignacion' is displayed that lists all the equipment that was assigned to that employee
    Then Verify if the employee's name is correct
    Then Verify if the equipment assignment is correct