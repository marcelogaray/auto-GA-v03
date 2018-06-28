Feature: Assignment

  Scenario: Verify that the edit form retrieves the data of the selected assignment
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Click on 'Asignación de Equipos' button on Header page
    And Click on 'Nueva asignación' button on 'Asignacion de equipos' page
    When The required information is filled out in the form
    And Click on 'Crear' button on modal 'Asignar equipo'
    When Click on the edit button of an assignment
    Then verify the id of the employee in the form 'Editar asignacion'
    Then verify the id of the equipment in the form 'Editar asignacion'
    Then verify 'Observaciones' in the form 'Editar asignacion'

#
#    When required data is filled on 'Registro Accidente' Modal Form
#    And click on 'Crear' button on modal 'Registro de Accidente'
#    When I click on edit button on list of accidents
#    Then verify 'Empleado' show data employee from accident on 'Editar accidente'
#    Then verify 'Título' show data title from accident on 'Editar accidente'
#    Then verify 'Código' show data code from accident on 'Editar accidente'
##    Then verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente'
##    Then verify 'Tipo de accidente' show data type accident from accident on 'Editar accidente'
#    Then verify 'Descripcion' show data description from accident on 'Editar accidente'
##    Then verify 'Estado' show data state from accident on 'Editar accidente'
##    Then verify 'Fecha de suceso' show data success date from accident on 'Editar accidente'
