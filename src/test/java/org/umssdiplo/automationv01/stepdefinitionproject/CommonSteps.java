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
    private SHAssignModalDelete modalDelete;
    private countAssignments;

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

    @When("^Click on the dumpster button to remove the assignment on 'Asignacion de equipos' page$")
    public void click_on_the_dumpster_button_to_remove_the_assignment_on_Asignacion_de_equipos_page() throws Throwable {
        modalDelete = assignment.clicViewModal();
    }

    @When("^The modal 'Editar Asignación' is displayed, with the list of assignments made to that employee$")
    public void the_modal_Editar_Asignación_is_displayed_with_the_list_of_assignments_made_to_that_employee() throws Throwable {
        Assert.assertTrue(modalDelete.isEditDialogPresent());
    }

    @When("^Click on the dumpster button to remove the assignment on the modal 'Editar Asignacion'$")
    public void click_on_the_dumpster_button_to_remove_the_assignment_on_the_modal_Editar_Asignacion() throws Throwable {
        modalDelete.deleteOnEditForm();
    }

    @When("^The modal 'Confirmar eliminacion' is displayed$")
    public void the_modal_Confirmar_eliminacion_is_displayed() throws Throwable {
        Assert.assertTrue(modalDelete.isConfirmModalPresent());
    }

    @When("^Click on the 'Aceptar' button, on the modal 'Confirmar eliminacion'$")
    public void click_on_the_Aceptar_button_on_the_modal_Confirmar_eliminacion() throws Throwable {
        modalDelete.acceptDelete();
    }

    @And("^The message 'La asignacion se elimino correctamente' is displayed$")
    public void the_message_La_asignacion_se_elimino_correctamente_is_displayed() throws Throwable {
        modalDelete.messageDelete();
    }

    @Then("^The assignment is not present in the system$")
    public void the_assignment_is_not_present_in_the_system() throws Throwable {
        modalDelete = assignment.clicViewModal();
        int assignments = countAssignments-1;
        Assert.assertEquals(modalDelete.getSizeAssignments(),assignments, "La asignacion no fue eliminada");
    }
}