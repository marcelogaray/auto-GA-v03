#
Feature: ORG_Case1

  Scenario: Verificar que el boton de creacion de areas solo este habilitado en las areas activas
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page
    And click 'Nueva Area' button on 'Organization' page
    And click 'Cancelar' button on 'New Organization' modal form
    And go to 'Home' on 'Header' page
    And go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General Disabled' option on 'Organization page'
    Then 'Nueva Area' button is not present on 'Organization' page
    And  I logOut From 'SMARTHOUSE' Page