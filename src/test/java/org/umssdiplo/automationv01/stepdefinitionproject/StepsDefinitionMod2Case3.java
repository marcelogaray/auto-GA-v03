package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHAccident;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import sun.security.provider.SHA;

public class StepsDefinitionMod2Case3 {
    private SHLogin login;
    private SHAccident accident;
    private HeaderWithoutLogin headerWithoutLogin;
    private HeaderWithLogin headerWithLogin;

    @Given("^'SMARTHOUSE' page is loaded$")
    public void smarthHousePageLoad() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
        headerWithLogin = login.fillCredentials();
        accident = headerWithLogin.clickAccidentTab();
    }

    @And("^Select Accident Menu$")
    public void selectAccidentMenu() throws Throwable {
        accident.accesTabAccidents();
    }

    @And("^Click on 'Registrar accidente'$")
    public void clickRegisterAccident() throws Throwable {
        accident.openModalRegister();
    }

    @And("^Close modal 'Registro de Accidente''$")
    public void closeModalAccidentRegister() throws Throwable {
        accident.closeFromXButtonHeader();
    }

    @And("^Close modal 'Registro de Accidente' from cancel$")
    public void closeModalAccidentRegisterFromCancel() throws Throwable {
        accident.closeFromCancelButton();
    }
}