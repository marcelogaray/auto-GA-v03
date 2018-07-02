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
    And I fill edit modal form 'Editar Accidente'
    And click on 'Guardar' button on modal 'Editar Accidente'
    And I click on edit button on list of accidents
    Then verify 'Título' show data title from accident on 'Editar accidente'
    Then verify 'Código' show data code from accident on 'Editar accidente'
    Then verify 'Descripcion' show data description from accident on 'Editar accidente'
    Then verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente'
    And  I logOut From 'SMARTHOUSE' Page