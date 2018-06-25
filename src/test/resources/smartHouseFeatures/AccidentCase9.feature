# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify if edit modal 'Editar accidente' is opened when edit an accident
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    When required data is filled on 'Registro Accidente' Modal Form
    And click on 'Crear' button on modal 'Registro de Accidente'
    When I click on edit button on list of accidents
    Then verify 'Empleado' show data employee from accident on 'Editar accidente'
    Then verify 'Título' show data title from accident on 'Editar accidente'
    Then verify 'Código' show data code from accident on 'Editar accidente'
#    Then verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente'
#    Then verify 'Tipo de accidente' show data type accident from accident on 'Editar accidente'
    Then verify 'Descripcion' show data description from accident on 'Editar accidente'
#    Then verify 'Estado' show data state from accident on 'Editar accidente'
#    Then verify 'Fecha de suceso' show data success date from accident on 'Editar accidente'
