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
    private SHAccidentEditFormModal shAccidentEditFormModal;

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
    public void fillModalFormWithValidReqData() {
        shAccidentFomModal.fillModalFomFullData();
    }

    @Then("^'Crear' button from 'Registro Accidente' Modal Form  should be enable$")
    public void verifyCrearBtnModalFomEnable() {
        Assert.assertFalse(shAccidentFomModal.isCrearBtnEnable(), "Error, El boton crear no esta habilitado");
    }

    @And("^click on 'Crear' button on modal 'Registro de Accidente'$")
    public void clickCreateButton() throws Throwable {
        shAccidentFomModal.clickCreateButton();
    }

    @When("^I click on edit button on list of accidents$")
    public void clickEditButton() throws Throwable {
        shAccidentEditFormModal = shAccident.clickEditButton();
    }

    @When("^I set empty value to field 'Titulo' on form edit modal$")
    public void setEmptyValueTitleField() throws Throwable {
        shAccidentEditFormModal.setTitleField();
    }

    @Then("^Verify if 'Guardar' button is disabled$")
    public void checkSaveButtonIsDisabled() throws Throwable {
        Assert.assertTrue(shAccidentEditFormModal.isSaveBtnEnable(), "El botón 'Guardar' no esta deshabilitado.");
    }
}