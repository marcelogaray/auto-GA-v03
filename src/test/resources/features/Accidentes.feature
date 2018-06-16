Feature: Login

  Scenario: Home page is displayed once access to Accidents link
    Given 'SmathHome' page is loaded
    And Access to 'Accidents' link
    And click into 'Registrar Accidente' link
    And verify "Registro Accidente" Form is Present
