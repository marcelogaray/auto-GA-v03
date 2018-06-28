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
    private SHAssignmentNewModal assignmentNewModal;
    private SHAssignmentEditModal assignmentEditModal;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }
    @Given("^Click on 'Asignación de Equipos' button on Header page$")
    public void click_on_Asignación_de_Equipos_button_on_Header_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
        assignment.isViewButtonVisible();
    }

    /*@Given("^Click on 'Nueva asignación' button on 'Asignacion de equipos' page$")
    public void click_on_Nueva_asignación_button_on_Asignacion_de_equipos_page() throws Throwable {
        assignmentNewModal = assignment.newAssignment();
    }

    @When("^The required information is filled out in the form$")
    public void the_required_information_is_filled_out_in_the_form() throws Throwable {
        assignmentNewModal.setData();
    }

    @When("^Click on 'Crear' button on modal 'Asignar equipo'$")
    public void click_on_Crear_button_on_modal_Asignar_equipo() throws Throwable {
        assignmentNewModal.registerNewAssignment();
        assignmentNewModal.registeredAssignment();
    }
*/
    @When("^Click on the edit button of an assignment$")
    public void click_on_the_edit_button_of_an_assignment() throws Throwable {
        assignmentEditModal = assignment.clicViewEditModal();
        assignmentEditModal.clickEditInModal();
    }

    @Then("^verify the id of the employee in the form 'Editar asignacion'$")
    public void verify_the_id_of_the_employee_in_the_form_Editar_asignacion() throws Throwable {
        Assert.assertEquals(assignmentEditModal.getEmployee(), "EMP-1-Ruben Moscoso", "El codigo del empleado es distinto");
    }

    @Then("^verify the id of the equipment in the form 'Editar asignacion'$")
    public void verify_the_id_of_the_equipment_in_the_form_Editar_asignacion() throws Throwable {
        Assert.assertEquals(assignmentEditModal.getEquipment(), "1", "El codigo del equipo es diferente" );
    }

    @Then("^verify 'Observaciones' in the form 'Editar asignacion'$")
    public void verify_Observaciones_in_the_form_Editar_asignacion() throws Throwable {
        Assert.assertEquals(assignmentEditModal.getObservations(), "Asignacion", "Las observaciones no corresponden a este registro");
    }
}