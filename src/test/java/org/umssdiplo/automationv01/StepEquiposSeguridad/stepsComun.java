package org.umssdiplo.automationv01.StepEquiposSeguridad;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class stepsComun {

    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHEquiposSegu shEquiposSegu;
    private SHEquiposSegurModal shEquiposSegurModal;
    private SHEquiposSegurModal equipment;
    private SHEquiposSegurModalView modalView;

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

    @And("^verify new registered equipment \"([^\"]*)\" is shown in equipment type page$")
    public void verifyNewRegisteredEquipmentIsShownInEquipmentTypePage(String name) throws Throwable {
        // Assert.assertTrue(equipment.verifyListEquipmentType(name), "No esta registrado");
    }

    @And("^I logOut From 'SMARTHOUSE' Page$")
    public void iLogOutFromSMARTHOUSEPage() throws Throwable {
        headerWithoutLogin.openLoginPage();
        login.clicklogOutButton();
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

    @When("^click on 'ver'$")
    public void clickOnVer() throws Throwable {
        modalView = shEquiposSegu.clickVerButton();
    }

    @And("^The modal 'Ver tipo equipo' is displayed$")
    public void theModalVerTipoEquipoIsDisplayed() throws Throwable {
        Assert.assertTrue(modalView.isModalDialogPresent(), "el modal 'Ver Tipo de Equipo' no se desplego correctamente");
        modalView.isButtonCloseVisible();
    }

    @Then("^Verify if the equipment name is correct$")
    public void verifyIfTheEquipmentNameIsCorrect() throws Throwable {
        Assert.assertEquals(modalView.getTipoEquipo(), "Protectores de Cabeza", "El nombre no es el esperado");
        modalView.closeModalView();
        Assert.assertTrue(modalView.isModalDialogPresent());

    }
    @Then("^'Crear' button from 'Registro de equipos' Modal Form  should be disable$")
    public void crearButtonFromRegistroDeEquiposModalFormShouldBeDisable() throws Throwable {
        Assert.assertTrue(shEquiposSegurModal.isCrearBtnEnable());
    }

}
