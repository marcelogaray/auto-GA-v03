Feature: Assignment

  Scenario:
  Verify that when registering a type of equipment it appears in the list of equipment types
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And Click on 'Equipos de Seguridad' button on Header page
    And Click on the button 'Ver tipos de equipos registrados'
    And Click on the button 'Nuevo registro'
    When required data is filled on 'Nuevo registro de tipo de equipo' modal form
    And click on 'Crear' button on modal 'Nuevo registro de tipo de equipo'
    When I click on view button on list of  equipment types list
    Then verify the name of the equipment type in the modal 'Ver tipo de equipo'
    Then verify the desciption of the equipment type in the modal 'Ver tipo de equipo'
