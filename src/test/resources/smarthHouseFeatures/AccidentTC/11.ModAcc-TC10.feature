# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify if the form edition is filled with data from accident selected is correct.
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    When I click on edit button on list of accidents
    Then verify that "Ruben" is displayed in the 'Empleado' textfield on 'Editar accidente' modal page
    And verify "Titulo Accidente" show data title from accident on 'Editar accidente'
    And verify "Codigo2" show data code from accident on 'Editar accidente'
    And verify "1" show data level risk from accident on 'Editar accidente'
    And verify "Caídas" show data type accident from accident on 'Editar accidente'
    And verify "Descripcion" show data description from accident on 'Editar accidente'
    And verify "Activo" show data state from accident on 'Editar accidente'
    And verify "05-05-2018" show data success date from accident on 'Editar accidente'
    And  I logOut From 'SMARTHOUSE' Page