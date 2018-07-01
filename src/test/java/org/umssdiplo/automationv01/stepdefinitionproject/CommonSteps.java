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
    public void clik_On_Accidentes_On_Navigarion_Bar() throws Throwable {
        shAccident = headerWithLogin.clickAccidentTab();
    }

    @When("^click on 'Registrar Accidente' button on Accident Page$")
    public void click_On_Reg_Accident_Btn_On_Acc_Page() throws Throwable {
        shAccidentFomModal = shAccident.ClickRegistarAccBtn();
    }

    @Then("^verify that 'Registro Accidente'Form Modal is Displayed$")
    public void check_Accident_Modal_Form_Displayed() throws Throwable {
        Assert.assertTrue(shAccidentFomModal.isModalDialogPresent(), "El Formulario no se Cargo Correctamente");
    }

    @And("^I close de 'Registro Accidente'Form Modal$")
    public void close_Accident_Modal_Form() throws Throwable {
        shAccidentFomModal.closeModalDialog();
    }

    @When("^one required data is filled  on 'Registro Accidente' Modal Form$")
    public void fill_Modal_Form_WithOne_Valid_Req_Data() throws Throwable {
        shAccidentFomModal.fillModalFomOneReqData();
    }

    @When("^required data is filled on 'Registro Accidente' Modal Form$")
    public void fill_Modal_Form_With_Valid_Req_Data() throws Throwable {
        shAccidentFomModal.fillModalFomFullData();
    }

    @When("^required data is filled witout one of them on 'Registro Accidente' Modal Form$")
    public void fill_Modal_Form_Without_One_Valid_Req_Data() throws Throwable {
        shAccidentFomModal.fillModalFomOneIncData();
    }

    @When("^click on 'Crear' button form 'Registrar Accidente' Modal Form$")
    public void clik_On_Crear_Btn_Accident_Mododal_Form() throws Throwable {
        shSwalNotification = shAccidentFomModal.clickBtnCrear();
    }

    @Then("^verify Alert message of Success message is shown for new accident register$")
    public void verify_Success_Message_is_Displayed() throws Throwable {
        Assert.assertTrue(shSwalNotification.isDialogPresent(), "Error, El dialogo no esta presente");
        Assert.assertTrue(shSwalNotification.isSuccess(), "Error, No se muestra success");
    }
    @Then("^'Crear' button from 'Registro Accidente' Modal Form  should be disable$")
    public void verify_Crear_Btn_Modal_Form_Disable() throws Throwable {
        Assert.assertTrue(shAccidentFomModal.isCrearBtnEnable(), "Error, El boton crear no esta deshabilitado");
    }
    @When("^click on 'aceptar' button from Alert message of Success$")
    public void clik_Accept_Btn_Alert() throws Throwable {
        shSwalNotification.clickAcceptBtn();
    }

    @Then("^verify new registered accident \"([^\"]*)\" is shown in accedent page$")
    public void verify_Registered_Accident_Shown(String codigo) throws Throwable {
        Assert.assertTrue(shAccident.verifyListelement(codigo), "Error");
    }
    @Then("^click on view of  new registered accident on accedent page$")
    public void click_View_Modal_From_Accident_Page(DataTable accientCode) throws Throwable {
        List<Map<String, String>> data = accientCode.asMaps(String.class, String.class);
        shAccidentVieWmodal = shAccident.clickViewModal(data.get(0).get("code"));
    }

    @Then("verify default data inserted into 'Registrar Accidente' Modal Form is shown into 'Ver Accidente Registrado' modal view")
    public void verify_Defaul_Data_IsShown(DataTable defaulData) throws Throwable {
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
        @And("^I logOut Form 'SMARTHOUSE' Page$")
    public void logOut_From_SMATHOUSE_Page() throws Throwable {
        headerWithoutLogin.openLoginPage();
        login.clicklogOutButton();
    }

    @Then("^'Crear' button from 'Registro Accidente' Modal Form  should be enable$")
    public void verify_Crear_Btn_Modal_Fom_isEnable() throws Throwable {
        Assert.assertFalse(shAccidentFomModal.isCrearBtnEnable(), "Error, El boton crear no esta habilitado");
    }
}