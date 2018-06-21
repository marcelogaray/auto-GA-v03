package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.SHAssignation;
import org.umssdiplo.automationv01.core.managepage.SHLogin;

public class AssignmentSteps {
    private SHLogin login;
    private HeaderWithLogin menu;
    private SHAssignation assignmnet;
    @Given("^I loging to 'SMARTHOUSE' page with properly credentials$")
    public void i_loging_to_SMARTHOUSE_page_with_properly_credentials() throws Throwable {
        login.fillCredentials();
    }
    @When("^Go to 'Asignacion de Equipos' on 'Header' page, press thee button 'Nueva Asignacion' on 'Asignacion de Equipos' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page_press_the_button_Nueva_Asignacion_on_Asignacion_de_Equipos_page() throws Throwable {
        menu.clickAssignTab();
        assignmnet.addAssignment();
    }
    @When("^user selects an employee, a team and enters observations of the assignment made$")
    public void user_selects_an_employee_a_team_and_enters_observations_of_the_assignment_made() throws Throwable {
        assignmnet.setData();
    }
    @When("^click over 'Crear' button on 'Asignar equipo' modal$")
    public void click_over_Crear_button_on_Asignar_equipo_modal() throws Throwable {
        assignmnet.registerNewAssignment();
    }
    @Then("^'La asignacion fue registrada correctamente' information message should be displayed$")
    public void la_asignacion_fue_registrada_correctamente_information_message_should_be_displayed() throws Throwable {
        assignmnet.registeredAssignment();
    }
}
