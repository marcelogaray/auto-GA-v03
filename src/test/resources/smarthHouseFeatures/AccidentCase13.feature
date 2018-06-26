# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Home page is displayed once set credential in login page
    Given Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And I select accident option on menú
    When I click on accident delete option
    Then I verify if a confirm delete modal is opened