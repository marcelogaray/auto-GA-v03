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
    private SHAssignModalForm modalForm;

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

    @When("^Click on the 'Nueva asignación' button on 'Asignacion de equipos' page$")
    public void click_on_the_Nueva_asignación_button_on_Asignacion_de_equipos_page() throws Throwable {
        modalForm = assignment.clickFormModal();
    }

    @When("^The modal 'Asignar equipo' is displayed$")
    public void the_modal_Asignar_equipo_is_displayed() throws Throwable {
        Assert.assertTrue(modalForm.isFormModalPresent());
    }

    @When("^Just enter data in the 'Observaciones' field on the 'Asignar equipo' modal$")
    public void just_enter_data_in_the_Observaciones_field_on_the_Asignar_equipo_modal() throws Throwable {
        modalForm.setObservations();
    }

    @Then("^The 'Crear' button is not enabled on the 'Asignar equipo' modal$")
    public void the_Crear_button_is_not_enabled_on_the_Asignar_equipo_modal() throws Throwable {
        Assert.assertFalse(modalForm.isButtonCreateEnabled());
        modalForm.cancelAssignment();
    }
}