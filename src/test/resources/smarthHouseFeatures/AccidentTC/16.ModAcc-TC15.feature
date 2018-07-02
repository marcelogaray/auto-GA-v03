# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Verify when click on 'Aceptar' button on modal confirm deletion delete the accident.
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And I select accident option on menú
    And I obtain the count of accidents registers
    When I click on accident delete option
    And I click on 'Aceptar' button the accident selected is deleted
    Then Verify the size of accident registers decrease in a one item
