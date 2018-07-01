package org.umssdiplo.automationv01.StepEquiposSeguridad;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class SetpCaso2 {

    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHEquiposSegu shEquiposSegu;
    private SHEquiposSegurModal shEquiposSegurModal;

    @Given("^I loging to ' SMARTHOUSE ' page$")
    public void iLogingToSMARTHOUSEPage() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin users$")
    public void iFillProperlyCredentialsWithAdminUsers() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^click on 'Equipos de Seguridad' button on  NavigationBar$")
    public void clickOnEquiposDeSeguridadButtonOnNavigationBar() throws Throwable {
        shEquiposSegu = headerWithLogin.clickequiposTab();
    }

    @And("^click on 'Ver Tipo De Equipos Registrados' button$")
    public void clickOnVerTipoDeEquiposRegistradosButton() throws Throwable {
        shEquiposSegurModal = shEquiposSegu.ClickVerTiposEquiposRegistrados();
    }

    @And("^click on 'Nuevo Registro' button$")
    public void clickOnNuevoRegistroButton() throws Throwable {
        shEquiposSegurModal = shEquiposSegu.ClickNuevoTipoEquipo();
    }

    @When("^fill dates 'Nuevo Registro'$")
    public void fillDatesNuevoRegistro() throws Throwable {
        shEquiposSegurModal.fillModalTipoEquipo();
    }

    @Then("^click on button 'Crear'$")
    public void clickOnButtonCrear() throws Throwable {
        shEquiposSegurModal = shEquiposSegu.ClickCrearTipoEquipo();
    }

    @Then("^click on button 'ok'$")
    public void clickOnButtonOk() throws Throwable {
        shEquiposSegurModal= shEquiposSegu.ClickconfirmacionTipoEquipo();
    }
}
