package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHEquipmentType;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

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

    @And("^fill properly credentials in 'Login' modal$")
    public void fill_credentials_in_Login_modal() throws Throwable {
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
    public void required_data_Eq_Type(DataTable defaulData) throws Throwable {
        List<Map<String, String>> data = defaulData.asMaps(String.class, String.class);
        equipmentType.setData(data.get(0).get("EqTypeName"), data.get(0).get("Description"));
    }

    @When("^click on 'Crear' button on modal 'Nuevo registro de tipo de equipo'$")
    public void click_on_Crear_button_on_modal_Nuevo_registro_de_tipo_de_equipo() throws Throwable {
        equipmentType.clickButtonOk();
    }

    @Then("^verify new registered equipment type is shown in equipment type page$")
    public void verify_new_registered_Equipment_type(DataTable eqType) throws Throwable {
        List<Map<String, String>> data = eqType.asMaps(String.class, String.class);
        Assert.assertTrue(equipmentType.verifyListEquipmentType(data.get(0).get("EqTypeName")), "Error, tipo de equipo no esta presente");
    }
}