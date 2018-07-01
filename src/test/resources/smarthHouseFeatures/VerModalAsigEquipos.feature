# Login feature review the behavior in thie feature
Feature:show modal 'Asignacion de equios'
  Scenario: Validate that the modality of equipment assignment is displayed when the 'nueva asignacion' button is clicked
    Given insert login
    And press the button 'asignacion de equipos'
    And press 'nueva asignacion'
    And press 'X' para salir