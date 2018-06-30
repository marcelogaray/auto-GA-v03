Feature: SHListAssignments
  Background: There is at least one assignment registered in the system
  Scenario: Verify that the assigned assignments are listed, when entering the 'Asignacion de Equipos' section
    Given  Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    When Go to 'Asignacion de Equipos' on 'Header' page
    And The assignments are listed on 'Asignacion de equipos' page
    Then Verify that the first employee on the list is "Juan Perez" on 'Asignacion de equipos' page
    Then Verify that all employees to whom equipment was assigned are listed on 'Asignacion de Equipos' page
