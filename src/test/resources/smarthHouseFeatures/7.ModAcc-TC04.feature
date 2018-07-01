# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify new registered accidente is shown in the accidente page
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    And required data is filled on 'Registro Accidente' Modal Form
      | employeeCode | titleAcc         | codeAcc | lvlRiskCode | accTypeCode | dateEvent  | Description | statusCode |
      | 1            | Titulo Accidente | Codigo1 | 1           | 1           | 05-05-2018 | Descripcion | 1          |
    And click on 'Crear' button form 'Registrar Accidente' Modal Form
    When  click on 'aceptar' button from Alert message of Success
    Then verify new registered accident is shown in accedent page
      | codeAcc |
      | Codigo1 |
    And  I logOut Form 'SMARTHOUSE' Page