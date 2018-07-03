# Login feature review the behavior in thie feature
Feature: SHLogin

  Scenario: Verify if datas is recovery when click on view accident
    Given I loging to 'SMARTHOUSE' page
    And I fill properly credentials with admin user
    And I open Accident tab option
    When I click on view icon
    Then Verify if the accidentType value is correct
    Then Verify if the code value is correct
    Then Verify if the date event value is correct
    Then Verify if the description value is correct
    Then Verify if the employee value is correct
    Then Verify if the level risk value is correct
    Then Verify if the status value is correct
    Then Verify if the title value is correct
    And Click button close on modal view accident
    And  I logOut From 'SMARTHOUSE' Page

