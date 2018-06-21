package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class AccidentSteps {
    private SHLogin login;
    private SHAccident accident;
    private HeaderWithoutLogin headerWithoutLogin;
    private HeaderWithLogin headerWithLogin;
    private SHAccidentFormModal accidentFormModal;

    @Given("^'SMARTHOUSE' page accidents is loaded$")
    public void smarthHousePageLoad() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
        headerWithLogin = login.fillCredentials();
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