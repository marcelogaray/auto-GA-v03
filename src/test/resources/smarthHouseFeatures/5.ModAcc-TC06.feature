# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify 'Crear' button from 'Registrar Accidente' Modal Form is Disable when required data is filled without one of them
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    When required data is filled witout one of them on 'Registro Accidente' Modal Form
      | employeeCode | titleAcc         | codeAcc | lvlRiskCode | accTypeCode | dateEvent  | Description | statusCode |
      | 1            | Titulo Accidente | Codigo  | 1           | 1           | 05-05-2018 | Descripcion | 1          |
    Then verify 'Crear' button from 'Registro Accidente' Modal Form is disable
    And I close de 'Registro Accidente'Form Modal
    And  I logOut Form 'SMARTHOUSE' Page