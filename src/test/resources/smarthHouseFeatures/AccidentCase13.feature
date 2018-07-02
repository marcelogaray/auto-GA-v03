# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Verify when delete an accident a modal to confirm is opened.
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And I select accident option on menú
    When I click on accident delete option
    Then I verify if a confirm delete modal is opened