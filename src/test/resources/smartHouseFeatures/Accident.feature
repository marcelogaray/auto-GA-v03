# Login feature review the behavior in thie feature
Feature: SHAccident

  Scenario: The user close the dialog to register accidents
    Given 'SMARTHOUSE' page is loaded
    And Access to 'Accidents' link
    And click into 'Registrar Accidente' link
    And click on 'x' for close the modal
    And click into 'Registrar Accidente' link one more time
    And click on 'Cancel' button
