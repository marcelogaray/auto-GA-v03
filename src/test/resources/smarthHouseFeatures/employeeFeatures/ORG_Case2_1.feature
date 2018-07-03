# Login feature review the behavior in thie feature
Feature: ORG_Case2.1

  Scenario: Check that the 'Crear Area' form is displayed, click on the 'Nueva Area' button
    Given I loging to 'SMARTHOUSE' page
    When I fill properly credentials with admin user
    And I go to 'Estructura Organizacional' on 'Header' page
    And click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page
    And I click on 'Nueva Area' button on 'Organization Detail' page
    Then I should see the 'Crear Area' modal form
    And I click on cancel button of form of new organization
    And  I logOut From 'SMARTHOUSE' Page