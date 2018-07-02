# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Home page is displayed once set credential in login page
    Given I loging to 'SMARTHOUSE' page
    And fill properly credentials in 'Login' modal
    And  I logOut From 'SMARTHOUSE' Page
