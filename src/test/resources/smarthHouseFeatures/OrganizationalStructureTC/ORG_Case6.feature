# Login feature review the behavior in thie feature
Feature: ORG_Case6

  Scenario: Verificar que no se realice la eliminacion de un Item si es que este se encuentra asignado a un empleado
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General' option on 'Organization' page
    And click 'Eliminar' button on 'Item ITM-001' element on 'Organization' page
    Then 'El item con id XX no puede eliminarse ya que se encuentra asignado a un empleado' information message should be displayed.
    And click 'Aceptar' button on 'Message Information' modal on 'Organization' page
    And I logOut Form 'SMARTHOUSE' Page