# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify if the form edition is filled with data from accident selected is correct.
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    When required data is filled on 'Registro Accidente' Modal Form
    And click on 'Crear' button on modal 'Registro de Accidente'
    When I click on edit button on list of accidents
#    Then verify 'Empleado' show data employee from accident on 'Editar accidente'
    Then verify that "Nataly" is displayed in the 'Empleado' textfield on 'Editar accidente' modal page

    And verify 'Título' show data title from accident on 'Editar accidente'
    And verify 'Código' show data code from accident on 'Editar accidente'
    And verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente'
    And verify 'Tipo de accidente' show data type accident from accident on 'Editar accidente'
    And verify 'Descripcion' show data description from accident on 'Editar accidente'
    And verify 'Estado' show data state from accident on 'Editar accidente'
    And verify 'Fecha de suceso' show data success date from accident on 'Editar accidente'
