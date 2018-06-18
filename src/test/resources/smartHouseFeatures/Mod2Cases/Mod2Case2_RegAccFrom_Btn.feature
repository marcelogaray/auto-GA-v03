Feature: RegAccForm_Btn_Enable/Disable

  Scenario: Form "Crear" is enable once Full data Form is filled
    Given 'SMARTHOUSE's' page is loaded
    And set admin's credentials on 'Login' page
    And Verify "Registro Accidente" Form is Deploy
    And Fill full data into Form
    And Verify "Crear" button is Enable
