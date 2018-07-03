# Login feature review the behavior in thie feature
Feature: ORG_Case2

  Scenario: Validate that the organization code to be registered are unique
    Given I loging to 'SMARTHOUSE' page
    When I fill properly credentials with admin user
    And I go to 'Estructura Organizacional' on 'Header' page
    And I click on 'Detail' button on 'Gerencia General' item on 'Organization List' page
    And I click on 'Nueva Area' button on 'Organization Detail' page
    And I fill Organization information, specially Organization Code with 'ORG-0001'
    And I click on 'Crear' button in 'Crear Area' modal form
    Then I should see the alert with the next text: 'Already exists a Organization with the code ORG-0001'
    And  I logOut From 'SMARTHOUSE' Page
