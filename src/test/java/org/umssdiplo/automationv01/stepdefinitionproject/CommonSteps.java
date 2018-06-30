package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAssignation assignment;
    private SHAssignModalEdit modalEdit;

    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }
    @When("^Go to 'Asignacion de Equipos' on 'Header' page,assignments are listed$")
    public void go_to_Asignacion_de_Equipos_on_Header_page_assignments_are_listed() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
    }
    @When("^Click on the edit button to the first assignment on 'Asignacion de equipos' page$")
    public void click_on_the_edit_button_to_the_first_assignment_on_Asignacion_de_equipos_page() throws Throwable {
       modalEdit = assignment.clickEditModal();
    }

    @When("^The modal 'Editar Asignación' is displayed, with the list of assignments made to that employee$")
    public void the_modal_Editar_Asignación_is_displayed_with_the_list_of_assignments_made_to_that_employee() throws Throwable {

    }

    @Then("^Verify if the employee's name is correct$")
    public void verify_if_the_employee_s_name_is_correct() throws Throwable {

    }

    @Then("^Verify if the equipment assignment is correct$")
    public void verify_if_the_equipment_assignment_is_correct() throws Throwable {

    }



}