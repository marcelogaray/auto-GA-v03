#
Feature: SHOrganization

  Scenario: Verificar que el codigo de empleado sea unico cuando se guarda el empleado en el formulario de registro
    Given I loging to 'SMARTHOUSE' page
    When fill properly admin credentials
    And go to 'Employee' on 'Header' page
    And click over 'Nuevo Empleado' button on 'Employee' page
    And fill new employee form on 'New Employee Form' page with duplicate 'employee code'
    And click over 'Guardar' button on 'New Employee Form' page
    Then 'El codigo de empleado ya se encuentra asignado a otro empleado' information message should be displayed