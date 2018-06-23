package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHAssignation;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class AssignmentSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAssignation assignment;

    @Given("^I loging to 'SMARTHOUSE' page with properly credentials$")
    public void i_loging_to_SMARTHOUSE_page_with_properly_credentials() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @Given("^I fill properly credentials with user admin$")
    public void i_fill_properly_credentials_with_user_admin() throws Throwable {
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
}