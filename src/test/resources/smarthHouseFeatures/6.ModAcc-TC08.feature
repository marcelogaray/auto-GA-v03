# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify Success Alert message is shown after click 'Crear' buton form 'Registro Accidente' Modal Form
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    And required data is filled on 'Registro Accidente' Modal Form
      | employeeCode | titleAcc         | codeAcc | lvlRiskCode | accTypeCode | dateEvent  | Description | statusCode |
      | 1            | Titulo Accidente | Codigo  | 1           | 1           | 05-05-2018 | Descripcion | 1          |
    When click on 'Crear' button form 'Registrar Accidente' Modal Form
    Then  verify Alert message of Success message is shown for new accident register
    And click on 'aceptar' button from Alert message of Success
    And  I logOut Form 'SMARTHOUSE' Page