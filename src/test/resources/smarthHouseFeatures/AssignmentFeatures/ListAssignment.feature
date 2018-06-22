Feature: SHListAssignments
  Background: There is at least one assignment registered in the system
  Scenario: Verify that the assigned assignments are listed, when entering the 'Asignacion de Equipos' section
    Given I loging to 'SMARTHOUSE' page with properly credentials
    And I fill properly credentials with user admin
    When Go to 'Asignacion de Equipos' on 'Header' page