# Login feature review the behavior in thie feature
Feature: ORG_Case7

  Scenario: Verificar que al registrar un area la fecha de inicio sea menor a la fecha de fin de actividades
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page
    And click 'Nueva Area' button on 'Organization' page
    And fill 'New Organization' modal form on 'Organization' page with 'start date' biger than 'end date'
    And click 'Crear' button on 'New Organization' modal on 'Organization' page
    Then 'La fecha de inicio de actividades debe ser menor a la fecha final' information message should be displayed.
    And click 'Aceptar' button on 'Message Information' modal on 'Organization' page
    And click 'Cancelar' button on 'New Organization' modal form
    And I logOut Form 'SMARTHOUSE' Page