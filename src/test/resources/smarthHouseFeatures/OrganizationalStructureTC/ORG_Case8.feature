# Login feature review the behavior in thie feature
Feature: ORG_Case8

  Scenario: Verificar que al presionar el boton eliminar un area esta ya no aparezca en la lista de areas
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And go to 'Estructura Organizacional' on 'Header' page
    And navigate to 'Gerencia General' option on 'Organization' page
    And click 'Eliminar' button on 'Organization' page.
    And click 'Aceptar' button on 'Information Message' modal
    Then the area should not be present in the list
    And I logOut Form 'SMARTHOUSE' Page