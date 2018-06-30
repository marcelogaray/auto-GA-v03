package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHAssignation;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAssignation assignment;

    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @When("^Go to 'Asignacion de Equipos' on 'Header' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
    }

    @When("^The assignments are listed on 'Asignacion de equipos' page$")
    public void the_assignments_are_listed_on_Asignacion_de_equipos_page() throws Throwable {
        Assert.assertTrue(assignment.assignationIsPresent(), "No se listan las asignaciones realizadas");
    }

    @Then("^Verify that the first employee on the list is \"([^\"]*)\" on 'Asignacion de equipos' page$")
    public void verify_that_the_first_employee_on_the_list_is_on_Asignacion_de_equipos_page(String name) throws Throwable {
        Assert.assertTrue(assignment.verifyAssignments(name), "No esta en la lista");
    }

    @Then("^Verify that all employees to whom equipment was assigned are listed on 'Asignacion de Equipos' page$")
    public void verify_that_all_employees_to_whom_equipment_was_assigned_are_listed_on_Asignacion_de_Equipos_page() throws Throwable {

    }
}