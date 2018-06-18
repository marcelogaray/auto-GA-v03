package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHAccident;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod2Case3 {
    private SHLogin login;
    private SHAccident accident;

    @Given("^'SMARTHOUSE' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.smartHousePage();
        accident = LoadPage.accidentePage();
    }

    @And("^set admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
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
    @And("^Click on 'Registrar accidente' on second time $")
    public void clickRegisterAccident2() throws Throwable {
        accident.openModalRegister();
    }
    @And("^Close modal 'Registro de Accidente' from cancel '$")
    public void closeModalAccidentRegisterFromCancel() throws Throwable {
        accident.closeFromCancelButton();
    }
}