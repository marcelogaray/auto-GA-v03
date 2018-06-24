package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAccident accident;
    private SHAccidentFormModal accidentFormModal;

    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^I select accident menu 'Accidentes'$")
    public void openRegisterModal() throws Throwable {
        accident = headerWithLogin.clickAccidentTab();
    }

    @And("^I click on 'Registrar accidente' button$")
    public void selectAccidentMenu() throws Throwable {
        accidentFormModal = accident.clickRegistarAccBtn();
    }

    @And("^Close modal 'Registro de Accidente' from 'x' button$")
    public void closeModalAccidentRegister() throws Throwable {
        accidentFormModal.closeFromXButtonHeader();
    }

    @And("^Close modal 'Registro de Accidente' from 'Cancel' button$")
    public void closeModalAccidentRegisterFromCancel() throws Throwable {
        accidentFormModal.closeFromCancelButton();
    }

    @Then("^I verify if the modal is not present$")
    public void verifyModalNotPresent() throws Throwable {
        Assert.assertEquals(accident.isAccientePresent(), false, "Modal was not close");
    }
}