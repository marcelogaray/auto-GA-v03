package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Accidente.Accidente;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitiosSHAccidentes {
    private Accidente accidente;

    @Given("^'SmathHome' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        accidente = LoadPage.accidentePage();
    }

    @And("^Access to 'Accidents' link$")
    public void accessAccidentLink() throws Throwable {
        accidente.accesTabAccidents();

    }

    @And("^click into 'Registrar Accidente' link$")
    public void registrarAccidente() throws Throwable {
        accidente.clickRegistarAccidente();
    }

    @And("^verify \"Registro Accidente\" Form is Present$")
    public void VerifyRegistroAccidentForm() throws InterruptedException {
        try {
            accidente.verifyRegistroAccidente();

        } catch (Exception ex) {
        }
    }
}
