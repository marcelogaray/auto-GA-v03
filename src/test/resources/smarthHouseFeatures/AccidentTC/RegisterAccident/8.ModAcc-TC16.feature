# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify that data inserted into 'Registrar Accidente' Modal Form is the same shown on 'Ver Accidente Registrado' modal view
    Given I loging to 'SMARTHOUSE' page
    And fill properly credentials in 'Login' modal
    And click on 'Accidentes' button on navigation NavigationBar
    And click on 'Registrar Accidente' button on Accident Page
    And required data is filled on 'Registro Accidente' Modal Form
      | employeeCode | titleAcc         | codeAcc | lvlRiskCode | accTypeCode | dateEvent  | Description | statusCode |
      | 1            | Titulo Accidente | Codigo2 | 1           | 1           | 05-05-2018 | Descripcion | 1          |
    And click on 'Crear' button form 'Registrar Accidente' Modal Form
    And  click on 'aceptar' button from Alert message of Success
    When click on view of  new registered accident on accedent page
      | code   |
      | Codigo2 |
    Then verify default data inserted into 'Registrar Accidente' Modal Form is shown into 'Ver Accidente Registrado' modal view
      | employeeCode | titleAcc         | codeAcc | lvlRiskCode | accTypeCode | dateEvent                    | Description | statusCode |
      | 18           | Titulo Accidente | Codigo2 | 1           | 1           | 2018-05-05T00:00:00.000+0000 | Descripcion | 1          |
    And I click on close button form view Accident  modal form from Accident page
    And I logOut From 'SMARTHOUSE' Page