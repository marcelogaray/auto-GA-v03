Feature: Assignment

  Scenario: Verify that the edit form retrieves the data of the selected assignment
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Click on 'Asignación de Equipos' button on Header page
#    And Click on 'Nueva asignación' button on 'Asignacion de equipos' page
#    When The required information is filled out in the form
#    And Click on 'Crear' button on modal 'Asignar equipo'
    When Click on the edit button of an assignment
    Then verify the id of the employee in the form 'Editar asignacion'
    Then verify the id of the equipment in the form 'Editar asignacion'
    Then verify 'Observaciones' in the form 'Editar asignacion'