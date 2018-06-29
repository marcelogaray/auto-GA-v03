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
   private SHEquipmentType equipmentType;
   private SHEquipmentTypeForm equipmentTypeForm;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @Given("^Click on 'Equipos de Seguridad' button on Header page$")
    public void click_on_Equipos_de_Seguridad_button_on_Header_page() throws Throwable {
        equipmentType = headerWithLogin.clickEquipmentTab();

    }

    @Given("^Click on the button 'Ver tipos de equipos registrados'$")
    public void click_on_the_button_Ver_tipos_de_equipos_registrados() throws Throwable {
        equipmentType.isViewButtonVisible();
        equipmentType.clickViewEquipmentType();
    }

    @Given("^Click on the button 'Nuevo registro'$")
    public void click_on_the_button_Nuevo_registro() throws Throwable {
        equipmentType.isVisibleViewList();
        equipmentType.clickRegisterNewEquipmentType();
    }

    @When("^required data is filled on 'Nuevo registro de tipo de equipo' modal form$")
    public void required_data_is_filled_on_Nuevo_registro_de_tipo_de_equipo_modal_form() throws Throwable {
        equipmentType.setData();
    }

    @When("^click on 'Crear' button on modal 'Nuevo registro de tipo de equipo'$")
    public void click_on_Crear_button_on_modal_Nuevo_registro_de_tipo_de_equipo() throws Throwable {
        equipmentType.clickButtonOk();
    }

    @When("^I click on view button on list of  equipment types list$")
    public void i_click_on_view_button_on_list_of_equipment_types_list() throws Throwable {

    }

    @Then("^verify the name of the equipment type in the modal 'Ver tipo de equipo'$")
    public void verify_the_name_of_the_equipment_type_in_the_modal_Ver_tipo_de_equipo() throws Throwable {

    }

    @Then("^verify the desciption of the equipment type in the modal 'Ver tipo de equipo'$")
    public void verify_the_desciption_of_the_equipment_type_in_the_modal_Ver_tipo_de_equipo() throws Throwable {

    }


























/*
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
    }*/
}