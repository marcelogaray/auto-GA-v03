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

    @Then("^verify new registered equipment type \"([^\"]*)\" is shown in equipment type page$")
    public void verify_new_registered_equipment_type_is_shown_in_equipment_type_page(String name) throws Throwable {
        Assert.assertTrue(equipmentType.verifyListEquipmentType(name), "No esta registrado");
    }
}