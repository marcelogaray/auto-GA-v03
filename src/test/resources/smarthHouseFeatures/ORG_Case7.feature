# Login feature review the behavior in thie feature
Feature: ORG_Case3

  Scenario: Verificar que el codigo de empleado sea unico cuando se guarda el empleado en el formulario de registro
    Given I loging to 'SMARTHOUSE' page
    When I fill properly credentials with admin user
    And go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page
    And click 'Nuea Area' button on 'Organization' page
    And fill 'New Organization' modal form on 'Organization' page with 'start date' biger than 'end date'
    And click 'Crear' button on 'New Organization' modal on 'Organization' page
    Then 'La fecha de inicio de actividades debe ser menor a la fecha final' information message should be displayed.