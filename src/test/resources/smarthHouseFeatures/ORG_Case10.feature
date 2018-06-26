# Login feature review the behavior in thie feature
Feature: ORG_Case10

  Scenario: Verificar que al registrar una area esta aparezca en la lista de Areas
    Given I loging to 'SMARTHOUSE' page
    When I fill properly credentials with admin user
    And go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page
    And click 'Nuea Area' button on 'Organization' page
    And fill 'New Organization' modal form on 'Organization' page with 'start date' biger than 'end date'
    And click 'Crear' button on 'New Organization' modal on 'Organization' page
    And verify 'El área fue creado correctamente' message info is displayed on 'Organization' page
    And click 'Aceptar' button on 'Message Information' modal on 'Organization' page
    Then the new area must be present in the areas list.