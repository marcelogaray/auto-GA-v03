package org.umssdiplo.automationv01.StepEquiposSeguridad;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class SetepCaso3 {

    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHEquiposSegu shEquiposSegu;
    private SHEquiposSegurModal shEquiposSegurModal;

    @Given("^I loging to ' SMARTHOUSE' page$")
    public void iLogingToSMARTHOUSEPage() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I  fill properly credentials with admin user$")
    public void iFillProperlyCredentialsWithAdminUser() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^click on ' Equipos de Seguridad ' button on navigation NavigationBar$")
    public void clickOnEquiposDeSeguridadButtonOnNavigationNavigationBar() throws Throwable {
        shEquiposSegu = headerWithLogin.clickequiposTab();
    }

    @When("^click on ' Nuevo registro de equipos ' button on Accident Page$")
    public void clickOnNuevoRegistroDeEquiposButtonOnAccidentPage() throws Throwable {
        shEquiposSegurModal = shEquiposSegu.ClickRegistarEquipoBtn();
    }

    @Then("^'Crear' button from 'Registro de equipos' Modal Form  should be disable$")
    public void crearButtonFromRegistroDeEquiposModalFormShouldBeDisable() throws Throwable {
        Assert.assertTrue(shEquiposSegurModal.isCrearBtnEnable());
    }
}
