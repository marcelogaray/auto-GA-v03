package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.dataProviders.FileReaderManager;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.managepage.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHAssignation;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHEmployee employee;
    private SHNewEmployeeForm employeeForm;
    private Employee employeeData;
    private SHAssignation assignment;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @When("^fill properly credentials in 'Login' modal$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @When("^Go to 'Asignacion de Equipos' on 'Header' page, press the button 'Nueva Asignacion' on 'Asignacion de Equipos' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page_press_the_button_Nueva_Asignacion_on_Asignacion_de_Equipos_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
        assignment.newAssignment();
    }

    @When("^user selects an employee, a equipment and enters observations of the assignment made on 'Asignar Equipo' modal$")
    public void user_selects_an_employee_a_equipment_and_enters_observations_of_the_assignment_made() throws Throwable {
        assignment.setData();

    }

    @When("^click over 'Crear' button on 'Asignar equipo' modal$")
    public void click_over_Crear_button_on_Asignar_equipo_modal() throws Throwable {
        assignment.registerNewAssignment();
    }

    @Then("^'La asignacion fue registrada correctamente' information message should be displayed on 'Asignacion de Equipos' page$")
    public void la_asignacion_fue_registrada_correctamente_information_message_should_be_displayed() throws Throwable {
        assignment.registeredAssignment();
    }

    @And("^I logOut From 'SMARTHOUSE' Page$")
    public void logOut_From_SMATHOUSE_Page() throws Throwable {
        headerWithoutLogin.openLoginPage();
        login.clickLogOutButton();
    }

    @And("^go to 'Employee' on 'Header' page$")
    public void load_employee_page() throws Throwable {
        employee = headerWithLogin.clickEmployeeTab();
    }

    @And("^click over 'Nuevo Empleado' button on 'Employee' page$")
    public void open_new_employee_page() throws Throwable {
        employeeForm = employee.clickNewEmployeeButton();
    }

    @And("^fill new employee form on 'New Employee Form' page with duplicate 'employee code'$")
    public void click_over_new_employee_button() throws Throwable {
        employeeData = FileReaderManager.getInstance().getJsonReader().getEmployeeData();
        employeeForm.fillNewEmployeeForm(employeeData);
    }

    @And("^click over 'Guardar' button on 'New Employee Form' page$")
    public void click_over_guardar_new_employee_button() throws Throwable {
        employeeForm.clickAcceptNewEmployee();
    }

    @Then("^'El codigo de empleado ya se encuentra asignado a otro empleado' information message should be displayed$")
    public void is_message_code_duplicated_showed() throws Throwable {
        String messageExpected = String.format("El codigo de empleado %s ya se encuentra asignado a otro empleado", employeeData.getEmployeeCode());
        Assert.assertEquals(employeeForm.getAlertMessage(), messageExpected);
    }
}