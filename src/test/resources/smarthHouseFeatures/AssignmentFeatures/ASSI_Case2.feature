Feature: SHListAssignments
  Background: There is at least one assignment registered in the system
  Scenario: Verify that the assigned assignments are listed, when entering the 'Asignacion de Equipos' section
    Given  Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    When Go to 'Asignacion de Equipos' on 'Header' page
    Then Verify that the assignments are listed on 'Asignacion de equipos' page
    And I logOut From 'SMARTHOUSE' Page

