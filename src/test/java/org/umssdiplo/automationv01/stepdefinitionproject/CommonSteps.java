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

    @Then("^verify 'Editar Accidente' form modal is present$")
    public void checkEditFormModalIsPresent() throws Throwable {
        Assert.assertTrue(shAccidentEditFormModal.isEditModalPresent(), "El formulario de edición de accidentes " +
                "no se cargo correctamente");
    }

    @And("^I fill edit modal form 'Editar Accidente'$")
    public void fillEditModalForm() throws Throwable {
        shAccidentEditFormModal.fillEditModalForm();
    }

    @And("^click on 'Guardar' button on modal 'Editar Accidente'$")
    public void clickSaveEditModalForm() throws Throwable {
        shAccident = shAccidentEditFormModal.clickSaveButton();
    }

    @Then("^verify 'Título' show data title from accident on 'Editar accidente'$")
    public void checkTitleValueEditedAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getTitleValue(), "Titulo Accidente 2", "El dato de " +
                "titulo no corresponde al registro editado seleccionado.");
    }

    @Then("^verify 'Código' show data code from accident on 'Editar accidente'$")
    public void checkCodeValueEditedAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getCodeValue(), "Codigo 2", "El dato de " +
                "código no corresponde al registro editado seleccionado.");
    }

    @Then("^verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente'$")
    public void checkLevelRiskValueEditedAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getLevelRiskValue(), "2", "El dato de " +
                "nivel de riesgo no corresponde al registro editado seleccionado.");
    }

    @Then("^verify 'Descripcion' show data description from accident on 'Editar accidente'$")
    public void checkDescriptionAccidentValueEdited() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getDescriptionValue(), "Descripcion 2", "El dato de " +
                "descripción no corresponde al registro editado seleccionado.");
    }
}