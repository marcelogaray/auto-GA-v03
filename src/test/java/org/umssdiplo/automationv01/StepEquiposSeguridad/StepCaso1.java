package org.umssdiplo.automationv01.StepEquiposSeguridad;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepCaso1 {

    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHEquiposSegu shEquiposSegu;
    private SHEquiposSegurModal shEquiposSegurModal;

    @Given("^I loging to 'SMARTHOUSE' page$")
    public void iLogingToSMARTHOUSEPage() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with adminuser$")
    public void iFillProperlyCredentialsWithAdminuser() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^click on 'Equipos de Seguridad' button on navigation NavigationBar$")
    public void clickOnEquiposDeSeguridadButtonOnNavigationNavigationBar() throws Throwable {
        shEquiposSegu = headerWithLogin.clickequiposTab();
    }

    @And("^click on 'Nuevo registro de equipos' button on Accident Page$")
    public void clickOnNuevoRegistroDeEquiposButtonOnAccidentPage() throws Throwable {
        shEquiposSegurModal = shEquiposSegu.ClickRegistarEquipoBtn();
    }

    @When("^required data is filled witout one of them on 'nuevo registro' Modal Form$")
    public void requiredDataIsFilledWitoutOneOfThemOnNuevoRegistroModalForm() throws Throwable {
        shEquiposSegurModal.fillModalFomOneIncData();
    }

    @Then("^cilck on 'Crear' button from 'Nuevo registro'$")
    public void cilckOnCrearButtonFromNuevoRegistro() throws Throwable {
        shEquiposSegurModal = shEquiposSegu.ClickCrear();
    }
}
