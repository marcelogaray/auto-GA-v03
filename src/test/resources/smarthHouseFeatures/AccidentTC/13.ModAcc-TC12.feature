# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify when click on save button on edit modal 'Editar accidente' the datas was modified satisfactory
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    When I click on edit button on list of accidents
    And I fill edit modal form 'Editar Accidente'
    And click on 'Guardar' button on modal 'Editar Accidente'
    And I click on edit button on list of accidents
    Then verify 'Título' show data title from accident on 'Editar accidente' when edited
    Then verify 'Código' show data code from accident on 'Editar accidente' when edited
    Then verify 'Descripcion' show data description from accident on 'Editar accidente' when edited
    Then verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente' when edited
    And Cancel button on modal edit for close modal
    And  I logOut From 'SMARTHOUSE' Page