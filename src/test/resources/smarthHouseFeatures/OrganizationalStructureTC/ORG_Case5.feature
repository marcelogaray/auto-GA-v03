# Login feature review the behavior in thie feature
Feature: ORG_Case5

  Scenario: Verificar que al presionar el boton eliminar un area no permita la eliminacion si es que este tiene asociado areas o empleados activos
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General' option on 'Organization' page
    And click 'Eliminar' button on 'Organization' page
    Then 'El area con id XX no puede eliminarse ya que tiene areas y/o empleados asignados' information message should be displayed
    And click 'Aceptar' button on 'Message Information' modal on 'Organization' page
    And  I logOut From 'SMARTHOUSE' Page