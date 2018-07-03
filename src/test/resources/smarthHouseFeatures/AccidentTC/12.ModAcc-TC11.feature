# Accident feature review the behavior in thie feature
Feature: SHAccident

  Scenario: Verify if when remove an value of a field required the button 'Guardar' is disabled
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And click on 'Accidentes' button on navigation NavigationBar
    When I click on edit button on list of accidents
    And I set empty value to field 'Titulo' on form edit modal
    Then Verify if 'Guardar' button is disabled
    And Cancel button on modal edit for close modal
    And  I logOut From 'SMARTHOUSE' Page