package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAccident shAccident;
    private SHAccidentFormModal shAccidentFomModal;
    private SHSwalNotification shSwalNotification;
    private SHAccidentVieWmodal shAccidentVieWmodal;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^click on 'Accidentes' button on navigation NavigationBar$")
    public void clikOnAccTabNav() throws Throwable {
        shAccident = headerWithLogin.clickAccidentTab();
    }

    @When("^click on 'Registrar Accidente' button on Accident Page$")
    public void clickOnBtnRegAccPage() throws Throwable {
        shAccidentFomModal = shAccident.ClickRegistarAccBtn();
    }

    @Then("^verify that 'Registro Accidente'Form Modal is Displayed$")
    public void checkModalFomDisplayed() throws Throwable {
        Assert.assertTrue(shAccidentFomModal.isModalDialogPresent(), "El Formulario no se Cargo Correctamente");
    }

    @When("^required data is filled on 'Registro Accidente' Modal Form$")
    public void fillModalFormWithValidReqData() throws Throwable {
        shAccidentFomModal.fillModalFomFullData();
    }

    @When("^click on 'Crear' button form 'Registrar Accidente' Modal Form$")
    public void clikOnBtnCrearAccModFom() throws Throwable {
        shSwalNotification = shAccidentFomModal.clickBtnCrear();
    }

    @When("^click on 'aceptar' button from Alert message of Success$")
    public void verifySuccessMessage() throws Throwable {
        shSwalNotification.clickAcceptBtn();
    }

    @Then("^click on view of  new registered accident on accedent page$")
    public void clickViewModal(DataTable accientCode) throws Throwable {
        List<Map<String, String>> data = accientCode.asMaps(String.class, String.class);
        shAccidentVieWmodal = shAccident.clickViewModal(data.get(0).get("code"));
    }

    @Then("verify default data inserted into 'Registrar Accidente' Modal Form is shown into 'Ver Accidente Registrado' modal view")
    public void verifyDefaulDataIsShown(DataTable defaulData) throws Throwable {
        List<Map<String, String>> data = defaulData.asMaps(String.class, String.class);
        Assert.assertTrue(shAccidentVieWmodal.getEmployee().equals(data.get(0).get("employeeCode")), "El Codigo de Empleado no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getTitle().equals(data.get(0).get("titleAcc")), "El Titulo del Acciente no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getCode().equals(data.get(0).get("codeAcc")), "El Codigo del accidente o no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getLevelRisk().equals(data.get(0).get("lvlRiskCode")), "El Nivel de Riesgo no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getAcidentType().equals(data.get(0).get("accTypeCode")), "El Tipo de Acciente no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getDateEvent().equals(data.get(0).get("dateEvent")), "La Fecha del Accidente no es la misma");
        Assert.assertTrue(shAccidentVieWmodal.getDescription().equals(data.get(0).get("Description")), "La descripcion del accidente no es la misma");
        Assert.assertTrue(shAccidentVieWmodal.getStatus().equals(data.get(0).get("statusCode")), "El Estado del accidente no es el mismo");
    }
}