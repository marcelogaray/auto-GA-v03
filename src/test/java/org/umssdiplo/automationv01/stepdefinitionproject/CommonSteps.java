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
    private SHAccident shAccident;
    private SHAccidentFormModal shAccidentFomModal;
    private SHSwalNotification shSwalNotification;

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

    @Then("^verify new registered accident \"([^\"]*)\" is shown in accedent page$")
    public void verifyRegAccidentShown(String codigo) throws Throwable {
        Assert.assertTrue(shAccident.verifyListelement(codigo), "Error");
    }
}