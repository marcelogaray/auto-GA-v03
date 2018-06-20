# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Home page is displayed once set credential in login page
    Given Given I loging to 'SMARTHOUSE' page with properly credentials
    And I fill credentials with admin user
