Feature: RegAccForm_CancelCloseBtn

  Scenario: Form is Deploy once "Registrar Accidente" is clicked
    Given 'SMARTHOUSE's' page is loaded
    And set admin's credentials on 'Login' page
    And Verify "Registro Accidente" Form is Deploy
    And Verify Cancle, Close Btn
