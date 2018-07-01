Feature: SHViewModalVerAsignacion

  Background: There must be at least one registered assignment

  Scenario: Verify that the modal 'View Assignment' closes when you click on the 'Close' button or on the 'X' button
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    When Go to 'Asignacion de Equipos' on 'Header' page
    And Click on the 'see' button of a registered assignment on 'Asignacion de Equipos' page
    And The modal 'Ver asignacion' is displayed that lists all the equipment that was assigned to that employee
    When Click on the 'Close' button on modal 'Ver asignación'
    Then The modal 'Ver asignación' closes
    When I reopen the modal 'Ver asignación' on 'Asignación de equipos' page
    And Click on the 'X' button on modal 'Ver asignación'
    Then The modal 'Ver asignacion' closes
    And  I logOut From 'SMARTHOUSE' Page