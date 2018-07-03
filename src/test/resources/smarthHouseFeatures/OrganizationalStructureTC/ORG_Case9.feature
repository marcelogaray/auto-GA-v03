# Login feature review the behavior in thie feature
Feature: ORG_Case9

  Scenario: Verificar que al registrar un item en una area esta aparezca en la lista de items
    Given I loging to 'SMARTHOUSE' page
    When fill properly credentials in 'Login' modal
    And go to 'Estructura Organizacional' on 'Header' page
    And navigate to 'Gerencia General' option on 'Organization' page
    And click 'Nuevo Item' button on 'Organization' page
    And fill 'New Item' modal form on 'Organization' page
    And click 'Crear' button on 'New Item' modal on 'Organization' page
    And verify 'El Item fue creado correctamente' message info is displayed on 'Organization' page
    And click 'Aceptar' button on 'Message Information' modal on 'Organization' page
    Then new item must be present in items list
    And I logOut From 'SMARTHOUSE' Page